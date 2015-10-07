package enums;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/**
 * @file_name : Toysrus.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 7.
 * @story : 장난감 가게에서 신규로 들어온 상품 등록과 검색
 */
public class Toysrus {
	/**
	 * 장난감이 입고되었을 때, 점원이 바코드번호로 등록을 하는 과정 1. setBarcode() : 123456 6자리 2.
	 * setName() : 상품명 등록(Enum 에 있는 이름) 3. setUser() : 어른용, 어린이용 4. setType() :
	 * 피규어, 인형 5.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ToyRegister tr = new ToyRegister();
		ToySpec spec = new ToySpec();
		spec.setMap("사용자", ToyUser.어른용);
		spec.setMap("타입", ToyType.피규어);
		tr.regist("스파이더맨", 5000, spec);
		// 등록된 모든 장난감 출력
		List<Toy> list = tr.getAll();
		for (Toy toy : list) {
			System.out.println(toy);
		}
		// 이름으로 조회
		System.out.println(tr.searchName("스파이더맨"));
	}
}

enum ToyUser {
	어른용, 유아용;
}

enum ToyType {
	피규어, 인형;
}

class ToyRegister {
	private List<Toy> toys;
	private Toy toy;

	public ToyRegister() {
		this(10, 5);
	}

	public ToyRegister(int capa, int increment) { // capa 리스트의 현재 적재용량, increment 적재용량이 넘어서면 증가되는 값
		toys = new Vector<Toy>(capa, increment);
	}
	/**
	 * 장난감 등록 
	 */
	public void regist(String name, int price, ToySpec spec) {
		toy = new Toy(name, price, spec);
		toys.add(toy);
	}
	public Vector<Toy> searchName(String name){
		Vector<Toy> temp = new Vector<Toy>();
		for (int i = 0; i < toys.size(); i++) {
			if (toys.get(i).getName().equals(name)) {
				temp.add(toys.get(i));
			}
		}
		return temp;
	}
	/** 
	 * 스펙을 가지고 찾기
	 * (예를들어 어른요이라고 검색하면 어른용 장난감이출력됨) 
	 */
	public List<Toy> searchType(ToySpec searchSpec){
		List<Toy> temp = new ArrayList<Toy>();
		Enumeration<Toy> e = ((Vector<Toy>) toys).elements();
		while (e.hasMoreElements()) {
			toy = e.nextElement();
			ToySpec spec = toy.getSpec();
			if (spec.equals(searchSpec)) {
				temp.add(toy);
			}
		}
		return temp;
	}
	public List<Toy> getAll(){
		return toys;
	}
}

class ToySpec {

	private Map<String, Object> map;

	public ToySpec() { // ToySpec의 생성자를 사용해야만 존재함
		map = new HashMap<String, Object>();
	}

	// 맵에 키와 속성 추가
	public void setMap(String key, Object val) { // 오버로딩
		map.put(key, val);
	}

	// 키값에 따라서 속성 가져오기
	public Object getMap(String key) {
		return map.get(key);
	}
	//스펙 비교 검색
//	public boolean match(ToySpec spec) {
//		String dest = "", target = ""; // dest : 비교대상, target : 비교 당하는 객체
//		if (spec.getMap("ToyUser") != null) {
//			dest += spec.getMap("ToyUser");
//			target += this.getMap("ToyUser");
//		}
//		if (spec.getMap("ToyType") != null) {
//			dest += spec.getMap("ToyType");
//			target += this.getMap("ToyType");
//		}
//		return spec.equals(target);
//	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
}

class Toy {
	private String name;
	private int price;
	ToySpec spec;

	public Toy() {
		this("", 0, null);
	}

	public Toy(String name, int price, ToySpec spec) {
		this.name = name;
		this.price = price;
		this.spec = spec;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public ToySpec getSpec() {
		return spec;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSpec(ToySpec spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "장난감 [상품명=" + name + ", 가격=" + price + ", 스펙=" + spec + "]";
	}
}
