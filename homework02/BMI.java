package homework02;

import java.util.Scanner;

/**
 * 
 *  To. 개발자님
사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)

Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.
 *
 */
public class BMI {

	public static void main(String[] args) {	
		String name = "", eval = "";
		double height = 0, weight = 0, bmi = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		name = scanner.next();
		
		System.out.println("키를 입력해주세요");
		height = scanner.nextDouble();
		
		System.out.println("몸무게를 입력해주세요");
		weight = scanner.nextDouble();
		
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
		System.out.printf("%s님의 BMI수치는 %.1f으로 %s입니다. \n", name, bmi, eval);

	}

}
