package kr.ac.kopo.day05.homework;
import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 4개를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		
		/*//방법1
		int max01 = num1 > num2 ? num1 : num2;
		int max02;
		if (num3 >num4) {
			max02 = num3;
		} else {
			max02=num4;
		}System.out.println("가장 큰 수 : " + (max01 >max02 ? max01 :max02));
		*/
		
		//방법2		
		int max= num1 > num2 ? num1 : num2;
		if (num3>max) {
			max=num3;
		}
		if (num4>max) {
			max=num4;
		}
		
		System.out.printf("가장 큰 수: " + max);
		
	}	
	
}
