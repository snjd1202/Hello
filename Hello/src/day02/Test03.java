package day02;

public class Test03 {
	
	public static void main(String[] args) {
		/*
		   main �Լ��� �Ű�����
		   	String[] args
		   �� ������ Ÿ���� String[] �̰�,
		   ���� �̸��� args �̴�.
		   ���⼭ []�� �迭�� ��Ÿ�� �� ����ϴ� ��ȣ�̴�.
		 */
		
		String[] arr = {"abcd", "efgh", "ijkl"};	//���� Ÿ���� ���ڸ� �ϳ��� �迭�Ҷ� / ���ڿ��� �� �迭
	
		/*
		  	���
		  		final ������Ÿ�� �����̸� = ������;
		 */
		setPi();
	}
	
	static final double PI = 3.14;
		
	public static void setPi() {
		System.out.println(PI);
	}
}
