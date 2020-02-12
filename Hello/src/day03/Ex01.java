package day03;

public class Ex01 {
	// 밑변이 7이고, 높이가 6인 삼각형의 면적을 구하세요.
	// 단, 면적의 데이터타입은 float로 저장하세요.
	public static void main(String[] args) {
		int garo = 7;
		int sero = 6;
		float area = garo * sero * 0.5f;
		float area2 = garo * sero / 2.f;
		
		 System.out.println("밑변이 " + garo + "이고 높이는" + sero + "인 밑변의 면적은 " + area + "입니다.");
		 System.out.println("밑변이 " + garo + "이고 높이는" + sero + "인 밑변의 면적은 " + area2 + "입니다.");
	}
}
