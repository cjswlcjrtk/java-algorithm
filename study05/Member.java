package study05;

public class Member {
	private String id, pw, name, birth, blood;
	private int money;
	double height, weight;
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
	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
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
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return String.format("회원정보: \n"
				+ "아이디: %s \n"
				+ "비번 %s \n"
				+ "이름 %s \n"
				+ "생일 %s \n"
				+ "혈액형 %s \n"
				+ "키 %.1f \n"
				+ "몸무게 %.1f \n",
				id, pw, name, birth, blood, height, weight);
	}
	
}
