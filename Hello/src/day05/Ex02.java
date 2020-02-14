package day05;

/*
 	문제]
 		알파벳 'O' 부터 순차적으로 문자를 5개를 만들어서 출력하세요.
 */

public class Ex02 {
	public static void main(String[] args) {
		
		// 변수 선언하고 초기화하고
			char ch = 'O';
			int num = 3;
		for(int i=0; i<5; i++) {
			//반복해서 출력하고
			System.out.println((char)(ch + i));
//			System.out.println(num + i);
		}
	}
}
