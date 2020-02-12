package day02;

public class Test03 {
	
	public static void main(String[] args) {
		/*
		   main 함수의 매개변수
		   	String[] args
		   는 데이터 타입이 String[] 이고,
		   변수 이름이 args 이다.
		   여기서 []는 배열을 나타낼 때 사용하는 기호이다.
		 */
		
		String[] arr = {"abcd", "efgh", "ijkl"};	//같은 타입의 문자를 하나로 배열할때 / 문자열로 된 배열
	
		/*
		  	상수
		  		final 데이터타입 변수이름 = 데이터;
		 */
		setPi();
	}
	
	static final double PI = 3.14;
		
	public static void setPi() {
		System.out.println(PI);
	}
}
