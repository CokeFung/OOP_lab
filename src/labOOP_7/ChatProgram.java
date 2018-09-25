package labOOP_7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ChatProgram implements ActionListener , KeyListener{
	private JFrame frame;
	private JTextArea tf1;
	private JTextField tf2;
	private JButton bn1, bn2, bn3;
	private JPanel p1, p2;
	private JScrollPane scroll;
	
	public static void main(String[] arg) {
		ChatProgram chat = new ChatProgram();
		chat.init();
	}
	
	public void init() {
		frame = new JFrame();
		bn1 = new JButton("Submit");
		bn2 = new JButton("Cancel");
		bn3 = new JButton("Exit");
		tf1 = new JTextArea(15, 40);
		tf2 = new JTextField();
		p1 = new JPanel();
		p2 = new JPanel();
		scroll = new JScrollPane(tf1);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		tf2.setBackground(Color.green);
		tf1.setEditable(false);
		
		bn1.addActionListener(this);
		bn2.addActionListener(this);
		bn3.addActionListener(this);
		tf2.addKeyListener(this);
		
		p1.setLayout(new BorderLayout());
		p1.add(scroll);
		p1.add(tf2, BorderLayout.SOUTH);
		
		p2.add(bn1);
		p2.add(bn2);
		p2.add(bn3);
		
		frame.add(p1);
		frame.add(p2, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setTitle("Chat Program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if (cmd.equals("Submit") && !tf2.getText().trim().equals("")) {
			String tmp = tf1.getText();
			tmp = tmp + tf2.getText() + "\n";
			tf1.setText(tmp);
			tf2.setText("");
		}
		else if (cmd.equals("Cancel")) {
			tf2.setText("");
		}
		else if (cmd.equals("Exit")) {
			System.exit(0);
		}
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int push = arg0.getKeyCode();
		if (push == KeyEvent.VK_ENTER && !tf2.getText().trim().equals("")) {
			String tmp = tf1.getText();
			tmp = tmp + tf2.getText() + "\n";
			tf1.setText(tmp);
			tf2.setText("");
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
