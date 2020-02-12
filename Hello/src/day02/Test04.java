package day02;

public class Test04 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 5;
		int no3 = 3;
		double no4 = 3.; // ==> 3. == 3.0 과 같은 데이터
		System.out.println("no1 / no2 : " + (no1 / no2));
		System.out.println("no1 / no3 : " + (no1 / no3)); // 정수형이기 때문에 결과값도 정수로 (3)
		System.out.println("no1 / no4 : " + (no1 / no4)); //no4 = 실수형
		// 정수형끼리 연산은 정수, 정수,실수의 연산은 실수로 나타남.
		System.out.println("no1 % no3 : " + (no1 % no3));
		System.out.println("no1 + no2 : " + no1 + no2);
		//									10		5
		//					no1 + no2 =	105 (10,5)
	}
}
