package kr.ac.kopo.day12.homeworks;

import java.util.Scanner;

public class Square extends Homework {
	int a;
	int b;
	double result;
	Scanner sc = new Scanner(System.in);
	
	public Square() {
		super();
		
		
	}
	public Square(int a,int b) {
	this.a=a;
	this.b=b;
	this.result=result;
	} 
	
	

		
		
	
	
	public void info() {
		
		System.out.println("한변의 길이를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("한변의 길이를 한번 더 입력하세요 : ");
		int b= sc.nextInt();
		result = (a * b);
		System.out.printf("가로 %d 세로%d의 넓이는 %f입니다.",a,b,result);
		
	}
	}
	
	
	


