package study04;

import java.util.Scanner;

import homework02.ScoreCalc;

public class Student {
	public String getBmi(String name, double height, double weight) {
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
	public String daechul(String name, String address, int age, int money, String Credit) {
		return "1억 대출";
	}
	
	public String getLeapYear(int year, String eval) {
		if((year%4) == 0) {
			if((year%100) == 0) {
				if((year%400) == 0) {
					eval = "윤년이다";					
				}else {
					eval = "평년이다";	
				}
			}else {
				eval = "윤년이다";	
			}
			
		}
		return String.format("%d년도는 %s ", year, eval);
		
	}
	
	public String getMonthEndDay(int month, int eval2) {
		switch(month){
			case 1 : eval2 = 31; break;
			case 2 : eval2 = 29; break;
			case 3 : eval2 = 31; break;
			case 4 : eval2 = 30; break;
			case 5 : eval2 = 31; break;
			case 6 : eval2 = 30; break;
			case 7 : eval2 = 31; break;
			case 8 : eval2 = 31; break;
			case 9 : eval2 = 30; break;
			case 10 : eval2 = 31; break;
			case 11 : eval2 = 30; break;
			case 12 : eval2 = 31; break;
		}
		
		return String.format("%d월은 %d일까지입니다. \n", month, eval2);
		
	}
	
	public String getPassOrFail(int[] scores, String pass, String name) {
		
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
		return String.format(pass);
		
	}
	
	public String getArithmeticCalculator(int number1, int number2, int eval3, String culc) {
		
		switch(culc){
		case "+": eval3=number1 + number2; break;
		case "-": eval3=number1 - number2; break;
		case "*": eval3=number1 * number2; break;
		case "/": eval3=number1 / number2; break;
			
		}
		return String.format("%d %s %d = %d[%d]",number1,culc,number2,eval3,number1%number2);
		
	}
	
	public String getTax(int money, String name) {
		double tax = 9.7; //tax(세율) 변수
		double out = money * tax /100;
		return String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다.\n", money, name, out);
	}
	
	public String getTimeCalc(int num) {
		int sec = 0, min = 0, hour = 0;
		
		
		min = num / 60;
		hour = (num /60) / 60;
		sec = num % 60;
			
		return String.format("%d시간 %d분 %d초 ", hour, min , sec);
	}
	
	public String getScoreCalc(int[] num1, int count) {
		int sum = 0, avg = 0;
		for(int i = 0; i < count; i++) {
			sum += num1[i];
		}
		
		avg = sum / count;
		System.out.print("현재까지의 누적값은 ");
		for(int i = 0; i < count; i++) {
			if(i == count-1) {
				System.out.printf("%d = ", num1[i]);
			}else {
				System.out.printf("%d + " , num1[i]);
			}
		}
		return String.format("%d 이고 평균은 %d입니다." ,sum , avg);
	}

}
