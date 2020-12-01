package ch9;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class Swing04 extends JFrame {

	private JPanel topPanel, centerPanel;
	private JButton openBtn, ReadBtn, closeBtn;
	private Container c;
	private BorderLayout border;
	private JLabel helloLabel, javaLabel, loveLabel;
	
	public Swing04() {
		
		initObject();

		initSetting();
		
		initBatch();
	}
	
	public void initObject() {
		topPanel = new JPanel();
		centerPanel = new JPanel();
		openBtn = new JButton("Open");
		ReadBtn = new JButton("Read");
		closeBtn = new JButton("Close");
		
		helloLabel = new JLabel("Hello");
		javaLabel = new JLabel("Java");
		loveLabel = new JLabel("Love");
	}
	
	public void initSetting() {
		setTitle("Open Challenger 9");
		setSize(400, 500);
		
		c.add(topPanel, BorderLayout.NORTH);
		c.add(centerPanel, BorderLayout.CENTER);
		
		topPanel.setBackground(Color.GRAY);
		topPanel.add(openBtn);
		topPanel.add(ReadBtn);
		topPanel.add(closeBtn);
		
		centerPanel.add(helloLabel);
		centerPanel.add(javaLabel);
		centerPanel.add(loveLabel);
		
		setVisible(true);
	}
	
	public void initBatch() {
		centerPanel.setLayout(null);
		helloLabel.setBounds(138, 10, 57, 15);
		javaLabel.setBounds(12, 152, 57, 15);
		loveLabel.setBounds(291, 103, 57, 15);
	}
	
	public static void main(String[] args) {
		new Swing04();
	}
}
