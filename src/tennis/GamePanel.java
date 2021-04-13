package tennis;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//JPanel is a container that can store a group of components. 
//The main task of JPanel is to organize components

public class GamePanel extends JPanel implements Runnable { 
	
	//prohibits us from accidently modifying width later in the program.
	//using final also enables program to run a little faster.
	static final int GAME_WIDTH = 1000;
	static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
	static final int BALL_DIAMETER = 20;
	static final int PADDLE_WIDTH = 25;
	static final int PADDLE_HEIGHT = 100;
	//Thread is the path followed when executing a program.
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Score score;
	
	

	GamePanel() {
		newPaddles();
		newBall();
		score = new Score(GAME_WIDTH, GAME_HEIGHT);
		this.setFocusable(true); //will focus on key strokes
		this.addKeyListener(new AL()); //action listener that responds to keystrokes
		this.setPreferredSize(SCREEN_SIZE);
		
		gameThread = new Thread(this);//the path followed when executing a program.
		gameThread.start();
	}
	
	public void newBall() {
		
	}
	
	public void newPaddles() {
	//instantiate instances of paddle1 and 2
						// the 0 means paddle is farthest to the left
		paddle1 = new Paddle(0, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
		paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);
		
	}
	
	public void paint(Graphics g) {
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		//pass in image with x and y coordinates = 0
		//'this' the JPanel called game panel
		g.drawImage(image, 0, 0, this);
	}
	
	public void draw(Graphics g) {
		
	}
	
	public void move() {
		
	}
	
	public void checkCollision() {
		
	}
	
	public void run() {
		//game loop
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		//1 billion nano seconds
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				move();
				checkCollision();
				repaint();
				delta--;
				
			}
		}
	}
	
	//AL means action listener
	public class AL extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			
		}
		
		public void keyReleased(KeyEvent e) {
			
		}
	}
	
	
}
