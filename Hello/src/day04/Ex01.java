package day04;

import java.util.*;
public class Ex01 {
	
		/*
		 	숙제 1]
		 		알파벳 문자 하나를 입력 받아서
		 		소문자면 대문자로, 대문자면 소문자로 변환해서 출력하세요.
		 		
		 		'a' - 'A' ===> 32
		 		
		 		'b' - 32 ==> 'B'
		 		
		 	숙제 2]
		 		정수 3개를 입력받아서 
		 		세 수 중 큰 숫자만 출력되게 하세요.
		 		
		 		(삼항연산자 사용해서)
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32));
		
		// 숙제 1번.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요! : ");
		String str1 = sc.nextLine();
		
		char ch1 = str1.charAt(0);
						
		String str2 = "입력된 문자 " + ch1 + "를  " + ((ch1 >= 'a') ? "대" : "소") +" 문자 "+ (ch1 < 'a' ? (char)(ch1 + 32) : (char)(ch1 - 32)) + "로 변경하였습니다." ;
		
		System.out.println(str2);
		System.out.println();
		
		// 숙제 2번.
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요! : ");
		String str3 = sc1.nextLine();
		
		char ch2 = str3.charAt(0);
		
		String str4 = "입력된 문자 " + ch2 + "중 가장 큰 수는 " + ((ch2 > 3) ? ((ch2 > 2) ? "a": "s"):"d") + "입니다.";
		
		
		
	}
}
