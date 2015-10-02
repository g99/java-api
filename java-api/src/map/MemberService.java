package map;

import java.util.Map;

public interface MemberService {
	//회원가입
	public void join(String id, String pass, String name, String age, String addr);
	//로그인
	public String login(String id, String pass);
	//총 회원수
	public int count();
	//아이디 검색
	public Member searchByID(String id);
	//전체회원정보 출력
	public Map<String, Object> allInfo();
}
