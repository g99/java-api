package string;
/**
 * @file_name : StringBufferMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 6.
 * @story     : StringBuffer 문법
 */
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String a = "java";
		String b = "programming";
		String c = a + b;
		System.out.println(sb.append("java").append("programming").toString());
		// 체이닝 기법
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.replace(0, 4, "C++");
		System.out.println(sb);
		System.out.println(sb.reverse()); // 역순출력
		System.out.println(sb.reverse()); // 역순출력
		System.out.println(sb.substring(11)); // 11번째 인덱스부터선택
		StringBuffer sb1 = new StringBuffer("홍길동");
		StringBuffer sb2 = new StringBuffer("홍길동");
		/**
		 * String과 달리 변경시 객체 생성이 아닌 자기 자신을
		 * 변경하기 때문에 변경이 잦은경우 효울이 높음
		 * 단, StringBuffer는 무조건 레퍼런스 비교만 하므로
		 * 비교에 있어서 성능이 떨어짐
		 */
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
