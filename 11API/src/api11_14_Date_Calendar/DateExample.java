package api11_14_Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println("Now1 : " + strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println("Now2 : " + strNow2);

	}

}
