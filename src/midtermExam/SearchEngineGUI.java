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
	private JPanel p1, p2, p3;
	private JRadioButton r1, r2;
	private ButtonGroup gb;
	
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
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		r1 = new JRadioButton("Yahoo");
		r2 = new JRadioButton("Google");
		gb = new ButtonGroup();
		scroll = new JScrollPane(ta);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		p1.add(la);
		p1.add(tf);
		p1.add(bn);
		
		p2.add(r1);
		p2.add(r2);
		
		p3.setLayout(new BorderLayout());
		p3.add(p1);
		p3.add(p2, BorderLayout.SOUTH);
		
		gb.add(r1);
		gb.add(r2);
		
		frame.add(p3);
		frame.add(scroll, BorderLayout.SOUTH);
		
		frame.setTitle("Search Engine");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
