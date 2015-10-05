package string;

/**
 * @file_name : StringDemo.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : String class
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Twinkle", s2 = "Twinkle"; // 리터럴 notation
		// 상수풀에 이미 존재하는 "Twinkle"을 재사용 하는 구문 그러므로 [추천]
		if (s1 == s2) {
			System.out.println("s1과, s2는 밸류는 같고 [주소값이] 같다.");
		} else {
			System.out.println("s1과 s2는 밸류는 같고 [주소값이] 같지 않다.");
		}
		// 위 구문은 메모리 낭비를 초래하므로 비추 
		String s3 = new String("하하") , s4 = new String("하하"); // 생성자
		if (s3 == s4) {
			System.out.println("s3와 s4는 밸류는 같고 [주소값이] 같다.");
		} else {
			System.out.println("s3와 s4는 밸류는 같고 [주소값이] 같지 않다.");
		}
	}
}
