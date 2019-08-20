package study05;

public class Service {
	public String getBmi(Member member) {
		String result = "";
		double bmi = 0;
		
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		
		bmi = weight / ((height*0.01) * (height*0.01));
		
		if (bmi > 30.0) {
			result = "고도비만";
		}else if(bmi > 25.0) {
			result = "비만";
		}else if(bmi > 23.0) {
			result = "과체중";
		}else if(bmi > 18.5) {
			result = "정상";
		}else {
			result = "저체중";
		}
		
//		System.out.printf("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, result);
//		return result;
		return String.format("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, result);

	}
	public String getReportCard(Member member) {
		String result = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = 0;
		int average = 0;
		String pass = "";
		
		sum = kor + eng + math;
		average = sum/3;
		
		if(average >= 90) {
			pass = "장학생";
		}else if(average >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		
		
		return String.format("%s님의 각 과목 점수는 \n"
				+ "국어 : %d\n"
				+ "영어 : %d\n"
				+ "수학 : %d\n"
				+ "총점 : %d\n"
				+ "평균 : %d입니다.\n"
				+ "그러므로 %s입니다.", name, kor, eng, math, sum, average, pass);
	}
	
	public String getTax(Member member) {
		String result = "";
		
		int money = member.getMoney();
		double tax = 9.7;	//tax(세율) 변수
		String name = member.getName();
		
		double out = money * tax /100;
//		System.out.printf("연봉 %d만원을 받으시는 "
//				+ "%s님께서 납부할 세금은 %.1f만원입니다.\n", money, name, out);
//		
		
		return String.format("연봉 %d만원을 받으시는 "
				+ "%s님께서 납부할 세금은 %.1f만원입니다.\n", money, name, out);
	}
}
