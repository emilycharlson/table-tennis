package tennis;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle {
	
	Random random;
	int xVelocity;
	int yVelocity;
	
	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		//local variable for the ball constructor
		int randomXDirection = random.nextInt(2); 
		int randomYDirection = random.nextInt(2); 
		//either 0 or 1
		//if 0, ball goes left
		//if 1, ball goes right
		if(randomXDirection == 0) {
			randomXDirection--;
			setXDirection(randomXDirection);
		} else if(randomYDirection == 0) {
			randomYDirection--;
			setYDirection(randomYDirection);
		} 
	}
	
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
		
	}
	
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	
	public void move() {
		x += xVelocity;
		y += yVelocity;
		
	}
	
	public void draw(Graphics g) {
		//set color
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
		
	}
	
	

}
