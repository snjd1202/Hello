package day04;

import java.util.*;
public class Test02 {
			/*
		  	�ֿܼ��� ����(����) 2���� �Է¹޾� ����(no1, no2)�� �����ϰ�,
		  	�� ���� ���ؼ� no1dl no2���� ũ�� "no1�� no2���� Ů�ϴ�."
		  	������ "no1�� no2���� �۽��ϴ�." ��� �޼����� ��µǰ� �ϼ���.
		  	
		  	����]
		  		�ܼ�ȯ�濡�� �����͸� �Է¹޴� ���
		  		
		  		Scanner sc = new Scanner(System.in); // �ֿܼ��� �ԷµǴ� �����͸� �����ϴ� Ŭ����
		  		(������ 	����)
		  		
		  		// �ԷµǾ� �մ� �����ʹ� ������ Ÿ�Կ� �°� ������ ����ϸ� �ȴ�.
		  		 int no1 = sc.nextInt(); // �Էµ� ������ ������ �Լ�
		  		 
		 */
		public static void main(String[] args) {
			// Scanner �����
			Scanner sc = new Scanner(System.in);
			
			// �޼����� ����
			System.out.print("no1�� ���� ������ �Է��ϼ���! : ");
			
			// ���� ������ ���� ������ �����
			int no1, no2;
			
			// ���ڸ� ������ no1�� ���
			no1 = sc.nextInt();
			System.out.println();
			
			// �� ��° ���ڸ� �Է¹��� �޼����� ����ϰ�
			System.out.print("no2�� ���� ������ �Է��ϼ���! : ");
			
			// no2�� ������ ������ ���
			no2 = sc.nextInt();
			System.out.println();
			
			// ��� �޼����� ���� ������ �����
			String msg = new String();
			
			// ���� �����ڷ� ���ڸ� ���ؼ� �޼����� ������ ���
			msg = (no1 > no2) ? (no1 + "�� " + no2 + "���� Ů�ϴ�.") : (no1 + "�� " + no2 + "���� �۽��ϴ�.");
			
			// �޼����� ����Ѵ�.
			System.out.println(msg);

	}
}
