package midtermExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CountryGUI implements ActionListener{
	private JFrame frame;
	private JLabel l1, l2;
	private JComboBox cb;
	private JTextField tf;
	private JPanel p1;
	
	private String[] country = {"<<Choose Country>>", "Thailand", "Japan", "China"};
	private String[] capitalcity = {"", "Bangkok", "Tokyo", "Beijing"};
	
	public static void main(String[] arg) {
		CountryGUI cg = new CountryGUI();
		cg.init();
	}
	
	public void init() {
		frame = new JFrame();
		l1 = new JLabel("Country");
		l2 = new JLabel("Capital city");
		cb = new JComboBox();
		tf = new JTextField("");
		p1 = new JPanel();
		
		cb.addActionListener(this);
		tf.addActionListener(this);
		
		tf.setEditable(false);
		
		for (int i = 0 ; i < 4 ; i++) {
			cb.addItem(country[i]);
		}
		
		p1.setLayout(new GridLayout(2, 2));
		l1.setHorizontalAlignment(JLabel.CENTER);
		l2.setHorizontalAlignment(JLabel.CENTER);
		
		p1.add(l1);
		p1.add(cb);
		p1.add(l2);
		p1.add(tf);
		
		frame.setTitle("Find the Capital City");
		frame.add(p1);
		frame.setSize(310, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public String getCountryName(int index) {
		return country[index];
	}

	public String getCapitalCity(String country) {
		for (int i = 0 ; i < 4 ; i++) {
			if (country.equals(this.country[i])) {
				return this.capitalcity[i];
			}
		}
		return null;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tf.setText(getCapitalCity(getCountryName(cb.getSelectedIndex())));
	}
}
