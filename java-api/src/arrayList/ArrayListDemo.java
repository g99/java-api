package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @file_name : ArrayListDemo.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 10. 1.
 * @story     : ArrayList 예제
 */
public class ArrayListDemo {
	/**
	 * CRUD
	 * create 추가
	 * read   조회
	 * update 수정
	 * delete 삭제 
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // 깊은 복사
		// Create
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("대구");
		List<String> list2 = new ArrayList<String>();
		list2.addAll(list); // list가 전부 list2로 복사됨
		// Read 
		// 출력 방법 1. iterator()
		Iterator<String> it = list.iterator(); // shallow copy 얕은 복사
		while (it.hasNext()) { // 요소가 존재하는 끝까지 돌아라
			System.out.println("출력 방법1 : " + it.next());
		}
		System.out.println();
		// 출력 방법 2. 확장 for loop
		for (String str : list) {
			System.out.println("출력 방법1 : " + str);
		}
		System.out.println();
		// 출력 방법 3. 검색
		it = list2.iterator();
		String search = "";
		while (it.hasNext()) {
			search = it.next();
			if (search.startsWith("대")) { // 서울, 부산, 대구 중에서 앞글자가 '대'자로 시작한다면 
				System.out.println("검색 결과3 : " + search);
			}
			
		}
	}
}
