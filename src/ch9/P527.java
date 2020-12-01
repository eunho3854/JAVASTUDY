package ch9;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class P527 extends JFrame{
	
	public P527() {
		setTitle("Open Challenger 9");
		setSize(400,500);
		
		Container c = getContentPane();
		
		JPanel jp1 = new JPanel();
		c.add(jp1, Batch.NORTH);
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		JLabel jp2 = new JLabel("Hello");
		JLabel jp3 = new JLabel("Java");
		JLabel jp4 = new JLabel("Love");
		JPanel jpp = new JPanel();
		c.add(jpp, Batch.CENTER);
		
		jpp.setLayout(null);
		jp2.setLocation(150,0);
		jp2.setSize(50,50);
		jpp.add(jp2);
		
		jp3.setLocation(30,250);
		jp3.setSize(50,50);
		jpp.add(jp3);
		
		jp4.setLocation(300,200);
		jp4.setSize(50,50);
		jpp.add(jp4);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new P527();
	}

}
