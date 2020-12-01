package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

class Comment {
	private int id;
	private String comment;
}

public class json01 {
	
	public static void main(String[] args) {
		Comment ct1 = new Comment(1, "���1");
		
		// �ڹ� -> JSON (String)
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);
		
		// JSON(String) -> �ڹ�
		// getter,setter �� �ʿ� !
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getComment());
	}
}
