package day05;


/*
 	�ݺ��� - do ~ while �ݺ���
 		� ���� ��� �� ���� �����Ű�� �ݺ���
 		
 		����]
 			do {
 				���๮
 			} while(���ǽ�);
 */
public class Test05 {
	public static void main(String[] args) {
		boolean bool = false;
		do {
			System.out.println("�� ���� �����մϴ�.");
		} while(bool);
		
		int i = 0;
		do {
			System.out.println(++i);
//			i++;
			/*
			 	i		++i
			 	0		 1
			 	1		 2
			 	2		 3
			 	3		 4
			 	4		 5
			 */
		} while(i<5);
	}
}
