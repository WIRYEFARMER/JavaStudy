package kr.ac.kopo.day12.homeworks;

import java.util.Scanner;

public class Circle extends Homework {
	int a;
	int b;
	double result;
	Scanner sc = new Scanner(System.in);
	
	public Circle() {
		super();
		
		
	}
	public Circle(int a,int b) {
	this.a=a;
	this.b=b;
	this.result=result;
	} 
	
	

	
	public void info() {
		
		System.out.println("반지름을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("반지름을 한번 더 입력하세요 : ");
		int b= sc.nextInt();
		result = (a * b * 3.14);
		System.out.printf("반지름 %d 원의 넓이는 %f입니다.",a,result);
		
	}
	}
	
	
	


