package string;

import java.util.StringTokenizer;

/**
 * @file_name : StringTokenizer.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 6.
 * @story     : StringTokenizer
 */
public class StringTokenizerMain {
	public static void main(String[] args) {
		String date = "2015-10-06";
		StringTokenizer tok = new StringTokenizer(date, "-");
		System.out.println("토큰의 갯수 : " + tok.countTokens());
		System.out.println("-을 제외한 출력문");
		while (tok.hasMoreElements()) {
			System.out.println(tok.nextToken());
		}
	}
}
