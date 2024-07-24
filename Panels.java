import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("C:\\Users\\User HP\\Downloads/thumbs.jpeg");
		
		
		JLabel label = new JLabel();
		label.setText("Hello");
		label.setIcon(image);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.RED);
		redpanel.setBounds(0, 0, 250, 250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.BLUE);
		bluepanel.setBounds(250, 0, 250, 250);
		
		JPanel greenpanel =new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0, 250, 500, 250);
		greenpanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		greenpanel.add(label);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(750, 750);
		frame.setTitle("PANELS");
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		frame.setLayout(null);
		

	}

}
