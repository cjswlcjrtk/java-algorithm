package homework01;

import java.util.Random;
import java.util.Scanner;

/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */

/**
 * 
 * @author user
 * dice = 랜덤숫자 변수
 * user = 사용자 입력 값 변수
 * answer = 결과 변수
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		Random ran = new Random();
		int dice = ran.nextInt(3)+1;
//		System.out.println("dice값 = " + dice);
		//1. 가위 2. 바위 3.보	
		Scanner scanner = new Scanner(System.in);
		String user = scanner.next();
		
//		System.out.println("answer값 = " + user);
		String answer = "";
		
		switch(user) {
		case "가위": {
			switch(dice) {
			case 1: answer = "비겼습니다"; break;
			case 2: answer = "졌습니다"; break;
			case 3: answer = "이겼습니다"; break;
			}
		} break;
		case "바위": {
			switch(dice) {
			case 1: answer = "이겼습니다"; break;
			case 2: answer = "비겼습니다"; break;
			case 3: answer = "졌습니다"; break;
			}
		} break;
		case "보": {
			switch(dice) {
			case 1: answer = "졌습니다"; break;
			case 2: answer = "이겼습니다"; break;
			case 3: answer = "비겼습니다"; break;
			}
		} break;
		
		}
		System.out.println(answer);
		
		
		
		
		

	}

}
