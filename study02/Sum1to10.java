package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		//1 + 2 + 3 + 4 + 5 =
		String eval = "";
		int sum = 0;
//		for(int i=1; i<=10; i++) {			
//			if(i == 10) {
//				eval += i + " = ";		
//			}else if(i != 10){				
//				eval += i + " + ";	
//			}
//			sum += i;
//			
//			//+= 덮어쓰지말고 추가하라는 의미
//			
//		}
//		System.out.print(eval + sum);
		for(int i=1; i<=10; i++) {			
			
			eval += (i == 10) ? i + " = " : i + " + ";	//3항연산자
			sum += i;
			
		}
		System.out.print(eval + sum);
		
//		for(int i=1; i<=5; i++) {
//			switch(i) {
//			case 1: System.out.print(i+"+"); break;
//			case 2: System.out.print(i+"+"); break;
//			case 3: System.out.print(i+"+"); break;
//			case 4: System.out.print(i+"+"); break;
//			case 5: System.out.print(i+"="); break;
//			
//			}
//		}
		
	}

}
