package ch9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing02 extends JFrame{
	
	public Swing02() {
		setTitle("�÷ο� ���̾ƿ�");
		setSize(500, 500);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JPanel jp1 = new JPanel();
		
		c.add(btn1, Batch.NORTH);
		c.add(btn2, Batch.CENTER);
		c.add(jp1, Batch.South);
		
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing02();
	}
}
