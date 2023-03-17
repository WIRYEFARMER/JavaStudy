package kr.ac.kopo.day02;

public class VariableMain02 {

	public static void main(String[] args) {
		
		double num = 12.34;
		
		num = (double)34;		//(double)이 붙은 이유 : int를 double로 형변환 +)앞에 (double)을 붙히지 않아도 묵시적형변환으로 int가 double 형변환 됨
		
		System.out.println("num : " + num);	

		int num2;
		num2 = (int)45.67;		//(int)이 붙은 이유 : double를 int로 형변환 +) 강제적(명시적)형변환
		
		System.out.println("num2 : " + num2);	
		
		float num3;
		num3 = (float)10.4;		//num3에 float를 선언 해도 에러나는 이유는 기본 double로 되어있어 강제적형변환을 필요로 함 
		num3 = 10.5f;		//뒤에 f를 붙히면 float로 인식
		
		System.out.println("num3 : " + num3);

		System.out.println(12 + (int)12.34);
		System.out.println(/*(double)*/12 + 12.34);		//double을 안쓰더라도 자연스럽게 큰 수의 형식을 따라가 형변환을 안하여도 됨
		
	}
	
}
