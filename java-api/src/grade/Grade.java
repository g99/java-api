package grade;

/**
 * @file_name : Grade.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 1.
 * @story : 성적표 관리 객체 클래스
 */
public class Grade {
	private int kor, eng, math;
	private String hak, name; // 학번은 유일한 ID값
	
	public int getTotal() {
		return kor + eng + math;
	}
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "성적 [학번=" + hak + ", 이름=" + name + ", 총점=" + getTotal()+"]";
	}
	
}
