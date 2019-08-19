package homework02;

import java.util.Scanner;

/**
 * 
 * 
To. 개발자님
월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다." *
 */
public class MonthEndDay {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		
		int month = scan.nextInt();
		int eval = 0;
		
		switch(month){
			case 1 : eval = 31; break;
			case 2 : eval = 29; break;
			case 3 : eval = 31; break;
			case 4 : eval = 30; break;
			case 5 : eval = 31; break;
			case 6 : eval = 30; break;
			case 7 : eval = 31; break;
			case 8 : eval = 31; break;
			case 9 : eval = 30; break;
			case 10 : eval = 31; break;
			case 11 : eval = 30; break;
			case 12 : eval = 31; break;
		}
		
		System.out.printf("%d월은 %d일까지입니다. \n", month, eval);
		
	}	
}