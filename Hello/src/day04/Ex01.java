package day04;

import java.util.*;
public class Ex01 {
	
		/*
		 	���� 1]
		 		���ĺ� ���� �ϳ��� �Է� �޾Ƽ�
		 		�ҹ��ڸ� �빮�ڷ�, �빮�ڸ� �ҹ��ڷ� ��ȯ�ؼ� ����ϼ���.
		 		
		 		'a' - 'A' ===> 32
		 		
		 		'b' - 32 ==> 'B'
		 		
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32));
		
		// ���� 1��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ��� �Է��ϼ���! : ");
		String str = sc.nextLine();
		
		char ch = str.charAt(0);
						
		String str2 = "�Էµ� ���� " + ch + "��  " + ((ch >= 'a') ? "��" : "��") +" ���� "+ (ch < 'a' ? (char)(ch + 32) : (char)(ch - 32)) + "�� �����Ͽ����ϴ�." ;
		
		System.out.println(str2);
		System.out.println();
	
		
		// Ǯ��]
		
		// 1. �Է¹��� �غ�
		Scanner sc1 = new Scanner(System.in);
		
		// 2. �޼��� ���
		System.out.println("���ڸ� �Է��ϼ���. : ");
		
		// 3. �Էµ����� ������ ���
		String str1 = sc.nextLine();
		
		// 4. ������ ��� ���ڿ����� ���� ����
		char ch1 = str1.charAt(0);
		
		// 5. ��ȯ�ؼ� ������ ���
		char ch2 = (ch1 >= 'a') ? (char)(ch1 -('a'-'A')) : (char)(ch1 +('a' - 'A'));
		
		// 6. ���
		System.out.println("�Է��� ���� [" + ch1 + "]�� ��ȯ�ϸ� [" + ch2 + "] �Դϴ�.");
		
		
	}
}
