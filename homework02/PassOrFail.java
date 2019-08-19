package homework02;

import java.util.Scanner;

/**
 * 
 * 
 To. 개발자님
       * 프로그램을 하나 개발해야 합니다.
       * 교수는 학생과 국어, 영어, 수학점수만 입력하면
       * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
       * 오더는 다음과 같이 화면에 출력하라고 합니다.
       * 학생           국어        영어        수학        총점        평균        합격여부
       * =======================================================
       * 홍길동     90       90      90     270      90       (장학생)
       * 합격여부는 다음과 같다고 합니다.
       * 평균이 90점 이상이면 장학생
       * 70점 이상 90점미만 이면 합격
       * 70미만이면 불합격이라고 하네요.
       * 단) 평균에서 소수점이하는 절삭입니다. *
 */
public class PassOrFail {

	public static void main(String[] args) {
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
