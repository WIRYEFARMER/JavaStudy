package kr.ac.kopo.day14.homework02;

public class Rectangle extends PlainFigure {
	public Rectangle() {
		
	}
	
	public Rectangle(int width,int height) {
		super(width,height);
		double area =(double) width * height;
		setArea(area);
		
	}

	@Override
	public void printArea() {
		System.out.printf("한변의 길이 %d 한변의 길이%d인 직사각형의 넓이 : %f\n",getWidth(),getHeight(),getArea());
		
	}
	
	

}
