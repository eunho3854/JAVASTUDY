package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

	public static void main(String[] args) {
		InputStream in = System.in;
		// 문자를 받는데 아스키 코드로 받음.
		InputStreamReader ir = new InputStreamReader(in);
		// 단점 : 여러 개는 안 됨. 하나만 가능.
		BufferedReader br = new BufferedReader(ir);
		// 버퍼로 받으면 데이터를 가변적으로 받을 수 있음.
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
