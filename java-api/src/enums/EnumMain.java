package enums;

import java.util.Scanner;

/**
 * @file_name : EnumMain.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 7.
 * @story :
 */
public class EnumMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Navigation navi = new Navigation(scanner.nextInt());
		System.out.println(navi.getDirection());
	}
}



class Navigation {
	enum Directions {동,서,남,북};
	private String direction;

	public Navigation(int direction) {
		switch (direction) {
		case 1:
			setDirection(Directions.동 + "으로 이동합니다.");
			break;
		case 2:
			setDirection(Directions.서 + "으로 이동합니다.");
			break;
		case 3:
			setDirection(Directions.남 + "으로 이동합니다.");
			break;
		case 4:
			setDirection(Directions.북 + "으로 이동합니다.");
			break;
		default:
			setDirection("없는 방향!!!");
			break;
		}
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
