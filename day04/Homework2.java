package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	System.out.println("첫번째 정수 입력 : ");
	int a1 = sc.nextInt();
	System.out.println("두번째 정수 입력 : ");
	int a2 = sc.nextInt();
	System.out.println("세번째 정수 입력 : ");
	int a3 = sc.nextInt();
	
	if (a1>a2 && a2>a3) {
		System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a1,a2,a3 );
	} else if (a1>a3 && a3>a2) {
		System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a1,a3,a2 );
	} else if (a2>a1 && a1>a3) {
			System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a2,a1,a3 );
	} else if (a2>a3 && a3>a1) {
		System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a2,a3,a1 );
	} else if (a3>a1 && a1>a2) {
		System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a3,a1,a2 );
	} else if (a3>a2 && a2>a1) {
		System.out.printf("첫번째 정수 : %d\n 두번째 정수 : %d\n 세번째 정수 : %d\n",a3,a2,a1 );
	}
	


	}
	
}