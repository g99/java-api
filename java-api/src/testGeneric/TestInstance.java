package testGeneric;

public class TestInstance {
	public static void main(String[] args) {
		ABC abc = new ABC();
		ABC bcd = abc; // 객체간에 = 연산은 복사가 아니라 참조이다!!!
		abc.setNum(12);
		System.out.println(abc.getNum());
		bcd.setNum(11);
		System.out.println(abc.getNum());
	}
}

class ABC {
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}