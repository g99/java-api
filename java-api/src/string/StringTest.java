package string;

public class StringTest {
	public static void main(String[] args) {
		String a = "하나", b ="둘", c = "하", d = "나둘";
		c = a+b; // 하나+둘
		d = a+b; // 하나+둘
	
		System.out.println(c==d ? "같다":"다르다");
		System.out.println(c.equals(d) ? "같다":"다르다");
	}
}
