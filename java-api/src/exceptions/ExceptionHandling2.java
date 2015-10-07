package exceptions;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int i = 50;
		try {
			int data = Integer.parseInt("a");
			System.out.println(i/data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
