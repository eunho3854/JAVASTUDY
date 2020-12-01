package ch9;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class P521 extends JFrame{

	// ������Ʈ�� ���� �ۼ��Ѵ�.
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	private Container c;
	private GridLayout grid;
	
	public P521() {
		setTitle("GridLayout Sample");
		// x ��ư Ŭ���ϸ� main�� �����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4X2 ������ GridLayout ��ġ������ ����
		BorderLayout border = new BorderLayout();
		// grid.setVgap(5); // ���� ������ ���� ������ 5 �ȼ��� ����
		setSize(300, 200);

		// 1. �ʿ��� ������Ʈ�� �޸𸮿� �ε�.
		initObject();
		
		// 2. ��ġ������ ����
		initSetting();
		
		// 3. ��ġ
		initBatch();
		
		setVisible(true);	
	}
	
	// ������Ʈ Ȥ�� �����̳� �ʱ�ȭ
	private void initObject() {
		laName = new JLabel("�̸�");
		laNum = new JLabel("�й�");
		laClass = new JLabel("�а�");
		laSubject = new JLabel("����");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		tfClass = new JTextField("");
		tfSubject = new JTextField("");
		grid = new GridLayout(4,2);
	}
	
	private void initSetting() {
		c = getContentPane();
		grid.setVgap(5);
		c.setLayout(grid);
	}
	
	private void initBatch() {
		c.add(laName);
		c.add(tfName);
		c.add(laNum);
		c.add(tfNum);
		c.add(laClass);
		c.add(tfClass);
		c.add(laSubject);
		c.add(tfSubject);
	}
	
	public static void main(String[] args) {
		new P521();
	}

}
