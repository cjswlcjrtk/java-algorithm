package homework02;

import java.util.Scanner;

/**
 * 
 * 
To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요. *
 */
public class Ranking {

	public static void main(String[] args) {
		
		int total = 3;
		Scanner scan = new Scanner(System.in);
		double[] record = new double[total];
		String[] player = new String[] {"A", "B", "C"};
		
		
		System.out.println("선수 기록 등록기");
		for(int i = 0; i < total; i++) {
			System.out.printf("%s 선수 기록 : ", player[i]);
			record[i] = scan.nextDouble();						
		}
		
		
		for(int i = 0; i < total; i++) {
			for(int j = 0; j <total -1; j++ ) {
				if(record[j] > record[j+1] ) {
					double temp = record[j];
					record[j] = record[j+1];
					record[j+1] = temp;
					
					String temp2 = player[j];
					player[j] = player[j+1];
					player[j+1] = temp2;
					
				}
			}
		}
		
		
		for(int i = 0; i < total; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, player[i], record[i]);
		}
		

	}

}
