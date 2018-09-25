package labOOP_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;


public class TellerGUI extends MouseAdapter implements ActionListener{
	
	private JFrame frame;
	private JButton bn1, bn2, bn3;
	private JLabel lb1, lb2, err;
	private JTextField tf1, tf2;
	private JPanel p1, p2, p3;
	private Account acc;
	
	public void init() {
		frame = new JFrame();
		bn1 = new JButton("Deposit");
		bn2 = new JButton("Withdraw");
		bn3 = new JButton("Exit");
		tf1 = new JTextField("0.0");
		tf2 = new JTextField("0.0");
		lb1 = new JLabel("Balance: ");
		lb2 = new JLabel("Amount: ");
		err = new JLabel("\n");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		acc = new Account();
		
		tf1.setEditable(false);
		p1.setLayout(new GridLayout(2, 2));
		p3.setLayout(new BorderLayout());
		
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		tf2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tf2.setText("");
			}
		});
		
		err.setHorizontalAlignment(JLabel.CENTER);
		err.setForeground(Color.red);
		
		p1.add(lb1);
		p1.add(tf1);
		p1.add(lb2);
		p1.add(tf2);
		
		p2.add(bn1);
		p2.add(bn2);
		p2.add(bn3);
		
		p3.add(p1);
		p3.add(p2, BorderLayout.SOUTH);
		
		frame.add(p3);
		frame.add(err, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] arg) {
		TellerGUI tell = new TellerGUI();
		tell.init();
	}
	
 	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		String cmd = ev.getActionCommand();
		
		if (cmd.equals("Exit"))
		{
			System.exit(0);
		}
		else if (cmd.equals("Deposit")) {
			double tmp = Double.parseDouble(tf2.getText());
			if (tmp >= 0) {
				err.setText("\n");
				acc.deposit(tmp);
				tf1.setText(acc.getBalance() + "");
			}
			else {
				err.setText("Invalid Amount");
			}
		}
		else if (cmd.equals("Withdraw")) {
			double tmp = Double.parseDouble(tf2.getText());
			if (tmp >= 0 && acc.getBalance() >= tmp) {
				err.setText("\n");
				acc.withdraw(tmp);
				tf1.setText(acc.getBalance() + "");
			}
			else {
				if (tmp < 0) {
					err.setText("Invalid Amount");
				}
				else if(tmp > acc.getBalance()) {
					err.setText("Not enough money");
				}
			}
		}
	}


}
