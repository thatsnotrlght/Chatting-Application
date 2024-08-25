package chatting.application;
import java.awt.Color;

import javax.swing.*; //Swing builds the GUI 
import java.awt.*;

public class Server extends JFrame{ //Server is now subclass of JFrame -> JFrame is a class from Swing

	Server() {
		//JFrame main container holding JPanel
		setLayout(null);
		setSize(450, 700);
		setLocation(200, 50); //200px from left, 50px from top
		getContentPane().setBackground(Color.white);
		
		//JPanel container
		JPanel panel1 = new JPanel(); //Initialization of panel
		panel1.setBackground(new Color(7, 94, 94));
		panel1.setBounds(0, 100, 450, 70); //(x, y, width, height)
		add(panel1);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
