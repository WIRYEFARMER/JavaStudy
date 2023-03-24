package kr.ac.kopo.day14.homework02;

public abstract class Figure implements areaPrintable {

	private double area;

	public double getArea() {
		return this.area;
		
	}
	
	public void setArea(double area) {
		this.area = area;
		
	}
	
	public abstract void printArea();

}
