package calendar;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @file_name : CalendarMain.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 6.
 * @story : Calendar 클래스
 */
public class CalendarMain implements Serializable{
	/**
	 * 시작일 (2015-09-14)로부터 오날까지 일수 구하기 종료일 (2016-02-05)에서 오늘날짜까지 남은 일수 구하기
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DayCounter counter = new DayCounter();
		String day;
		System.out.println("특정기간을 입력하세요");
		day = scanner.next();
		StringTokenizer token = new StringTokenizer(day, "[-.]");
		if (token.countTokens() != 1) {
			counter.counter(Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()));
		} else {
			counter.counter(Integer.parseInt(day.substring(0, 4)), Integer.parseInt(day.substring(4, 6)), Integer.parseInt(day.substring(6)));
		}
	}
}

class DayCounter {
	Calendar today = Calendar.getInstance();
	Calendar dDay = Calendar.getInstance();

	public void counter(int year, int month, int day) {
		dDay.set(year, month - 1, day);
		if (today.getTimeInMillis() < dDay.getTimeInMillis()) {
			System.out.println(Math.abs((int) Math.ceil((today.getTimeInMillis() - dDay.getTimeInMillis()) / (24 * 60 * 60 * 1000))) + "일 남았습니다.");
		} else {
			System.out.println((int) Math.ceil((today.getTimeInMillis() - dDay.getTimeInMillis()) / (24 * 60 * 60 * 1000)) + "일 지났습니다.");
		}
	}
}