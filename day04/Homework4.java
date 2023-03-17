package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	System.out.println("첫번째 정수 입력 : ");
	int a1 = sc.nextInt();
	System.out.println("두번째 정수 입력 : ");
	int a2 = sc.nextInt();
	System.out.println("세번째 정수 입력 : ");
	int a3 = sc.nextInt();
	System.out.println("네번째 정수 입력 : ");
	int a4 = sc.nextInt();
	
	if ( (a2<a1) && (a3<a1) && (a4<a1)){
		System.out.printf("가장큰수 :%d ", a1);
	}else if ((a1<a2)&&(a3<a2)&&(a4<a2)) {
		System.out.printf("가장큰수 :%d ", a2);
	}else if ((a1<a3) &&(a2<a3)&&(a4<a3)) {
		System.out.printf("가장큰수 :%d ", a3);
	}else {
		System.out.printf("가장큰수 :%d ", a4);
	}
	


	}
	
}