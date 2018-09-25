package labOOP_7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class Calculator implements ActionListener {
	private JFrame frame;
	private JButton[] bn;
	private JTextField tf;
	private JPanel p1, p2;
	private double tmp;
	private int state;
	private String operator;
	
	public static void main(String[] arg) {
		Calculator cal = new Calculator();
		cal.init();
	}
	
	public void init() {
		tmp = 0;
		state = 0;
		operator = "";
		String[] value = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};
		frame = new JFrame();
		tf = new JTextField("0.0");
		p1 = new JPanel();
		p2 = new JPanel();
		bn = new JButton[16];
		for (int i = 0; i < 16 ; i++) {
			bn[i] = new JButton(value[i]);
			bn[i].addActionListener(this);
			p2.add(bn[i]);
		}
		
		p2.setLayout(new GridLayout(4, 4));
		p1.setLayout(new BorderLayout());
		
		tf.setEditable(false);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		p1.add(tf);
		
		frame.add(p1);
		frame.add(p2, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		int zeroError = 0;
		if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/") || cmd.equals("=")) {
			if ((state == 0 || state == 1) && !cmd.equals("=")) {
				state = 1;
				operator = cmd;
				tmp = Double.parseDouble(tf.getText());
			}
			else if (state == 2) {
				state = 0;
				if (operator.equals("+"))
					tmp += Double.parseDouble(tf.getText());
				else if (operator.equals("-"))
					tmp -= Double.parseDouble(tf.getText());
				else if (operator.equals("*"))
					tmp *= Double.parseDouble(tf.getText());
				else if (operator.equals("/"))
					if (Double.parseDouble(tf.getText()) == 0) { zeroError = 1; }
					else { tmp/= Double.parseDouble(tf.getText());  zeroError = 0; }
			}
			
			if (zeroError == 1) {
				tf.setText("Zero Division Error");
				state = 0;
			}
			else {
				if ((int)tmp == tmp)
					tf.setText((int)tmp + "");
				else
					tf.setText(tmp + "");
			}
		}
		else {
			if (state == 0) {
				tf.setText(cmd);
				state = 1;
			}
			else if (state == 1) {
				tf.setText(cmd);
				state = 2;
			}
			else if (state == 2) {
				tf.setText(tf.getText() + cmd);
			}
		}
		
		
		
		
		System.out.println("State : " + state);
	}
}
