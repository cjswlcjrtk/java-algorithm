package study04;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while (true) {
			int Flag = 0;
			System.out.println("0.종료  1.BMI 2.이해못할문제 3.윤년계산기 4.월별일출력기 5."
					+ "합격여부프로그램 6.사칙연산프로그램\n7.세금계산기 8.시간계산기 9.점수계산기");
			switch(scanner.nextInt()) {
			
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("BMI, 이름, 키, 몸무게"); 
			String name = scanner.next();
			double height = scanner.nextDouble();
			double weight = scanner.nextDouble();
			String result = student.getBmi(name, height, weight);	
			System.out.println(result);
			break;
			case 2 : 
				//	이름, 주소, 나이, 은행잔고, 신용도
				//	결과가 뭘 넣던간에 1억 대출
				System.out.println("**********");
				name = scanner.next();
				String address = scanner.next();
				int age = scanner.nextInt();
				int money = scanner.nextInt();
				String Credit = scanner.next();
				result = student.daechul(name, address, age, money, Credit);
				System.out.println(result);
				break;
			case 3 : System.out.println("년도를 입력해주세요.");
				int year = scanner.nextInt();
				String eval = "";
				result = student.getLeapYear(year, eval);
				System.out.println(result);				
				break;
			case 4 : System.out.println("월을 입력해주세요");
				int month = scanner.nextInt();
				int eval2 = 0;
				result = student.getMonthEndDay(month, eval2);
				System.out.println(result);
				break;
			case 5 : System.out.println("합격 여부를 알려드립니다");
				int[] scores = new int[5];
			
				String pass ="";
				System.out.println("이름을 입력해주세요");
			
				name = scanner.next();		
				System.out.println("국어, 영어, 수학 점수를 입력해주세요");
			
				for(int i = 0 ;i < 3; i++) {
					System.out.print("점수입력 = ");
					scores[i] = scanner.nextInt();				
				}
				result = student.getPassOrFail(scores, pass, name);
				System.out.println(result);
				break;
				
			case 6 : 
				int number1 = 0, number2 = 0, eval3 = 0;
				String culc = "";
				
				System.out.println("첫번쨰 수를 입력해주세요.");
				number1 = scanner.nextInt();
				
				System.out.println("사칙연산(+,-,x,/)중 하나 원하는 연산을 넣어주세요");
				culc = scanner.next();
				
				System.out.println("두번째 수를 입력해주세요.");
				number2 = scanner.nextInt();
				result = student.getArithmeticCalculator(number1, number2, eval3, culc);
				System.out.println(result);
				break;
				
			case 7 : 
				System.out.println("이름을 입력해주세요");
				name = scanner.next();
				
				System.out.println("연봉을 입력해주세요.");
				money = scanner.nextInt();
				
				result = student.getTax(money, name);
				System.out.println(result);
				break;
				
			case 8 :				
				int num = 0;
				System.out.println("시간계산기입니다. 값을 입력해주세요.");
				num = scanner.nextInt();
				
				result = student.getTimeCalc(num);
				System.out.println(result);
				
				break;
			case 9 :
				System.out.println("점수계산기");
				
				int count = 0, number = 0;
				int[] num1 = null;
				
				while(true) {
					System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
					number = scanner.nextInt();
					
					if(number == -1) {
						break;
					}
					
					int[] temp = new int[count];
					for(int i = 0; i < count; i++) {
						temp[i] = num1[i];
						System.out.println("temp[i] = " + temp[i]);
					}
					count++;
					
					num1 = new int[count];
					for(int i = 0; i < count-1; i++) {
						num1[i]= temp[i];
						System.out.println("temp[i] = " + num1[i]);
					}
					num1[count-1] = number;
					System.out.println("number = " + number);
					
					result = student.getScoreCalc(num1, count);
					System.out.println(result);
					
				}
				
				break;
			}
			
		}
	}

}
