package study02;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학", "과탐", "사탐"};	
		int[] scores =new int[5];
//		System.out.printf("%s점수를 입력하세요.\n", subjects[0]);
//		int kor = scanner.nextInt();
//		System.out.printf("%s점수를 입력하세요.\n", subjects[1]);
//		int eng = scanner.nextInt();
//		System.out.printf("%s점수를 입력하세요.\n", subjects[2]);
//		int math = scanner.nextInt();
//		System.out.printf("%s점수를 입력하세요.\n", subjects[3]);
//		int science = scanner.nextInt();
//		System.out.printf("%s점수를 입력하세요.\n", subjects[4]);
//		int society = scanner.nextInt();
//		int[] scores = {kor, eng, math, science, society};
//		System.out.printf(subjects[0]+"점수 %d \n", scores[0]);
//		System.out.printf(subjects[1]+"점수 %d \n", scores[1]);
//		System.out.printf(subjects[2]+"점수 %d \n", scores[2]);
//		System.out.printf(subjects[3]+"점수 %d \n", scores[3]);
//		System.out.printf(subjects[4]+"점수 %d \n", scores[4]);
		for(int i=0; i < subjects.length; i++) {		
			System.out.printf("%s점수를 입력하세요.\n", subjects[i]);
			scores[i] = scanner.nextInt();
		}
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%s 점수 %d \n",subjects[i], scores[i]);
		}

	}

}
