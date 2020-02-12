package day03;

public class Test02 {
	public static void main(String[] args) {
		/*
		  	증감연산자 ( ++, -- )
		  		: 연산기호를 기준으로 기호 다음 처음 나오는 변수에 1을 더해주거나, 빼준다.
		 */
		
		int no = 10;
		int num = 10;
		// no++;
		System.out.println("no : " + no++); // ++기호가 no뒤에 있기 때문에 다음 no에 + 됨.
		System.out.println("no : " + no);
		System.out.println("no : " + no); // 여기엔 영향 x, ++은 딱 한번만 영향. 
		System.out.println("num : " + ++num);
		
	}
}
