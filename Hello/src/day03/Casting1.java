package day03;

public class Casting1 {
	public static void main(String[] args) {
		float num1 = 10;
		
		  // float num2 = 10.;
		 
		
		// 1. ���� ����ȯ
		float num2 = (float) 10.;
		// 2. ���ͷ� ����ȯ
		float num3 = 10.F;
		
		// float Ÿ���� ���� area�� �������� 5�� ���� ���̸� �����ϼ���.
		
		float area = (float) (5 * 5 * 3.14);
		float area1 = 5 * 5 * 3.14f;
		
		System.out.println("��� : " + num2);
		System.out.println("��� : " + num3);
		System.out.println("��� : " + area);
		System.out.println("��� : " + area1);

	}
}
