package day03;

public class Test04 {
	public static void main(String[] args) {
		/*
		 	�� ������
		 		: �� ���� �����͸� ���� �� ����ϴ� ������
		 			���� ������� �׻� true �Ǵ� false �� ��ȯ���ش�.
		 		
		 		>, <, ==, >=, <=, !=(�ٸ���?)
		 		����]
		 			>=, <= : o
		 			=>, =< : x
		 */
		int no1 = 10;
		int no2 = 12;
		System.out.println("1. no1 > no2 : " + (no1 > no2));
		System.out.println("2. no1 == no2 - 2 : " + (no1 == no2 - 2));
		System.out.println("3. no1 != no2 : " + (no1 != no2));
		System.out.println("4. !(no1 == no2) : " + !(no1 == no2));
	}
}
