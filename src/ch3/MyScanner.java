package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {
	
	public String getData() {
		InputStream in = System.in;
		// ���ڸ� �޴µ� �ƽ�Ű �ڵ�� ����.
		InputStreamReader ir = new InputStreamReader(in);
		// ���� : ���� ���� �� ��. �ϳ��� ����.
		BufferedReader br = new BufferedReader(ir);
		// ���۷� ������ �����͸� ���������� ���� �� ����.
		
		try {
			br.readLine(); // ���۸� ������°�
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����");
		}
		return "";
	}
}
