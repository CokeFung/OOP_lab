package midtermExam;

import java.awt.BorderLayout;

import javax.swing.*;

public class SearchEngineGUI {
	private JFrame frame;
	private JLabel la;
	private JTextField tf;
	private JButton bn;
	private JTextArea ta;
	private JScrollPane scroll;
	private JPanel p;
	
	public static void main(String[] arg) {
		SearchEngineGUI se = new SearchEngineGUI();
		se.init();
;	}
	
	public void init() {
		frame = new JFrame();
		la = new JLabel("Search");
		tf = new JTextField(12);
		bn = new JButton("GO!");
		ta = new JTextArea(10, 10);
		p = new JPanel();
		scroll = new JScrollPane(ta);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		p.add(la);
		p.add(tf);
		p.add(bn);
		
		frame.add(p);
		frame.add(scroll, BorderLayout.SOUTH);
		
		frame.setTitle("Search Engine");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
