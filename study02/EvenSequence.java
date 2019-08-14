package study02;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sequence = "";
		int series = 0;
		System.out.println("시작값");
		int start = scanner.nextInt();
		System.out.println("끝값");
		int end = scanner.nextInt();
		;
		for(int i=start; i<end; i++) {
			if(i % 2 == 0) {
				if(i != 10) {
					sequence += i + "+";
				}else {
					sequence += i + "=";
				}			
				series += i;
				
			}
			
		}
		System.out.println(sequence + series);

	}

}
