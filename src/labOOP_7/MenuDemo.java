package labOOP_7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuDemo implements ActionListener{
	private JFrame frame;
	private JMenuBar mb;
	private JMenu m1, m2, m11;
	private JMenuItem m12, m13, m14;
	private JFileChooser fc;
	
	public static void main(String[] arg) {
		MenuDemo menu = new MenuDemo();
		menu.init();
	}
	
	public void init() {
		frame = new JFrame();
		mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Help");
		m11 = new JMenu("New");
		m12 = new JMenuItem("Open");
		m13 = new JMenuItem("Print");
		m14 = new JMenuItem("Exit");
		fc = new JFileChooser();
		
		m14.addActionListener(this);
		m12.addActionListener(this);
		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		
		mb.add(m1);
		mb.add(m2);
		
		frame.setTitle("MenuTitle");
		frame.setSize(300, 300);
		frame.setJMenuBar(mb);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String cmd = arg0.getActionCommand();
		if (cmd.equals("Exit")) {
			System.exit(0);
		}
		else if (cmd.equals("Open")) {
			fc.showOpenDialog(frame);
		}
	}
}
