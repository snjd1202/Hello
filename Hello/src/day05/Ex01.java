package day05;

import java.util.*;
public class Ex01 {
		/*
		 	������ �Է¹޾Ƽ� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
		 	������
		 		A : 90 ~ 100
		 		B : 80 ~ 89
		 		C : 70 ~ 79
		 		D : 60 ~ 69
		 		F :  0 ~ 59 
		 */	
	public static void main(String[] args) {
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼��� ����ϰ�
		System.out.print("������ �Է��ϼ���. : ");
		// �Է¹޾� ������ ���
		int score = sc.nextInt();
		// ����� ������ �����
		String grade = ""; // char grade = ""; --> ??
		// ����ó���ϰ�
		if(score >= 90 && score == 100) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70 ){
			grade = "C";
		} else if(score >= 60) {
			grade= "D";
		} else {
			grade = "F";
		}
		
		System.out.println("�Էµ� ���� " + score + "�� ������ " + grade + "�Դϴ�.");
	}
}
