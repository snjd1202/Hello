package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		System.out.println((no1 > no2) && (no1++ < no2));
		// && = ���迬��, �ڿ� ���� ������ ������ ����. �׷��� ��� �� no1�� 10.
		System.out.println("no1 : " + no1);
		// no1 > no2�� �����̰� �� ��ü ����� �ڸ� ���� ���ص� �����̴� �� ������ ���� ����.
		
		
		System.out.println((no1 > no2) || (no1++ < no2));
		// || = �� ������ �����̱� ������ �� ������� ����. �׷��� ��� �� no1�� 11.
		// �� ������ ���̸�, �� ���� ���� �ʱ� ������ ��� �� no1�� 10.
		System.out.println("no1 : " + no1);
	}
}
