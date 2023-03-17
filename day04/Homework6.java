package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	System.out.println("보유하고 있는 책 권수 : ");
	int book = sc.nextInt();
	
	switch(book) {
	case 0:
		System.out.println("보유하고 있는 책이 없수다");
		break;
	case 1:
		System.out.println("1 book");
		break;

	default:
		System.out.println(book > 0 ? book + "books" : "잘 못 입 력 했 습 니 다");
	}
}
}