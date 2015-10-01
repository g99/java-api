package grade;

import java.util.Vector;

public interface GradeService {
	public void input(String hak, String name, int kor, int eng, int math);
	public Vector<Grade> getList();
	public Grade searchByHak(String hak);
	public Vector<Grade> searchByName(String name);
	public Vector<Grade> descGradeByTotal(); //총점을 내림차순으로 정렬(100, 90...)
	public Vector<Grade> ascGradeByName();   //이름에 따라 오름차순으로 정렬(ㄱ,ㄴ,ㄷ)
	public Grade[] descUseSort();
}
