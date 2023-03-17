package kr.ac.kopo.day04;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("물건값 입력 : ");
	int total = sc.nextInt();
	System.out.println("지불한 돈 입력 : ");
	int pay = sc.nextInt();
	int change = pay - total;
	System.out.println("거스름돈 : " + change);
	
	
	
	int k1000 = (change / 1000);
	change = change%1000;
	int k500 = (change / 500);
	change = change%500;
	int k100 = (change/100);
	change = change%100;
	int k50 = (change/50);
	change = change%50;
	int k10 = (change / 10);
	change = change%10;
	
	System.out.printf("1000원 : %d\n 500원 : %d\n 100원 : %d\n 50원:%d\n 10원: %d\n" ,k1000,k500,k100,k50,k10);
	
	}
	
}