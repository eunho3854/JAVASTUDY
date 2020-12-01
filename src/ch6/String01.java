package ch6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// DTO = Data Transfer Object ��ſ��� ���� ����.
class UserDto {
	private int id;
	private String name;
}


public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:���� ��ȣ";
		String eunho[] = data.split(",");
		
		String euno[] = eunho[0].split(":");
		String eunoeunho[] = eunho[1].split(":");
		
		// �Ľ� parsing(�����м�)
		UserDto dto = new UserDto();
		dto.setId(Integer.parseInt(euno[1]));
		dto.setName(eunoeunho[1]);
		System.out.println(dto);
	}

}
