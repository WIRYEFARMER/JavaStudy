package kr.ac.kopo.day13.homework;

public class Circle extends Shape {


	@Override
	public void ipta1() {

		System.out.print("원의 반지름 입력 : ");
		inputa();
	}
	@Override
	public void area() {
		System.out.printf("반지름이 %d인 원의 넓이는 %.1f 입니다.\n", geta(), geta() * geta() * 3.14);
	}


}
