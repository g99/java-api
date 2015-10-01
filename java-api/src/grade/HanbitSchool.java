package grade;

import java.util.Scanner;
import java.util.Vector;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		String hak, name;
		int kor, eng, math;
		while (true) {
			System.out.println("1.성적등록 2.학적부리스트보기 3.학번으로검색 4.이름으로검색 5.성적순위출력 6.이름순출력 7.소트사용정렬 8. 종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("학번 : ");
				hak = scanner.next();
				System.out.print("이름 : ");
				name = scanner.next();
				System.out.print("국어 : ");
				kor = scanner.nextInt();
				System.out.print("영어 : ");
				eng = scanner.nextInt();
				System.out.print("수학 : ");
				math = scanner.nextInt();
				service.input(hak, name, kor, eng, math);
				break;
			case 2:
				Vector<Grade> results = service.getList();
				System.out.println(results);
				break;
			case 3:
				System.out.print("학번 : ");
				hak = scanner.next();
				System.out.println(service.searchByHak(hak));
				break;
			case 4:
				System.out.print("이름 : ");
				name = scanner.next();
				results = service.searchByName(name);
				System.out.println(results);
				break;
			case 5:
				System.out.println(service.descGradeByTotal());
				break;
			case 6:
				System.out.println(service.ascGradeByName());
				break;
			case 7:
				service.descUseSort();
//				for (int i = 0; i < sort.length; i++) {
//					System.out.println(sort[i].intValue());
//				}
				break;
			case 8:
				System.out.println("===========프로그램을 종료합니다.============\n");
				return;

			default:
				break;
			}
		}
	}
}
