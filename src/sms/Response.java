package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GGsmudYHbJrzPd\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		System.out.println(data);
		
		Response res = new Response();
		
		String[] code = data.split(",");
		data = data.substring(1,90);
		
		System.out.println(data);
		res.group_id = code[0].split(":")[1];
		res.group_id = res.group_id.substring(1,17);
		res.error_list = code[1].split(":")[2];
		res.error_list = res.error_list.replace("}", "");
		res.error_list = res.error_list.substring(1,5);
		res.success_count = code[2].split(":")[1];
		res.error_count = code[3].split(":")[1];
		res.error_count = res.error_count.replaceAll("}", "");
		
		System.out.println();
		System.out.println("group_id : " + res.group_id);
		System.out.println("error_list : " + res.error_list);
		System.out.println("success_count : " + res.success_count);
		System.out.println("error_count : " + res.error_count);
		
	}
}
