package day03;

public class Ex01 {
	// �غ��� 7�̰�, ���̰� 6�� �ﰢ���� ������ ���ϼ���.
	// ��, ������ ������Ÿ���� float�� �����ϼ���.
	public static void main(String[] args) {
		int garo = 7;
		int sero = 6;
		float area = garo * sero * 0.5f;
		float area2 = garo * sero / 2.f;
		
		 System.out.println("�غ��� " + garo + "�̰� ���̴�" + sero + "�� �غ��� ������ " + area + "�Դϴ�.");
		 System.out.println("�غ��� " + garo + "�̰� ���̴�" + sero + "�� �غ��� ������ " + area2 + "�Դϴ�.");
	}
}
