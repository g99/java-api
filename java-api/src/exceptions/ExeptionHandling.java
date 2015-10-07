package exceptions;

/**
 * @file_name : ExeptionHandling.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 7.
 * @story :
 */
public class ExeptionHandling {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작됨");
		int[] arr = { 10, 20, 30 };
		for (int i = 0; i <= arr.length; i++) {
			// try catch 예외처리 부분은 최대한 짧게 가져가야 좋다.
			try {                          
				System.out.print(arr[i] + "\t");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n프로그램이 종료됨");
	}
}
