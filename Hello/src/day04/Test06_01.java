package day04;

import java.util.*;
public class Test06_01 {
	/*
	 	��� - ���α׷��� �帧�� �����ϴ� ����
	 		����
	 			1. ���ǹ� - ������ �ְ�, ���ǿ� ������ �����ϴ� ����
	 				if, if ~ else, if ~ else if ~ else, switch ~ case
	 				
	 				1) if��
	 					����] 
	 						a)
	 						if(���ǽ�(b)){
	 							���๮��(c)
	 						}	 						
	 						(d)
	 						
	 						b�� ��(true)�� ��� : a - b - c - d
	 						b�� ����(false)�� ��� : a - b - d
	 						
	 				2) ���� pdf ����..
	 				
	 			2. �ݺ��� - �ݺ��� �����ϴ� ����
	 				for, while, do ~ while, ���� for ���
	 */
	public static void main(String[] args) {
		// ���� �ڵ带 �����, �ڵ带 �Է��ϸ� ������ ���������.
		final int KOR = 1001;
		final int ENG = 1002;
		final int MATH = 1003;
		final int SCI = 1004;
		
		// ���� �̸� ���� ���� ����
		String sub = "programming";
	
		
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		
		// �޼��� ����ϰ�
		System.out.println("���� �ڵ带 �Է��ϼ���! :");
		
		// �ڵ尪 �Է¹޾� �����ϰ�
		int code = sc.nextInt();
		sc.close();
		
		switch(code) {
		case KOR:
			sub = "����";
			System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");

//			break;
		case ENG:
			sub = "����";			
			System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");

//			break;
		case MATH:
			sub = "����";
			System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");

//			break;
		case SCI:
			sub = "����";		System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");
			System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");

//			break;
		default:
			sub = "����";
			System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");

			
		}
		
//		System.out.println("�Էµ� �ڵ�� " + sub + " ���� �Դϴ�.");
		
	}
}
