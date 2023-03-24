package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public abstract class Shape {
	
	private Scanner sc = new Scanner(System.in);
	
	private int a;
	private int b;
	
	public abstract void ipta1();
	public abstract void area();
	
	
	public void inputa() {
		this.a = sc.nextInt();
		
	}
	public void inputb() {
		this.b = sc.nextInt();
		
	}
	
	
	int geta() {
		return a;
	}
	int getb() {
		return b;
	}

}
