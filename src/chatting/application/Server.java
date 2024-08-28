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
		panel1.setBounds(0, 0, 450, 70); //(x, y, width, height)
		panel1.setLayout(null);
		add(panel1);
		
		ImageIcon iconFrame = new ImageIcon("src/icons/back_arrow.jpg"); //ImageIcon Class to hold relative path images
		Image icon1 = iconFrame.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon = new ImageIcon(icon1);
		JLabel back_arrow = new JLabel(icon);
		back_arrow.setBounds(5,20,25,25);
		panel1.add(back_arrow); //Adds icon to panel
		 
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
