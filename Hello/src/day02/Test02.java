package day02;

/*
 * ���� ��¥�� ����ϴµ� 
 * ��¥�� �ش��ϴ� �����ʹ� ������ ������ ��Ƽ� ����غ�����.
 * 
 * ����]
 * 		������ ���� ����� ���
 * 			���� 1]
 * 				int �����̸�; 		// ���� ����
 * 				�����̸�  = ������;	//���� �ʱ�ȭ
 * 			���� 2]
 * 				int �����̸� = ������;	//���� ���� & ���� �ʱ�ȭ
 * 
 * 			****
 * 			���� ����� ����
 * 				
 * 				������ Ÿ��		�����̸�  = ������ ;
 * 
 *  			��]
 *  				1. ����
 *    					char ch = 'A';
 *  				2. ������
 *  					boolean bool = true;
 *  				3. ����
 *  					int no = 7;
 *  				4. �Ǽ�
 *  					double val = 3.14;
 *  				5. ���ڿ� : ���ڿ��� �⺻�� Ÿ���� �ƴ�����, 
 *  							����� ���Ǵ� �������̱� ������
 *  							�ڹٿ��� ���Ǹ� �������ְ� �ִ�.
 *  							
 *  					a. 
 *  						String str1 = "abcd";
 *  					b. 
 *  						String str2 = new String("abcd");
 *  
 *  		���� �ۼ� ����
 *  			
 *  			[����������] [�Ӽ�(static..)] ������Ÿ��(int, String..) �����̸� = ������;
 *  
 */
public class Test02 {
	// ���ڿ� ����
	static String msg = "������ ";
	static int month = 2;
	static int day = 12;

	int num1 = 100;
	int num2 = 500;
	
	public static void main(String[] args) {
		int m;
		m = 2;
		int d;
		d = 11;
		
		System.out.println("������ " + m + "�� " + d + "�� �Դϴ�." );
		
		int mn = 2;
		int dy = 11;
		
		System.out.println("������ " + mn + "�� " + dy + "�� �Դϴ�.");
		System.out.println();
		
	
		
		System.out.println(msg + month + "�� " + day + "�� �Դϴ�.");
		
		}
	
			/*
			 *	class2�� �ܾ�� Teacher�� �����ؼ� ������ �̸��� ���� ���
			 *
			 *			1. camel ǥ���
			 *					String class2Teacher = "������";
			 *
			 *			2. snake ǥ���
			 *					String class2_teacher = "������";
			 */
}