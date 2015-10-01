package sort;
import java.util.Vector;
/**
 * @file_name : AscSort.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 1.
 * @story     : 오름차순 및 내림차순
 */
public class AscSort {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		int[] arr = { 2, 5, 68, 79, 123, 4, 9 };
		int temp = 0;
		System.out.println("=========내림차순=========");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i]; // 스왑 정렬
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vector.add(i);
		}
		System.out.println(vector);
		System.out.println("=========오름차순=========");
		Vector<Integer> vector2 = new Vector<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { 
					temp = arr[i]; // 스왑 정렬
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vector2.add(i);
		}
		System.out.println(vector2);
	}
}
