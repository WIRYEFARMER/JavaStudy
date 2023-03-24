package kr.ac.kopo.day13.homework;

public class Square extends Shape {

	@Override
	public void ipta1() {
		System.out.print("정사각형의 한 변의 길이 입력 : ");
		inputa();
	}

	@Override
	public void area() {
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이는 %d 입니다.\n", geta(), geta() * getb());
	}

}
