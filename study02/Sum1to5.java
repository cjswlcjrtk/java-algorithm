package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		//1 + 2 + 3 + 4 + 5 =
		String eval = "";
		int sum = 0;
		for(int i=1; i<=5; i++) {
//			String result = "";
			/**
			if(i == 5) {
				result += i + " = ";
			}else if(i != 5){				
				result += i + " + ";				
			}
			*/
			//+= 덮어쓰지말고 추가하라는 의미
			
			eval += (i == 5) ? i + " = " : i + " + ";	//3항연산자
//			
//			System.out.print(result);
			
		}
		System.out.println(eval);
	}

}
