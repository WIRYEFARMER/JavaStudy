package kr.ac.kopo.day05.homework;
import java.util.Scanner;
public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력 하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = num1 ,max = num2;
		
		if(num1 > num2) {
			min = num2;
			max = num1;
		}
		
		if (num3 < min) {
			System.out.println(num3 + " < " + min + " < " + max);
		} else if (num3 < max) {
			System.out.println(min + " < " + num3 + " < " + max);
			} else {
			System.out.println(min + " < " + max + " < " + num3);
		}
		
		
		
		
		
		/*
		System.out.println(num1+" : " + num2 + " : " + num3);
		
		if(num1 <num2 && num2 <num3) {
			
		} else if (num1 <num3 && num3 <num2) {
			
		} else if (num2 <num1 && num1 < num3) {
			
		} else if (num2 < num3 && num3 <num1) {
			
		} else if (num3 < num1 && num1 <num2) {
			
		} else { System.out.printf("가장 큰 수 : %d" , num3);
		
	}
*/
	}
}
