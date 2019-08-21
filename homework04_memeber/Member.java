package homework04_memeber;
/**
 * 
아이디
비번
이름

키
몸무게 
 */
public class Member {
	private String id, pw, name;
	private double height, weight;
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return this.pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
//	@Override
//	public String toString() {
//		return String.format("회원정보: \n"
//				+ "아이디: %s \n"
//				+ "비번 %s \n"
//				+ "이름 %s \n"
//				+ "키 %.1f \n"
//				+ "몸무게 %.1f \n", id, pw, name ,height, weight);
//	}
//	
	
	
}
