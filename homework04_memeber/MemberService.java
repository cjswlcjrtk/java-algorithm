package homework04_memeber;

public class MemberService {
	public String getMyPage(Member member) {
		String result = "";
		String id = member.getId();
		String pw = member.getPw();
		String name = member.getName();
		Double height = member.getHeight();
		Double weight = member.getWeight();
		
		return String.format("회원정보: \n"
				+ "아이디: %s \n"
				+ "비번 %s \n"
				+ "이름 %s \n"
				+ "키 %.1f \n"
				+ "몸무게 %.1f \n", id, pw, name ,height, weight);
//		return result;
	}
	public String getBMI(Member member) {
		String result = "";
		String name = member.getName();
		Double height = member.getHeight();
		Double weight = member.getWeight();
		double bmi = 0;
		String eval = "";
		
		bmi = weight / ((height*0.01) * (height*0.01));
		
		if (bmi > 30.0) {
			eval = "고도비만";
		}else if(bmi > 25.0) {
			eval = "비만";
		}else if(bmi > 23.0) {
			eval = "과체중";
		}else if(bmi > 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
//		System.out.printf("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, eval);
		
//		return result;
		return String.format("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, eval);
	}

}
