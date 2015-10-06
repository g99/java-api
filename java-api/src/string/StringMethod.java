package string;

/**
 * @file_name : StringMethod.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : java.lang.String
 */
public class StringMethod {
	/**
	 * == 참조주소 비교 equals 안의 내용 비교
	 */
	public static void main(String[] args) {
		System.out.println("abcde".contains("f") ? "f있다." : "f없다.");
		String str1 = "abc", str2 = "abc";
		System.out.println((str1 == str2) ? "같음" : "다름"); // 리터럴이기 때문에 str1과
															// str2가 가리키는 참조위치가
															// 같다.
		System.out.println((str1.equals(str2)) ? "같음" : "다름"); // 내용 같음.

		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println((str3 == str4) ? "같음" : "다름"); // new를 통해 서로 다른 공간에
															// 만들어 졌으므로 참조위치가
															// 다름.
		System.out.println((str3.equals(str4)) ? "같음" : "다름"); // 내용 같음.
		
		//========================================================================================================
		
		System.out.println("hello.txt".endsWith("txt") ? "텍스트파일" : "텍스트파일 아님");
		System.out.println("헬로우".concat(", 자바월드!!"));
		System.out.println("HELLO".equals("hello")?"같음":"다름");
		System.out.println("HELLO".equalsIgnoreCase("hello")?"같음":"다름");
		/**
		 * JDK 5버전 이전에는 replace() replaceAll()이 서로 다르게 반응했으나
		 * 이후에는 서로 같은 기능(전부 체인지되는 기능)
		 * 단, 정규식에 대한 기능이 있는가 없는가의 차이점이 있다.
		 * replace()는 기능이 없고, replaceAll()은 기능이 있다.
		 * 따라서 replaceAll()을 쓰도록 권고되고 있다.
		 */
		System.out.println("HELLO TOM".replace("TOM", "ALEX"));
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		/**
		 * . 은 정규식에서 쓰이는데 맨 앞 한글자만 지정합니다.
		 * 그러니까 .a는 a앞에 글자와 a까지를 뜻합니다.
		 * [] 내부에 설정하면 조건을 여러개 받음
		 */
		System.out.println("[3] H.ello Java!!!".replace("a", "")); // Hello Jv!!! 
		System.out.println("[4] Hello Java!!!".replaceAll(".a", "")); // Hello !!!
		System.out.println("[5] H.e.l.l.o Java!!!".replaceAll("[.a]", "")); // Hello Jv!!!
		System.out.println("Hello  Java".toUpperCase()); // 대문자
		System.out.println("Hello  Java".toLowerCase()); // 소문자
		System.out.println("Hello  Java".length() + "글자"); // 11글자(공백포함)
		System.out.println("Hello  Java".replace(" ", "")); // 모든공백 제거
		System.out.println("         Hello  Java           ".trim()); // 앞뒤공백 제거
		System.out.println(String.valueOf(5)); // 스태틱 메소드(=클래스 메소드)
		//String.valueOf()는 ()안의 타입을 String으로 변환해 줍니다.
	}
}
