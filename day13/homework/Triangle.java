package kr.ac.kopo.day13.homework;

public class Triangle extends Shape {

	@Override
	public void ipta1() {
		System.out.print("삼각형 밑변 입력 : ");
		inputa();
		System.out.print("삼각형 높이 입력 : ");
		inputb();
	}

	@Override
	public void area() {
		System.out.printf("밑변이 %d이고 높이가 %d인 삼각형의 넓이는 %d 입니다.", geta(), getb(), geta() * getb() / 2);
	}

}
