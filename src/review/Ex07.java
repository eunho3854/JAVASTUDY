package review;

/**
 * 
 * @author ����ȣ
 * static�� main�� �����ϱ� ���� �޸𸮿� �ε��ȴ�.
 * �� ���� static �����ʹ� �ߺ��� �� ����. �� �� ���� �޸𸮿� �ε��Ǳ� ����!!
 * �� ���� �޸𸮿� �� �� ����. => static �����ʹ� ������ �� �ִ� ������!!
 * 
 * heap�� new�� �� �޸𸮿� ���. Ÿ�̹��� ������ static���� ����.
 * �����ڰ� ���ϴ� ��ŭ�� �޸𸮿� �ε��� �� ����.
 * �����Ǵ� �����Ͱ� �ƴϰ� ������ �����͸� ���� ������ ����.
 * �ڵ��� ���忡�� �ҳ�Ÿ�� 3�븦 ���� �ǸŸ� �ϸ� 3���� �ҳ�Ÿ�� �ٸ� �ҳ�Ÿ
 */

public class Ex07 {

	int num = 10;	// �� �� new �ؾ� �� (heap ����, �ʵ�, ������Ƽ)
	static int sum = 20; // main�� ���۵Ǳ� ���� ��.
	
	public static void main(String[] args) {
		System.out.println(Ex07.sum);
		Ex07 e = new Ex07();
		System.out.println(e.num);
	}

}
