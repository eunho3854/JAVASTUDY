package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Time extends Thread {

	private JLabel timer;

	LocalDateTime now = LocalDateTime.now();
	int hour = now.getHour();
	int min = now.getMinute();
	int sec = now.getSecond();

	public Time(JLabel timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		while (true) {
			timer.setText(hour + " : " + min + " : " + sec);
			sec++;
			if(sec == 60) {
				sec = 0;
				min++;
			} else if (min == 60) {
				sec = 0;
				min = 0;
				hour++;
			} else if (hour == 24) {
				sec = 0;
				min = 0;
				hour = 0;
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
	}
}

public class Clock extends JFrame {

	public Clock() {
		setTitle("디지털 시계 만들기");
		setSize(500, 300);

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());

		JLabel timer = new JLabel();
		timer.setFont(new Font("Gothic", Font.BOLD, 80));
		ct.add(timer);

		Time th = new Time(timer);

		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		new Clock();
	}

}
