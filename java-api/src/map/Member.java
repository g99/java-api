package map;

public class Member {
	private String name; //회원이름
	private String addr; //주소
	private String age; //나이
	private String id; //아이디
	private String pass; //비번
	
	@Override
	public String toString() {
		return "회원정보 [아이디=" + id + ", 비번=" + pass + ", 이름=" + name + ", 나이=" + age + ", 주소=" + addr + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
