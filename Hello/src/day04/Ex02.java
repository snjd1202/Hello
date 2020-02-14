package day04;

import java.util.*;
public class Ex02 {
	
		/*
		 	숙제 2]
		 		정수 3개를 입력받아서 
		 		세 수 중 큰 숫자만 출력되게 하세요.
		 		
		 		(삼항연산자 사용해서)
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32))
		
		// 풀이]
		
		// 1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		// 2. 메세지 출력, 입력받은 숫자 변수에기억하고 (3번 반복)
		System.out.print("첫 번째 정수를 입력하세요. : ");
		int no1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요. : ");
		int no2 = sc.nextInt();
		System.out.print("세 번째 정수를 입력하세요. : ");
		int no3 = sc.nextInt();
		
		// 3. 변수를 비교하고
		int result = (no1 >= no2) ? ((no1 > no3) ? no1 :no3) : ((no2 > no3) ? no2 : no3);
		
		// 4. 제일 큰 수 출력하고
		System.out.println("입력한 세 수 [" + no1 + ", " + no2 + ", " + no3 +
									"] 중 제일 큰 수는 [" + result + "] 입니다.");
		
		
		
	}
}
