package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : SimpleDateFormatMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 6.
 * @story     : SimpleDateFormat
 */
public class SimpleDateFormatMain {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dF1 = new SimpleDateFormat(); // 15. 10. 6 오후 4:21
		SimpleDateFormat dF2 = new SimpleDateFormat("yyyy-MM-dd"); // 2015-10-06
		SimpleDateFormat dF3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); // 2015년 10월 06일 화요일
		SimpleDateFormat dF4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 2015-10-06 16:21:43
		SimpleDateFormat dF5 = new SimpleDateFormat("yyyy-MM-dd [a]HH:mm:ss"); //2015-10-06 [오후]16:21:43
		System.out.println(dF1.format(date));
		System.out.println(dF2.format(date));
		System.out.println(dF3.format(date));
		System.out.println(dF4.format(date));
		System.out.println(dF5.format(date));
	}
}
