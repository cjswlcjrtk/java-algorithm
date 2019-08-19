package study03;

import java.util.Scanner;

public class Student {
//	BMI 2.Ranking 3. HowMuch 4. ReportCard
	public String getBmi(String name, int height, int weight) {
//		String name = "", eval = "";
//		int height = 0, weight = 0;
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
		return String.format("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, eval);
	}
	public void getRank() {
		Scanner scan = new Scanner(System.in);
		double[] record = new double[3];
		String[] player = new String[] {"A", "B", "C"};
		
		
		System.out.println("선수 기록 등록기");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s 선수 기록 : ", player[i]);
			record[i] = scan.nextDouble();						
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3 -1; j++ ) {
				if(record[j] > record[j+1] ) {
					double temp = record[j];
					record[j] = record[j+1];
					record[j+1] = temp;
					
					String temp2 = player[j];
					player[j] = player[j+1];
					player[j+1] = temp2;
					
				}
			}
		}
		
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, player[i], record[i]);
		}
		
	}
	public void HowMuch() {
		Scanner scan = new Scanner(System.in);		
		
		int price, amount, total, dc = 0;
		System.out.println("얼마에요?");
		price = scan.nextInt();
		
		System.out.printf("%d원 입니다.\n", price);
		System.out.println("몇개 드릴까요?\n");
		
		amount = scan.nextInt();
		total = price * amount;
		
		System.out.printf("%d개 주세요.\n", amount);
		
		dc = total / 10;
		
		System.out.printf("총 금액은 %d원 입니다.\n", total);
		
		int total2 = total - dc;
		
		System.out.print("10%할인해서 결제하실 금액은 ");
		System.out.printf("%d원 입니다.\n", total2);
		
	}
	public void getReportCard() {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		
		String pass ="" , name = "";
		System.out.println("이름을 입력해주세요");
		
		name = scan.nextLine();		
		System.out.println("국어, 영어, 수학 점수를 입력해주세요");
		
		for(int i = 0 ;i < 3; i++) {
			System.out.print("점수입력 = ");
			scores[i] = scan.nextInt();
			
		}
		
		scores[3] = scores[0] + scores[1] + scores[2];
		scores[4] = scores[3] / 3;
		
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if(scores[4] >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		
		System.out.println("학생    국어    영어    수학    총점    평균    합격여부");
		System.out.println("=====================================");
		System.out.printf("%s  ",name);
		
		for( int i = 0 ; i < scores.length; i++) {
			System.out.printf("%d   ",scores[i]);			
		}
		System.out.print(pass);
	}
}
