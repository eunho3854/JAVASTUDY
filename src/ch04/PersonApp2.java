package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		// �⺻ ������ -> Ŭ������() -> ��������
		Person p1 = new Person("�ֽ���", "�ǻ�", 45, '��', "A");
		Person p2 = new Person("�̹̳�", "���� ����", 28, '��', "O");
		Person p3 = new Person("��̳�", "����", 47, '��', "AB");
		p1.preview();
		p2.preview();
		p3.preview();
	}
}
