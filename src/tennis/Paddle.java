package tennis;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
	
	// for paddle id's
	int id;
	int yVelocity;
	int speed = 10;
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
		super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e) {
		//reads the content of the id variable (1 or 2)
		//W moves up, S moves down
		switch(id) {
		//paddle 1
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(speed);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(speed);
				move();
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		
		switch(id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(0);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(0);
				move();
			}
			break;
		}
		
	}
	
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
		
	}
	
	public void move() {
		y = y + yVelocity;
		
	}
	
	public void draw(Graphics g) {
		if(id == 1) {
			g.setColor(Color.blue);
			g.fillRect(x, y, width, height);
		} else {
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
		}
			
		
	}
	
	
	
	

}
