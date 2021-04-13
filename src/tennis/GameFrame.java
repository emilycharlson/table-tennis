package tennis;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

// JFrame is a top-level container that provides a window on the screen 
public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	
	GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//will adjust accordingly to accommodate the size of the game panel.
		//pack fits around the game panel
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
}
