package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;

// 응답 : 성공 (Data)
// 응답 : 실패 (Error)

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
class RespDto<T> {
	private int code; // 200(정상), 400(실패)
	private T data;
}



public class Generic04 {

	static RespDto<?> getData(String username) {
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}

}
