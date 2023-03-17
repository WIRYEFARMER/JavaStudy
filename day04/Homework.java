package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("반지름 입력 : ");
	int circle = sc.nextInt();
	double square = (circle * circle * 3.14);
	double pi = (circle * 3.14);
	
	System.out.printf("원둘레  : %.4f " , pi);
	System.out.printf("원넓이 : %.4f " , square);
	
	}
	
}