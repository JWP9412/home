package exam13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(s.format(now));

	}
  
}
