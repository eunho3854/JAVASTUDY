package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("사과");
		list1.add("딸기");
		
		// 배열의 길이 : length, 컬렉션의 길이 : size
		int size = list1.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}
		
		list1.add("바나나"); // 추가
		System.out.println(list1.get(2));
		
		list1.add(1, "체리");
		System.out.println(list1.get(1));
		
		list1.remove(1);
		System.out.println(list1.get(1));
		
		list1.clear();
		System.out.println(list1.size());

	}

}
