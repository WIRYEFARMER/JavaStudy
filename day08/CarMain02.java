package kr.ac.kopo.day08;


//실행 클래스


public class CarMain02 {
	
	

public static void main(String[] args) {
	
	Car c = new Car();			//heap영역에 Car클래스 생성
	c.model= "소나타";
	c.price= 3000;
	
	Car c2= new Car();
	c2.model = "모닝";
	c2.price = 1900;
	
	Car c3= new Car();
	c3.model = "BMW";
	c3.price = 8000;
	
	Car[] carArr = {c,c2,c3};
	
	//System.out.println(c.model + c.price);
	//System.out.println(c2.model + c2.price);
	//System.out.println(c3.model + c3.price);
	
	for (int i = 0; i<carArr.length; i++) {
		System.out.println("모델명 : " + carArr[i].model + " 가격 : " +carArr[i].price);
		
	}
}
}
