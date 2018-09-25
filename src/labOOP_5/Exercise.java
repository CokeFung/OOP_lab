package labOOP_5;

import java.awt.BorderLayout;

import javax.swing.*;

public class Exercise {

	private JFrame frame;
	private JLabel lb1, lb2, lb3;
	private JTextField tf1, tf2, tf3;
	private JButton bn1, bn2, bn3, bn4;
	private JPanel p1, p2;
	
	public void init() {
		frame = new JFrame();
		lb1 = new JLabel("Number 1");
		lb2 = new JLabel("Number 2");
		lb3 = new JLabel("Result");
		tf1 = new JTextField(3);
		tf2 = new JTextField(3);
		tf3 = new JTextField(14);
		bn1 = new JButton("Add");
		bn2 = new JButton("Subtract");
		bn3 = new JButton("Multiply");
		bn4 = new JButton("Divide");
		p1 = new JPanel();
		p2 = new JPanel();
		
		tf3.setEditable(false);
		
		p1.add(lb1);
		p1.add(tf1);
		p1.add(lb2);
		p1.add(tf2);
		p1.add(lb3);
		p1.add(tf3);
		
		p2.add(bn1);
		p2.add(bn2);
		p2.add(bn3);
		p2.add(bn4);
		
		frame.add(p1);
		frame.add(p2, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] arg) {
		Exercise ex = new Exercise();
		ex.init();
	}
}
