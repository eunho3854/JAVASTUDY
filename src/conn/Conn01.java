package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.lang.model.util.Elements;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.text.html.parser.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import sms.Response;

public class Conn01 {

	public static void main(String[] args) {
		try {
			// 1. �ּ� ���� URL Ŭ���� ���
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");
			// 2. ���� ������ ���� ��Ʈ���� ����
			HttpsURLConnection conn = 
					(HttpsURLConnection)url.openConnection();
			// 3. ���� ����(8192 Byte) �ڹٰ� ���ڸ� 2Byte�� �����ϱ� "UTF-8" �ۼ�
			BufferedReader br =
					new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input = null;
			String download = "";
			while((input = br.readLine()) != null) {
				download = download + input;
			}
			
			FileWriter fw = new FileWriter("D:/index.html");
			fw.write(download);
			
//			int today = download.indexOf("todaytemp");
//			String temp = download.substring(today+11, today+13);
//			System.out.println("오늘의 온도 : " + temp);
			
			Document doc = Jsoup.parse(download);
			org.jsoup.select.Elements temp = doc.select(".todaytemp");
			System.out.println("오늘의 온도는  : " + temp.get(0).text());
		    
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
