package day04;

import java.util.*;
public class Test07 {
	/*
	 	������ �Է¹޾� �Էµ� ���� ¦������, Ȧ������ �Ǻ��ϼ���.
	 */
	public static void main(String[] args) {
		// �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ���
		System.out.print("������ �Է��ϼ���! : ");
		// �Է°� �����ؼ� ������ ���
		int no = sc.nextInt();
		
		// �Ǻ��ϰ�
		if(no % 2 == 0) {
			System.out.println(no + " �� ¦�� �Դϴ�.");
		}
		
		if(no % 2 != 0) {
			System.out.println(no + " �� Ȧ�� �Դϴ�.");
		}
		
		//--------------------------------------------------
		
		String msg = "Ȧ��";
		if(no % 2 == 0) {
			msg = "¦��";
		}
		
		System.out.println(no + " �� " + msg + " �Դϴ�.");
	}
}
