package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graph extends JFrame {

	private JButton btn;
	private JPanel panel;
	ArrayList<Integer> a = new ArrayList<Integer>();

	public Graph() {

		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		a.add(50);

		setTitle("그래프 그리기");
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		ResultPanel resultPanel = new ResultPanel();
		c.setLayout(new BorderLayout());

		panel = new JPanel();
		btn = new JButton("그래프 나오기");
		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);

		btn.addActionListener(new GraphAction(resultPanel));
		
		
		
		setVisible(true);
	}

	

	public static void main(String[] args) {
		new Graph();
	}

	class ResultPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			g.drawLine(50, 250, 350, 250);

			for (int i = 1; i < 11; i++) {
				g.drawString(i + 10 + "", 25, 255 - (20 * i));
				g.drawLine(50, 250 - (20 * i), 350, 250 - (20 * i));
			}

			g.drawLine(50, 20, 50, 250);
			g.drawString("1번", 100, 270);
			g.drawString("2번", 200, 270);
			g.drawString("3번", 300, 270);
			g.drawString("4번", 400, 270);
			g.drawString("5번", 500, 270);
			g.setColor(Color.BLUE);

			for (int i = 0; i < a.size(); i++) {
				g.fillRect(110 + i * 100, 250, 250 - a.get(i) * 2, a.get(i) * 2);
			}
		}

	}
	
	class GraphAction implements ActionListener {

		ResultPanel resulPanel;

		public GraphAction(ResultPanel resulPanel) {
			this.resulPanel = resulPanel;
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				resulPanel.repaint();
			} catch (Exception e2) {
				System.out.println("하기싫어");
			}

		}

	}
}
