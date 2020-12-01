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

	// 컴포넌트는 힙에 작성한다.
	private JLabel laName, laNum, laClass, laSubject;
	private JTextField tfName, tfNum, tfClass, tfSubject;
	private Container c;
	private GridLayout grid;
	
	public P521() {
		setTitle("GridLayout Sample");
		// x 버튼 클릭하면 main이 종료됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4X2 격자의 GridLayout 배치관리자 생성
		BorderLayout border = new BorderLayout();
		// grid.setVgap(5); // 격자 사이의 수직 간격을 5 픽셀로 설정
		setSize(300, 200);

		// 1. 필요한 오브젝트를 메모리에 로딩.
		initObject();
		
		// 2. 배치관리자 세팅
		initSetting();
		
		// 3. 배치
		initBatch();
		
		setVisible(true);	
	}
	
	// 컴포넌트 혹은 컨테이너 초기화
	private void initObject() {
		laName = new JLabel("이름");
		laNum = new JLabel("학번");
		laClass = new JLabel("학과");
		laSubject = new JLabel("과목");
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
