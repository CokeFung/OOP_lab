package labOOP_5;

import java.awt.Dimension;

import javax.swing.*;

public class MenuDemo {

	private JFrame frame;
	private JMenuBar mb;
	private JMenu m1, m2;
	private JMenuItem i11, i12, i13, i14;
	private JMenu i21, i22;
	private JCheckBoxMenuItem i23;
	private JMenuItem i211, i212, i213;
	
	
	public void init() {
		frame = new JFrame();
		mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Help");
		i11 = new JMenuItem("New");
		i12 = new JMenuItem("Open");
		i13 = new JMenuItem("Print");
		i14 = new JMenuItem("Exit");
		i21 = new JMenu("Software");
		i22 = new JMenu("Hardware");
		i23 = new JCheckBoxMenuItem("Check it");
		i211 = new JMenuItem("Unix");
		i212 = new JMenuItem("Linux");
		i213 = new JMenuItem("Solaris");
		
		i21.add(i211);
		i21.add(i212);
		i21.add(i213);
		
		
		m1.add(i11);
		m1.add(i12);
		m1.add(i13);
		m1.add(i14);
		
		m2.add(i21);
		m2.add(i22);
		m2.add(i23);
		
		mb.add(m1);
		mb.add(m2);
		
		frame.setJMenuBar(mb);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.setVisible(true);
	}
	
	public static void main(String[] arg) {
		MenuDemo menu = new MenuDemo();
		menu.init();
	}
}
