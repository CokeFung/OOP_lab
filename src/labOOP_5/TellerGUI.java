package labOOP_5;

import java.awt.*;

import javax.swing.*;
	
public class TellerGUI {
		
		private JFrame frame;
		private JLabel lb1, lb2, err;
		private JTextField tf1, tf2;
		private JButton bn1, bn2, bn3;
		private JPanel p1, p2, p3;
		
		public void init() {
			frame = new JFrame();
			lb1 = new JLabel("Balance:");
			lb2 = new JLabel("Amount:");
			err = new JLabel("adasd");
			tf1 = new JTextField("6000");
			tf2 = new JTextField();
			bn1 = new JButton("Deposit");
			bn2 = new JButton("Withdraw");
			bn3 = new JButton("Exit");
			p1 = new JPanel();
			p2 = new JPanel();
			p3 = new JPanel();
			
			tf1.setEditable(false);
			p1.setLayout(new GridLayout(2, 2));
			
			err.setHorizontalAlignment(JLabel.CENTER);
			err.setForeground(Color.red);
			
			p1.add(lb1);
			p1.add(tf1);
			p1.add(lb2);
			p1.add(tf2);
			
			p2.add(bn1);
			p2.add(bn2);
			p2.add(bn3);
			
			p3.setLayout(new BorderLayout());
			p3.add(p1);
			p3.add(p2, BorderLayout.SOUTH);
			
			
			frame.add(p3);
			frame.add(err, BorderLayout.SOUTH);
				
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
		
		public static void main(String[] arg) {
			TellerGUI teller = new TellerGUI();
			teller.init();
		}
}
