package day03;

public class Ex02 {
	// 사각형의 면적을 float 형태로 구해서 출력하세요.
	// 가로 : 5, 세로 : 3
	public static void main(String[] args) {
		int garo = 5;
		int sero = 3;
		float area = garo * sero;
	//자동 형변환 됨
		System.out.println("가로가" + garo + "이고, 세로가 " + sero + " 인 사각형의 면적은 " + area + "입니다.");
	}

}
