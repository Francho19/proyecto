package Mainjava1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SnakeGame extends JFrame implements ActionListener {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 100;

    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 6;
    private int applesEaten;
    private int appleX;
    private int appleY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        this.setTitle("Juego del Gusanito");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.add(new GamePanel());
    }

    public class GamePanel extends JPanel implements ActionListener {
        public GamePanel() {
            random = new Random();
            this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            this.setBackground(Color.black);
            this.setFocusable(true);
            this.addKeyListener(new MyKeyAdapter());
            startGame();
        }

        public void startGame() {
            newApple();
            running = true;
            timer = new Timer(DELAY, this);
            timer.start();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
        }

        public void draw(Graphics g) {
            if (running) {
                g.setColor(Color.red);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

                for (int i = 0; i < bodyParts; i++) {
                    if (i == 0) {
                        g.setColor(Color.green);
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    } else {
                        g.setColor(new Color(45, 180, 0));
                        g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    }
                }
                g.setColor(Color.white);
                g.setFont(new Font("Ink Free", Font.BOLD, 30));
                g.drawString("Puntos: " + applesEaten, 10, g.getFont().getSize());
            } else {
                gameOver(g);
            }
        }

        public void newApple() {
            appleX = random.nextInt((int) (WIDTH / UNIT_SIZE)) * UNIT_SIZE;
            appleY = random.nextInt((int) (HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        }

        public void move() {
            for (int i = bodyParts; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }

            switch (direction) {
                case 'U': y[0] = y[0] - UNIT_SIZE; break;
                case 'D': y[0] = y[0] + UNIT_SIZE; break;
                case 'L': x[0] = x[0] - UNIT_SIZE; break;
                case 'R': x[0] = x[0] + UNIT_SIZE; break;
            }
        }

        public void checkApple() {
            if ((x[0] == appleX) && (y[0] == appleY)) {
                bodyParts++;
                applesEaten++;
                newApple();
            }
        }

        public void checkCollisions() {
            for (int i = bodyParts; i > 0; i--) {
                if ((x[0] == x[i]) && (y[0] == y[i])) {
                    running = false;
                }
            }
            if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
                running = false;
            }
            if (!running) {
                timer.stop();
            }
        }

        public void gameOver(Graphics g) {
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 75));
            g.drawString("GAME OVER", WIDTH / 4, HEIGHT / 2);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (running) {
                move();
                checkApple();
                checkCollisions();
            }
            repaint();
        }

        public class MyKeyAdapter extends KeyAdapter {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new SnakeGame();
    }
} 
