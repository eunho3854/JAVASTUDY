package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge11 extends JFrame {

	private JButton btnLeft, btnRight;
	private JPanel pSouth;
	private JLabel imgLabel;
	private ImageIcon image0 = new ImageIcon("images//image0.jpg");
	private ImageIcon image1 = new ImageIcon("images//image1.jpg");
	private ImageIcon image2 = new ImageIcon("images//image2.jpg");
	private ImageIcon image3 = new ImageIcon("images//image3.jpg");
	int i = 0;
	
	public OpenChallenge11() {
		setTitle("Open Challenge 11");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imgLabel = new JLabel(image0);
		pSouth = new JPanel();
		btnLeft = new JButton(new ImageIcon("images//left.png"));
		btnRight = new JButton(new ImageIcon("images//right.png"));
				
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(imgLabel, BorderLayout.CENTER);
		c.add(pSouth, BorderLayout.SOUTH);
		pSouth.add(btnLeft);
		pSouth.add(btnRight);
		pSouth.setBackground(Color.GRAY);
		pSouth.setSize(100, 100);
		
		setVisible(true);
		
		btnLeft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnLeft) {
					 if(i == 3 ) {
						 imgLabel.setIcon(image3);
					 } else if (i==2) {
						 imgLabel.setIcon(image2);
					 } else if (i==1) {
						 imgLabel.setIcon(image1);
					 } else if (i==0) {
						 imgLabel.setIcon(image0);
					 }
					 i--;
					 if(i<0) i = 3;
				 }
			}
		});
		
		btnRight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if(e.getSource() == btnRight) {
					 if(i == 0 ) {
						 imgLabel.setIcon(image0);
					 } else if (i==1) {
						 imgLabel.setIcon(image1);
					 } else if (i==2) {
						 imgLabel.setIcon(image2);
					 } else if (i==3) {
						 imgLabel.setIcon(image3);
					 }
					 i++;
					 if(i>3) i = 0;
				 }
			}
		});
	}

	public static void main(String[] args) {
		new OpenChallenge11();
	}
}
