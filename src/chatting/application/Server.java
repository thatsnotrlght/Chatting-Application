package chatting.application;

import javax.swing.*; //Swing builds the GUI
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class Server extends JFrame implements ActionListener{ //Server is now subclass of JFrame -> JFrame is a class from Swing

	Server() {
		//JFrame main container holding JPanel
		setLayout(null);
		setUndecorated(true); // Removes window decorations
		setSize(450, 700);
		setLocation(200, 50); //200px from left, 50px from top
		getContentPane().setBackground(Color.white);
		
		// JPanel container: Header panel (top bar)
		JPanel headerPanel = new JPanel(); //Initialization of panel
		headerPanel.setBackground(new Color(7, 94, 94));
		headerPanel.setBounds(0, 0, 450, 70); //(x, y, width, height)
		headerPanel.setLayout(null);
		add(headerPanel);
		
		// Back arrow Icon
		ImageIcon origIcon = new ImageIcon("src/icons/back_arrow.png"); //ImageIcon Class to hold relative path images
		Image scaledImage = origIcon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		JLabel back_arrow = new JLabel(scaledIcon);
		back_arrow.setBounds(5,20,25,25);
		headerPanel.add(back_arrow); //Adds icon to panel
		back_arrow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent actionEvent) {
				System.exit(0);
			}
		});
		
		// Profile Icon
		ImageIcon profIcon = new ImageIcon("src/icons/profile1.png"); //ImageIcon Class to hold relative path images & load image
		Image scaledImage_prof = profIcon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon_prof = new ImageIcon(scaledImage_prof);
		JLabel profile = new JLabel(scaledIcon_prof); //JLabel to hold image
		profile.setBounds(40,10,50,50);
		headerPanel.add(profile);
		
		// Video call icon
		ImageIcon videoIcon = new ImageIcon("src/icons/video.png"); //ImageIcon Class to hold relative path images & load image
		Image scaledImage_video = videoIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon_video = new ImageIcon(scaledImage_video);
		JLabel video = new JLabel(scaledIcon_video); //JLabel to hold image
		video.setBounds(300,10,50,50);
		headerPanel.add(video);
		
		// Call icon
		ImageIcon callIcon = new ImageIcon("src/icons/call.png"); //ImageIcon Class to hold relative path images & load image
		Image scaledImage_call = callIcon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon_call = new ImageIcon(scaledImage_call);
		JLabel call = new JLabel(scaledIcon_call); //JLabel to hold image
		call.setBounds(352,9,50,50);
		headerPanel.add(call);
		
		// More options icon
		ImageIcon optIcon = new ImageIcon("src/icons/more_opt.png"); //ImageIcon Class to hold relative path images & load image
		Image scaledImage_opt = optIcon.getImage().getScaledInstance(30, 28, Image.SCALE_DEFAULT);
		ImageIcon scaledIcon_opt = new ImageIcon(scaledImage_opt);
		JLabel opt = new JLabel(scaledIcon_opt); //JLabel to hold image
		opt.setBounds(395,10,50,50);
		headerPanel.add(opt);
		
		// JPanel Text area panel
		JPanel text_area = new JPanel();
		text_area.setBounds(5, 75, 440, 570);
		add(text_area);
		
		// JLabel contact name label
		JLabel name = new JLabel("Samuel");
		name.setForeground(Color.WHITE);
		name.setBounds(109, 15, 100, 18);
		name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
		headerPanel.add(name);
		
		// JLabel status label
		JLabel status = new JLabel("Active now");
		status.setForeground(Color.WHITE);
		status.setBounds(110, 35, 100, 18);
		status.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
		headerPanel.add(status);
		
		
		setVisible(true); // Make JFrame visible
		
//		if (optIcon.getImageLoadStatus() == MediaTracker.COMPLETE) {
//			System.out.println("Image loaded successfully.");
//			
//		} else {
//			System.out.println("Failed to load the image.");
//		}
	}
	
	public void actionPerformed(ActionEvent actionEvent) {
		
	}
	
	public static void main(String[] args) {
		new Server();
	}
}

