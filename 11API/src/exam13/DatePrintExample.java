package exam13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 E HH시 mm분");
		System.out.println(s.format(now));

	}

}
