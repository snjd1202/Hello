package day04;

import java.util.*;
public class Ex02 {
	
		/*
		 	���� 2]
		 		���� 3���� �Է¹޾Ƽ� 
		 		�� �� �� ū ���ڸ� ��µǰ� �ϼ���.
		 		
		 		(���׿����� ����ؼ�)
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32))
		
		// Ǯ��]
		
		// 1. �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		
		// 2. �޼��� ���, �Է¹��� ���� ����������ϰ� (3�� �ݺ�)
		System.out.print("ù ��° ������ �Է��ϼ���. : ");
		int no1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���. : ");
		int no2 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���. : ");
		int no3 = sc.nextInt();
		
		// 3. ������ ���ϰ�
		int result = (no1 >= no2) ? ((no1 > no3) ? no1 :no3) : ((no2 > no3) ? no2 : no3);
		
		// 4. ���� ū �� ����ϰ�
		System.out.println("�Է��� �� �� [" + no1 + ", " + no2 + ", " + no3 +
									"] �� ���� ū ���� [" + result + "] �Դϴ�.");
		
		
		
	}
}
