package labOOP_5;

import java.awt.*;

import javax.swing.*;

public class Chat {
	
	private JFrame frame;
	private JPanel p1, p2;
	private JTextArea ta;
	private JTextField tf;
	private JButton bn1, bn2, bn3;
	
	public void init() {
		
		frame = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		ta = new JTextArea(5, 0);
		tf = new JTextField();
		bn1 = new JButton();
		bn2 = new JButton();
		bn3 = new JButton();
		
		frame.setTitle("Chat Program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1.setLayout(new BorderLayout());
		bn1.setText("Submit");
		bn2.setText("Cancel");
		bn3.setText("Exit");
		
		tf.setBackground(Color.green);
		
		p1.add(ta);
		p1.add(tf, BorderLayout.SOUTH);
		
		p2.add(bn1);
		p2.add(bn2);
		p2.add(bn3);
		
		frame.add(p1);
		frame.add(p2, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		tf.requestFocus();
	}
}
