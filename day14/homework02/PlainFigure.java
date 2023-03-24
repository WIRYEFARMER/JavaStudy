package kr.ac.kopo.day14.homework02;
//Figure에 추상메소드가 있어 PlainFigure는 추상메소드를 포함하지 않아도 추상클래스로 사용가능
public abstract class PlainFigure extends Figure {
	private int width;
	private int height;
	
	public PlainFigure() {
		
	}
	
	public PlainFigure(int width,int height) {
		this.width = width;
		this.height= height;
	}
	
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	@Override
	public void setArea(double area) {
		super.setArea(area);  		//부모의 area를 받음.
	}

}
