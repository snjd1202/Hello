package day04;

import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		// 1. �Է� ���� �غ�
		Scanner sc = new Scanner(System.in);
		
		// 2. �޼��� ���
		System.out.println("������ �Է��ϼ���! : ");
		
		// 3. �Է� ������ �޾Ƽ� ������ ���
		int no = sc.nextInt();
		sc.close(); // sc �ݾ��ֱ�. ��� �����
		
		// 4. �Ǻ��ϰ�
		String str = "";
		if(no % 2 ==0) {
			if(no < 0) {
				str = "���� ¦��";
			} else {
				str = "���� ¦��";
			}
		//	str = "¦��"; 
		} else {
			str = "Ȧ��";
		}
		
		// 5. ����ϰ�
		System.out.println("�Էµ� ���� [ " + no + " ] �� " + str + " �Դϴ�.");
	}
}
