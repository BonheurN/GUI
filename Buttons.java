
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame implements ActionListener {

		
		
	    JLabel label; 
	    JButton button;
		Buttons(){
			
		ImageIcon icon1 = new ImageIcon("C:\\Users\\User HP\\Downloads/goldthumb.jpeg");
		ImageIcon icon2 = new ImageIcon("ATM.jpeg");
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 100, 100);
		label.setVisible(true);
		
		button = new JButton();
		button.setBounds(100, 200, 300, 200);
		button.addActionListener(this);
		button.setText("Click here!");
		button.setFocusable(false);
		button.setIcon(icon1);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic sans",Font.BOLD,25));
//		button.setIconTextGap(-05);
		button.setBackground(Color.LIGHT_GRAY);
		button.setForeground(Color.cyan);
		button.setBorder(BorderFactory.createEtchedBorder());
		
//		label = new JLabel();
//		label.setText();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.add(button);
		this.add(label);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()== button) {
			System.out.println("Hello");
			label.setVisible(true);
//			button.setEnabled(false);
		}
		
		
	}

}
