package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	

	System.out.println("보유하고 있는 책 권수 : ");
	int book = sc.nextInt();
	
	if(book==0) {
		System.out.println("보유하고 있는 책 없다");
	}else if(book<0) {
		System.out.println("잘못 입력 했수");
	}else if(book==1) {
		System.out.printf("%d book",book);
	}else {
		System.out.printf("%d books",book);
	}

	}
}
