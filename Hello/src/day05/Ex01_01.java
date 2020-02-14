package day05;

import java.util.*;
public class Ex01_01 {
		/*
		 	점수를 입력받아서 학점을 출력해주는 프로그램을 작석하세요.
		 	학점은
		 		A : 90 ~ 100
		 		B : 80 ~ 89
		 		C : 70 ~ 79
		 		D : 60 ~ 69
		 		F :  0 ~ 59 
		 */	
	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고
		System.out.print("점수를 입력하세요. : ");
		// 입력받아 변수에 담고
		int score = sc.nextInt();
		// 출력할 변수를 만들고
		char grade = ' '; // char grade = ""; --> ?? char grade = ' '; 공백이라도 넣어줘야함.
		// 조건처리하고
		int tmp = score / 10;
		switch(tmp) {
		case 10:
			grade = 'A';
			break;	
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("입력된 점수 [" + score + "] 의 학점은 [" + grade + "] 입니다.");
	}
}
