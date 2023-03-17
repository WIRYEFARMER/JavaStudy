package kr.ac.kopo.day05.homework;
import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("보유하고 있는 책 권수 : ");
		int book = sc.nextInt();
	/*	//방법1
		if(book < 0) {
			System.out.println("잘못 입력 하였습니다.");
		}else if( book == 0) {
			System.out.println("보유하고 있는 책이 없습니다.");
		}else if (book == 1) {
			System.out.println(book + "book");
		}else if (book > 1) {
			System.out.println(book + "books");
		}*/
		
		//방법2
		
		switch(book) {
		
		case 0 :
			System.out.println("보유하고 있는 책이 없습니다.");
			break;
		case 1 :
			System.out.println(book+ "book");
			break;
		default :
			switch(book & 0x80000000) {
			case 0 :
				System.out.println(book + "books");
				break;
			default : 
				System.out.println("잘 못 입 력 했 습 니 다.");
			}
		}
	}	
	
}
