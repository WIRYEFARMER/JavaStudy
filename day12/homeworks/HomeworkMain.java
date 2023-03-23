package kr.ac.kopo.day12.homeworks;

import java.util.Scanner;



public class HomeworkMain {
	
	public static void main(String[] args) {
		
		System.out.println("1.삼각형 2.정사각형 3. 직사각형 4.원");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Triangle t = new Triangle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();


		
		
			switch(i) {
			case 1:
				t.info();
				break;
				
			
			case 2:
				s.info();
				break;
				
			case 3:
				r.info();
				break;
			case 4:
				c.info();
				break;
				
		}
		
		
		
		
		
	}
}


