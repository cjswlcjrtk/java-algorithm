package study02;

import java.util.Scanner;

public class OddSequence {

	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 = 25
		// 1 % 2 = 0 이면 짝수, 1이면 홀수				
		String sequence = "";
		int series = 0;
		
//		for(int i=1; i<=10; i++) {
//			if(i % 2 != 0) {
//				if(i != 9) {
//					sequence += i + "+";
//				}else {
//					sequence += i + "=";
//				}
//				series += i;
//				
//			}
//			
//			
//		}	
		
//		for(int i=1; i<10; i++) {			
//			if(i % 2 != 0) {
//				sequence += (i == 9) ? i + " = " : i + " + ";				
//				series += i;
//			}
//		}
//		System.out.println(sequence + series);
//	}
		System.out.println("==================");
		System.out.println("입력된 시작값에서부터 마지막값까지 홀수의 합");
		System.out.println("==================");
		int start = 0;
		int end = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값을 입력해주세요");
		start = scan.nextInt();
		System.out.println("마지막 값을 입력해주세요");
		end = scan.nextInt();
		
//		for(int i=start; i<=end; i++) {
//			if(i % 2 != 0) {
//				int end2 = 0;
//				if(end % 2 == 0) {
//					end2 = end -1;					
//				}else {
//					end2 = end;
//				}
//				if(i != end2) {
//					sequence += i + "+";
//					
//				}else {
//					sequence += i + "=";
//				}
//				series += i;
////				sequence += (i != end) ? i + " + " : i + " = ";		
////				series += i;
//			}
//		}
//		System.out.println(sequence + series);
		if(start < end) {
			for(int i=start; i<=end; i++) {
				if(i % 2 != 0) {
					int end2 = 0;
					if(end % 2 == 0) {
						end2 = end -1;					
					}else {
						end2 = end;
					}
					if(i != end2) {
						sequence += i + "+";
						
					}else {
						sequence += i + "=";
					}
					series += i;
				}
			}
//			System.out.println(sequence + series);
			
		}else if(start > end) {
			for(int i=end; i<=start; i++) {
				if(i % 2 != 0) {
					int end2 = 0;
					if(start % 2 == 0) {
						end2 = start -1;					
					}else {
						end2 = start;
					}
					if(i != end2) {
						sequence += i + "+";
						
					}else {
						sequence += i + "=";
					}
					series += i;
				}
			}
//			System.out.println(sequence + series);
		}
		System.out.println(sequence + series);
		
	
	}

}
