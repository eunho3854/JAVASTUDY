package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {

	Street02 street = this; // �ܺ� Ŭ������ ������ �� �ʿ�
	int x = 340;
	int y = 20;
	boolean isRunning = true;
	Container c;
	JButton btn;

	public Street02() {
		setTitle("��ǳ");
		setSize(900, 300);
		setLocationRelativeTo(null); // ����� ���߾ӿ� JFrame ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.add(new GamePanel());
		setVisible(true);
	}

	// JPanel�� ����Ʈ ���̾ƿ� = FlowLayout 
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("����");
			add(btn);

			setFocusable(true);
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = false;
					// ��� isRunning = !isRunning
				}
			});

			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x ��ǥ : " + x);

					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() { // ������� ������ ���� ����

							@Override
							public void run() {
								while (isRunning) {
									x = x + 10;
									repaint();
									try {
										Thread.sleep(20);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
							}
						}).start();
					}

					if (x < 340) {
						x = 340;
						return;
					} else if (x > 640) {
						x = 640;
						return;
					}

					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						x = x + 10;
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						x = x - 10;
					}

					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}

	public static void main(String[] args) {
		new Street02();
	}

}
