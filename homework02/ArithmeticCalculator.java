package homework02;

import java.util.Scanner;

/**
 * 
 * 
 * To. 개발자님
프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
 */


public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number1 = 0, number2 = 0, eval=0;
		String culc = "";
		
		System.out.println("첫번쨰 수를 입력해주세요.");
		number1 = scanner.nextInt();
		
		System.out.println("사칙연산(+,-,x,/)중 하나 원하는 연산을 넣어주세요");
		culc = scanner.next();
		
		System.out.println("두번째 수를 입력해주세요.");
		number2 = scanner.nextInt();
		
		switch(culc){
		case "+": eval=number1 + number2; break;
		case "-": eval=number1 - number2; break;
		case "*": eval=number1 * number2; break;
		case "/": eval=number1 / number2; break;
			
		}
		System.out.printf("%d %s %d = %d[%d]",number1,culc,number2,eval,number1%number2);
		
		

	}

}
