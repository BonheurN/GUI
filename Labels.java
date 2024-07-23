import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		label.setText("WORLD'S BEST DISHES");
		JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("cooking.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		label.setBorder(border);
		label.setIcon(image);
		label.setForeground(Color.GREEN);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(new Font( "MV Boli",Font.PLAIN, 30));
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setIconTextGap(25);
//		label.setBounds(100, 0100, 0250, 0250);
//		image.setImage(image.getImage());
		frame.setVisible(true);
//		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
//		frame.setLayout(null);
		frame.pack();
		
		
	}

}
