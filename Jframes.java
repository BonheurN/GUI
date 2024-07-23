import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Jframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("MASCOT");
		frame.setBackground(Color.green);
		frame.setSize(420,429);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageIcon image = new ImageIcon("download.jpeg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0x123456));
		frame.getContentPane().setForeground(Color.BLUE);
		
//		new Myframe();
		
	}

}
