package grade;

import java.util.ArrayList;

public interface GradeService {
	public void input(String hak, String name, int kor, int eng, int math);
	public ArrayList<Grade> getList();
	public Grade searchByHak(String hak);
	public ArrayList<Grade> searchByName(String name);
	public ArrayList<Grade> descGradeByTotal(); //총점을 내림차순으로 정렬(100, 90...)
	public ArrayList<Grade> ascGradeByName();   //이름에 따라 오름차순으로 정렬(ㄱ,ㄴ,ㄷ)
	public ArrayList<Grade> descUseSort();
}
