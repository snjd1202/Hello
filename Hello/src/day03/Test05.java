package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		System.out.println((no1 > no2) && (no1++ < no2));
		// && = 절삭연산, 뒤에 나온 연산은 읽지도 않음. 그래서 출력 시 no1은 10.
		System.out.println("no1 : " + no1);
		// no1 > no2는 거짓이고 이 전체 결과는 뒤를 실행 안해도 거짓이니 뒷 연산은 읽지 않음.
		
		
		System.out.println((no1 > no2) || (no1++ < no2));
		// || = 앞 연산이 거짓이기 때문에 뒷 연산까지 읽음. 그래서 출력 시 no1은 11.
		// 앞 연산이 참이면, 뒷 연산 읽지 않기 때문에 출력 시 no1은 10.
		System.out.println("no1 : " + no1);
	}
}
