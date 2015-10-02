package grade;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

import javax.naming.ldap.SortControl;

public class GradeServiceImpl implements GradeService{
	ArrayList<Grade> vec = new ArrayList<Grade>();
	AscName aSort = new AscName();
	DescTotal bSort = new DescTotal();
	/**
	 * 학생을 학적부에 등록하기 
	 * 힌트) 백터메소드 중에 한 객체만 넣는 메소드를 사용
	 */
	@Override
	public void input(String hak, String name, int kor, int eng, int math) {
		Grade grade = new Grade();
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		vec.add(grade);
	}
	/**
	 * 학적부에 등록된 전체 학생 리스트 출력
	 * 힌트) 필드에 있는 객체에 모든 학생 리스트가 있을 것이다.
	 * 필드객체 값을 지역변수에 할당하자
	 */
	@Override
	public ArrayList<Grade> getList() {
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) {
		Grade search = new Grade();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).getHak().equals(hak)) {
				search = vec.get(i);
			}
		}
		return search;
	}
	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기(동명이인일 경우 전부 검색)
	 */
	@Override
	public ArrayList<Grade> searchByName(String name) {
		ArrayList<Grade> search = new ArrayList<Grade>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).getName().equals(name)) { //벡터에 있는 이름이랑 내가 준 이름이랑 같을때
				search.add(vec.get(i));
			}
		}
		return search;
	}

	

	@Override
	public ArrayList<Grade> ascGradeByName() {
		Collections.sort(vec, aSort);
		return vec;
	}
	
	@Override
	public ArrayList<Grade> descGradeByTotal() {
		Collections.sort(vec, bSort);
		return vec;
	}
//	@Override
//	public Grade[] descUseSort() {
//		Grade[] scores = new Grade[vec.size()];
//		vec.copyInto(scores);
//		Grade temp;
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = i+1; j < scores.length; j++) {
//				if (scores[i].getTotal() > scores[j].getTotal()) {
//					temp = scores[i];
//					scores[i] = scores[j];
//					scores[j] = temp;
//				}
//			}
//		}
//		return scores;
//	}
	
	public ArrayList<Grade> descUseSort() {
		Grade[] scores = new Grade[vec.size()];
		Grade temp;
		for (int i = 0; i < scores.length; i++) {
			for (int j = i+1; j < scores.length; j++) {
				if (scores[i].getTotal() > scores[j].getTotal()) {
					temp = vec.get(i);
					vec.set(i, vec.get(j));
					vec.set(j, temp);
				}
			}
		}
		return vec;
	}
}
