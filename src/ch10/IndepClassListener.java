package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {

	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("으노");
		btn.addActionListener(new MyActionListner());
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}

class MyActionListner implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("으노"))
			b.setText("왜 불렀어~?");
		else
			b.setText("으노");
	}
}
