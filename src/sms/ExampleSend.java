package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */
public class ExampleSend {
	
	static void ��������(String to, String text) {
//		���⿡ ���� �ڵ� �� ������ ��. (�Լ�ȭ)
		String api_key = "NCSBJ0WWH1LZENN8";
	    String api_secret = "CZC2IJ3SFZZ4UUDYQOBGWM3RWDX7M2MQ";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", to);
	    params.put("from", "010630003854");
	    params.put("type", "LMS");
	    params.put("text", text);
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println("�޽����� ���۵Ǿ����ϴ�.");
	      System.out.println(obj.toString());
	      // 1�� obj(���ڿ�) -> �ڹ� ������Ʈ
	      // 2�� error�� �ִ��� Ȯ��
	      // 3�� DB insert
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	}
	
  public static void main(String[] args) {
    ��������("01085312625", "�׽�Ʈ");
  }
}