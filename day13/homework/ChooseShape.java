package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class ChooseShape {

	void ChooseShape() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1.정사각형 2.직사각형 3.삼각형 4.원 ==>입력하쇼");
	
	int a = sc.nextInt();
	
	Shape sp = null;
	
	switch (a) {
	case 1:
		sp = new Square();
		break;
		
	case 2:
		sp = new Rectangle();
		break;
		
	case 3:
		sp = new Triangle();
		break;
		
	case 4:
		sp = new Circle();
		break;
		default :
			System.out.println("잘못 입력 했어여");
			break;
			
			
			
	}
	if (sp != null) {
		sp.ipta1();
		sp.area();
	}
	}
	
	

}
