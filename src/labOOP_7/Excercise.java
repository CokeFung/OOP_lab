package labOOP_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Excercise extends MouseAdapter implements ActionListener {

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
		tf1 = new JTextField(4);
		tf2 = new JTextField(4);
		tf3 = new JTextField(12);
		bn1 = new JButton("Add");
		bn2 = new JButton("Subtract");
		bn3 = new JButton("Multiply");
		bn4 = new JButton("Divide");
		p1 = new JPanel();
		p2 = new JPanel();
		
		tf3.setEditable(false);
		
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		bn4.addActionListener(this);
		
		tf1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tf1.setText("");
			}
		});
		
		tf2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tf2.setText("");
			}
		});
		
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
		Excercise ex = new Excercise();
		ex.init();
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String cmd = arg0.getActionCommand();
		if (cmd.equals("Add")) {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText((a+b) + "");
		}
		else if (cmd.equals("Subtract")) {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText((a-b) + "");
		}
		else if (cmd.equals("Multiply")) {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			tf3.setText((a*b) + "");
		}
		else if (cmd.equals("Divide")) {
			double a = Double.parseDouble(tf1.getText());
			double b = Double.parseDouble(tf2.getText());
			
			if (b == 0) {
				tf3.setText("Zero Division Error");
			}
			else {
				tf3.setText((a/b) + "");
			}
			
		}
	}
	
	
}
