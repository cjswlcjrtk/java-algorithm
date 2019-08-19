package homework02;

import java.util.Scanner;

/**
 * 
 * 
 * To. 개발자님

우리는 소매점포인데요 주문을 받는 키오스크 (아래 그림같은)를 설치했어요.
이제 여기에 프로그램을 설치하려고 합니다.
일단 화면에 보이는 문장은 아래와 같이 진행 되었으면 해요.
저희가 시장에 있는 가게다 보니까 깎아주는 기능도 탑재되야 해요.
아래 형광펜 칠한 부분은 콘솔에서는 입력값입니다.
나머지는 실제 화면에 보여지는 부분입니다.프로그램을 만들어 주세요.
그리고 앞으로 개선할 일 있으면 연락드릴께요.

"얼마에요?
> 스캐너입력값 > 100
100원 입니다.
몇개 드릴까요?
> 스캐너입력값 > 5
5개 주세요
총 금액은 500원 입니다
비싸요, 10% 깎아주세요.
그럼 450원만 주세요"

[참고] 깍아주는 공식
int dc = total / 10;
total = total - dc;
 *
 */
public class HowMuch {

	public static void main(String[] args) {
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

}
