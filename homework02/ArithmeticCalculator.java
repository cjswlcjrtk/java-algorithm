package homework02;
/**
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
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		String culc = "";
		number1 = scanner.nextInt();
		System.out.println("덧셈 뺼셈 곱셈 나눗셈중 원하는 연산을 넣어주세요");
		culc = scanner.next();
		number2 = scanner.nextInt();
		int eval=0;
		switch(culc){
		case "+": eval=number1 + number2; break;
		case "-": eval=number1 - number2; break;
		case "*": eval=number1 * number2; break;
		case "/": eval=number1 / number2; break;
			
		}
		System.out.println(number1 + culc + number2 + "=" + eval);
		
		

	}

}
