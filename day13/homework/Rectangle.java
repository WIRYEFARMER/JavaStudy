package kr.ac.kopo.day13.homework;

public class Rectangle extends Shape{
	
	@Override
	public void ipta1() {
		System.out.print("직사각형의 가로 길이 입력 : ");
		inputa();
		System.out.print("직사각형의 세로 길이 입력 : ");
		inputb();
	}
	
	@Override
	public void area() {
		System.out.printf("가로가 %d이고 세로가 %d인 직사각형의 넓이는 %d 입니다."
				, geta(), getb(), geta() * getb());
	}


}
