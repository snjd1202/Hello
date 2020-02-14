package day04;

import java.util.*;
public class Ex01 {
	
		/*
		 	숙제 1]
		 		알파벳 문자 하나를 입력 받아서
		 		소문자면 대문자로, 대문자면 소문자로 변환해서 출력하세요.
		 		
		 		'a' - 'A' ===> 32
		 		
		 		'b' - 32 ==> 'B'
		 		
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32));
		
		// 숙제 1번
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요! : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
						
		String str2 = "입력된 문자 " + ch + "를  " + ((ch >= 'a') ? "대" : "소") +" 문자 "+ (ch < 'a' ? (char)(ch + 32) : (char)(ch - 32)) + "로 변경하였습니다." ;
		
		System.out.println(str2);
		System.out.println();
	
		
		// 풀이]
		
		// 1. 입력받을 준비
		Scanner sc1 = new Scanner(System.in);
		
		// 2. 메세지 출력
		System.out.println("문자를 입력하세요. : ");
		
		// 3. 입력데이터 변수에 담고
		String str1 = sc.nextLine();
		
		// 4. 변수에 담긴 문자열에서 문자 추출
		char ch1 = str1.charAt(0);
		
		// 5. 변환해서 변수에 담고
		char ch2 = (ch1 >= 'a') ? (char)(ch1 -('a'-'A')) : (char)(ch1 +('a' - 'A'));
		
		// 6. 출력
		System.out.println("입력한 문자 [" + ch1 + "]를 변환하면 [" + ch2 + "] 입니다.");
		
		
	}
}
