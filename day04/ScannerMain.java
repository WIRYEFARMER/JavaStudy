package kr.ac.kopo.day04;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String args[]) {
		
		
		
		
		
	Scanner sc = new Scanner(System.in);		//scanner 선언 입력 받음
	
	System.out.print("문자를 입력 : ");			
	char ch = sc.nextLine().charAt(0);		//문자를 입력받는 방법 nextChar();는 없음!!
	System.out.print("입력받은 문자 : " + ch);
	
	System.out.print("문자열을 입력 : " );		//문자열을 입력 받을 프린트문
	//String str = sc.next();		//입력 받는 곳
	String str = sc.nextLine();
	
	
	System.out.println("str : " + str);		//입력 받은 곳이 출력 되는 곳
	
	System.out.print("정수를 입력 : ");
	int num = sc.nextInt();
	
	System.out.println("입력 받은 정수는 ? : " + num);
	
	System.out.print("실수입력 : ");
	double num2 = sc.nextDouble();
	
	System.out.println("입력받은 실수는 ? :" +num2);
	
}
}
