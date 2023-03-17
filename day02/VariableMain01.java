package kr.ac.kopo.day02;

public class VariableMain01 {

	public static void main(String[] args) {
		char ch;
		ch = 'A';
		
		{
			int a = 10;
			System.out.println("a : " + a);
		}
//		a = 20;	//문법 오류가 발생되는 이유를 araboza.
		
		ch= '!';
		ch = 80;
		ch = '\u0061';
		System.out.println("ch : " + ch);


	}

}
