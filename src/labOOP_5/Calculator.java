package labOOP_5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {
	
	private JFrame frame;
	private JPanel p1, p2;
	private JTextField tf;
	private JButton[] bn;
	
	public void init() {
		frame = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		tf = new JTextField();
		bn = new JButton[16];
		
		String[] btn = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};
		
		for (int i = 0 ; i < 16 ; i++) {
			bn[i] = new JButton(btn[i]);
		}
		
		tf.setText("0.0");
		tf.setEditable(false);
		tf.setHorizontalAlignment(JLabel.RIGHT);
		
		p1.setLayout(new BorderLayout());
		p2.setLayout(new GridLayout(4, 4));
		
		p1.add(tf);
		for (int i = 0 ; i < 16 ; i++) {
			p2.add(bn[i]);
		}
		
		frame.add(p1);
		frame.add(p2, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] arg) {
		Calculator cal = new Calculator();
		cal.init();
	}
}
