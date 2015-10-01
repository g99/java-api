package grade;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import javax.naming.ldap.SortControl;

public class GradeServiceImpl implements GradeService{
	Vector<Grade> vec = new Vector<Grade>();
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
		vec.addElement(grade);
	}
	/**
	 * 학적부에 등록된 전체 학생 리스트 출력
	 * 힌트) 필드에 있는 객체에 모든 학생 리스트가 있을 것이다.
	 * 필드객체 값을 지역변수에 할당하자
	 */
	@Override
	public Vector<Grade> getList() {
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) {
		Grade search = new Grade();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.elementAt(i).getHak().equals(hak)) {
				search = vec.elementAt(i);
			}
		}
		return search;
	}
	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기(동명이인일 경우 전부 검색)
	 */
	@Override
	public Vector<Grade> searchByName(String name) {
		Vector<Grade> search = new Vector<Grade>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.elementAt(i).getName().equals(name)) {
				search.addElement(vec.elementAt(i));
			}
		}
		return search;
	}

	

	@Override
	public Vector<Grade> ascGradeByName() {
		Collections.sort(vec, aSort);
		return vec;
	}
	
	@Override
	public Vector<Grade> descGradeByTotal() {
		Collections.sort(vec, bSort);
		return vec;
	}
	@Override
	public void descUseSort() {
		Object[] scores = new Integer[vec.size()];
		System.out.println("됨됨ㄷ묃ㅁ"+vec.size());
		vec.copyInto(scores);
//		for (int integer : scores) {
//			System.out.println(integer + "넘버 : " + num);
//		}
//		int temp;
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = i+1	; j < scores.length; j++) {
//				if (scores[i] < scores[j]) {
//					temp = scores[i];
//					scores[i] = scores[j];
//					scores[j] = temp;
//				}
//			}
//		}
//		return scores;
	}
}
