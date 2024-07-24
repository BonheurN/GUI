import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Gym {
	public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, FileNotFoundException  {
		
		
	ImageIcon cent = new ImageIcon("download.jpeg");	
	Border border = BorderFactory.createLineBorder(Color.gray,5);
	JLabel label = new JLabel();	
	label.setText("Number one call center globally");
	label.setIcon(cent);
	label.setHorizontalTextPosition(JLabel.CENTER);
	label.setVerticalTextPosition(JLabel.TOP);
	label.setForeground(Color.GREEN);
	label.setFont(new Font("MV Boli", Font.PLAIN,20));
	label.setBackground(new Color(0x123456));
	label.setOpaque(true);
	label.setIconTextGap(25);
	label.setBorder(border);
	label.setVerticalAlignment(JLabel.CENTER);
	label.setHorizontalAlignment(JLabel.CENTER);
//	label.setBounds(100, 100, 400, 400);
		
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setTitle("Concentrix");
//	frame.setSize(400,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.add(label);
//	frame.setLayout(null);
	
	ImageIcon image = new ImageIcon("contentrix.jpeg");
	frame.setIconImage(image.getImage());
	frame.getContentPane().setBackground(new Color(0,153,250));
		
		frame.pack();
		     
	}
}
	


