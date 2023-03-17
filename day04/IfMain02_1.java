package kr.ac.kopo.day04;
import java.util.Scanner;

/* 보유하고 있는 책 권수 입력: 3
 * 3books
 * 보유하고 있는 책 권수 입력 : 1
 * 1book

*/
public class IfMain02_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책 권수 입력 : ");
		int book=sc.nextInt();
		
		
		if(book==1) {
			System.out.println(book +"book");
			
		} else {
			System.out.println(book + "books");
		}
		
		/*int books= sc.nextInt();
		
		if (books == 1) {
			
			System.out.println("1book");
		}
		else {
			System.out.println(books + "books");
		}*/

	}

}
