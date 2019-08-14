package homework02;

import java.util.Scanner;

/**
 * 	To.개발자님께
	초단위로 알려주는 시험이 있는데
	이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
 */
public class TimeCalc {

	public static void main(String[] args) {
		int second = 0;
		int minute = 0;
		int hour = 0;
		Scanner scanner = new Scanner(System.in);
		second = scanner.nextInt();
		if(second < 60) {
//			System.out.printf("%s 초입니다.", second);			
		}else if(second < 3600) {
			minute = second/60;
			second = second - minute*60;
//			System.out.printf("%s 분 %d초입니다.", minute, second);					
		}else{
			minute = second/60;
			System.out.println(minute);
			hour = minute/60;
			minute = minute - hour*60;
			second = second - hour*3600 - minute*60;
//			System.out.printf("%s 시 %d 분 %f초입니다.",hour, minute, second);	
			
			
		}
//		System.out.printf("%s 시 %d 분 %f초입니다.",hour, minute, second);	\
		System.out.println(hour + "시" + minute + "분" + second + "초");
		

	}

}
