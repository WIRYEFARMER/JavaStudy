package kr.ac.kopo.day08;


//실행 클래스


public class CarMain01 {
	
	
	
public static void main(String[] args) {
	
	Car c = new Car();			//heap영역에 Car클래스 생성
	Car c2= new Car();
	Car c3= new Car();
	
	c.model= "소나타";
	c.price= 3000;
	c2.model = "모닝";
	c2.price = 1900;
	c3.model = "BMW";
	c3.price = 8000;
	
	System.out.println(c.model + c.price);
	System.out.println(c2.model + c2.price);
	System.out.println(c3.model + c3.price);
}
}
