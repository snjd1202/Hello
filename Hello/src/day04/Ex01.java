package day04;

import java.util.*;
public class Ex01 {
	
		/*
		 	���� 1]
		 		���ĺ� ���� �ϳ��� �Է� �޾Ƽ�
		 		�ҹ��ڸ� �빮�ڷ�, �빮�ڸ� �ҹ��ڷ� ��ȯ�ؼ� ����ϼ���.
		 		
		 		'a' - 'A' ===> 32
		 		
		 		'b' - 32 ==> 'B'
		 		
		 	���� 2]
		 		���� 3���� �Է¹޾Ƽ� 
		 		�� �� �� ū ���ڸ� ��µǰ� �ϼ���.
		 		
		 		(���׿����� ����ؼ�)
		 */
	public static void main(String[] args) {
	//	System.out.println((char)('a' - 32));
		
		// ���� 1��.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ��� �Է��ϼ���! : ");
		String str1 = sc.nextLine();
		
		char ch1 = str1.charAt(0);
						
		String str2 = "�Էµ� ���� " + ch1 + "��  " + ((ch1 >= 'a') ? "��" : "��") +" ���� "+ (ch1 < 'a' ? (char)(ch1 + 32) : (char)(ch1 - 32)) + "�� �����Ͽ����ϴ�." ;
		
		System.out.println(str2);
		System.out.println();
		
		// ���� 2��.
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���! : ");
		String str3 = sc1.nextLine();
		
		char ch2 = str3.charAt(0);
		
		String str4 = "�Էµ� ���� " + ch2 + "�� ���� ū ���� " + ((ch2 > 3) ? ((ch2 > 2) ? "a": "s"):"d") + "�Դϴ�.";
		
		
		
	}
}
