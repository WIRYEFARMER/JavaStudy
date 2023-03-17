package kr.ac.kopo.day04;
import java.util.Scanner;


/* 1~3사이의 정수 입력 : 
 * 1 입력시 ==> one
 * 2 입력시 ==> two
 * 3 입력시 ==> three
 * 이외 입력시 ==>> error
 * */
public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3정수 입력 : ");
		int no = sc.nextInt();
		/*
		if (no==1) {
			System.out.println("one");
		} else if (no==2) {
			System.out.println("two");
		} else if (no==3) {
			System.out.println("three");
		} else {
			System.out.println("error");
		}*/
		
		switch(no) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("error");
			
		}

	}

}
