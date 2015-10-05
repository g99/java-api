package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * String.substring(0,2); 0이상 2미만을 조각냄
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id, pass, name, age, addr;
		MemberService service = new MemberServiceImpl();
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.총회원수 4.ID검색 5.전체회원정보출력 6.회원탈퇴 7.비밀번호변경 8.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("아이디 : ");
				id = scanner.next();
				System.out.print("비  번 : ");
				pass = scanner.next();
				System.out.print("이  름 : ");
				name = scanner.next();
				System.out.print("나  이 : ");
				age = scanner.next();
				System.out.print("주  소 : ");
				addr = scanner.next();
				service.join(id, pass, name, age, addr);
				break;
			case 2:
				System.out.print("아이디 : ");
				id = scanner.next();
				System.out.print("비  번 : ");
				pass = scanner.next();
				System.out.println(service.login(id, pass));
				break;
			case 3:
				System.out.println("총 회원수는 " + service.count() + "명 입니다.");
				break;
			case 4:
				System.out.print("아이디 : ");
				id = scanner.next();
				System.out.println(service.searchByID(id) == null ? "해당 ID가 존재하지 않습니다." : service.searchByID(id));
				break;
			case 5:
				System.out.println(service.allInfo());
				break;
			case 6:
				System.out.println("탈퇴할 아이디 입력");
				id = scanner.next();
				System.out.println(service.deleteId(id));
				break;
			case 7:
				System.out.print("아이디 : ");
				id = scanner.next();
				System.out.print("변경할비번 : ");
				pass = scanner.next();
				System.out.println(service.changePsw(id,pass));
				break;
			case 8:
				return;
			default:
				break;
			}
		}
	}
}
