package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	Map<String, Object> map = new HashMap<String, Object>();
	private static MemberServiceImpl Instance = new MemberServiceImpl();
	
	public static MemberServiceImpl getInstance() {
		return Instance;
	}

	/**
	 * 회원정보를 받아서 등록
	 */
	@Override
	public void join(String id, String pass, String name, String age, String addr) {
		Member member = new Member();
		member.setId(id);	
		member.setPass(pass);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		map.put(id, member);
	}

	/**
	 * 환영합니다. 서울에 사시는 30세 홍길동님. 비번이 다릅니다. 다시 입력하세요. 입력하신 ID는 존재하지 않거나, 일치하지
	 * 않습니다. Map에서 밸류값만 가져오는 메소드는 map.get("키값") id는 키값
	 */
	@Override
	public String login(String id, String pass) {
		String result = "";
		Member target = (Member) map.get(id);
		if (target != null && target.getId().equals(id) && target.getPass().equals(pass)) {
			result = "환영합니다." + target.getAddr() + "에 사시는 " + target.getAge() + "세 " + target.getName() + "님.";
		} else if (target != null && target.getId().equals(id)) {
			result = "비번이 다릅니다. 다시 입력하세요.";
		} else {
			result = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다.";
		}
		return result;
	}

	@Override
	public int count() {
		return map.size();
	}

	@Override
	public Member searchByID(String id) {
		Member target = (Member) map.get(id);
		return target;
	}

	@Override
	public Map<String, Object> allInfo() {
		return map;
	}

	@Override
	public String deleteId(String id) {
		String result = "";
		Member target = (Member) map.get(id);
		if (target != null && target.getId().equals(id)) {
			map.remove(id);
			result = "계정을 삭제했습니다.";
		} else {
			result = "해당하는 계정이 존재하지 않습니다.";
		}
		return result;
	}

	@Override
	public String changePsw(String id, String pass) {
		String result = "";
		Member target = (Member) map.get(id);
		if (target != null) {
			target.setPass(pass);
			result = "패스워드가 변경되었습니다.";
		} else {
			result = "변경할 아이디가 존재하지 않습니다.";
		}
		return result;
	}

}
