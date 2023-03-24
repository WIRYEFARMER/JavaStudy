package kr.ac.kopo.day14.homework02;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(int width) {
		super(width, width);
		double area =(double) width * width;
		setArea(area);
	}


@Override
public void printArea() {
	System.out.printf("한변의 길이 %d 인 정사각형의 넓이 : %f\n",getWidth(),getArea());
	
}



}
