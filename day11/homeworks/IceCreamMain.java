package kr.ac.kopo.day11.homeworks;

import java.util.Scanner;

public class IceCreamMain {

	public static void main(String[] args) {
		
		IceCream IceCream = new IceCream();
		Scanner sc = new Scanner(System.in);

		int billcnt = 1;
		int total = 0;
		while (true) {

			System.out.println("아이스크림 몇개 구매할거?");
			int amount = sc.nextInt();
			String[] icecreamArr = new String[amount];
			int[] priceArr = new int[amount];

			
			String removeln = sc.nextLine(); //기홍씨 고마우이~~
			
			for (int i = 0; i < amount; i++) {
				System.out.printf("***%d번째 아이스크림 구매 정보 입력***\n", i+1);
				System.out.println("아이스크림명 : ");
				String name = sc.nextLine();
				
				int price = IceCream.buyIceCream(name);
				System.out.println("아이스크림 가격 : " + price);

				icecreamArr[i] = name;
				priceArr[i] = price;

				total += price;

			}
			System.out.println("\n번호\t아이스크림명\t아이스크림가격");
			for (int i = 0; i < amount; i++) {
				System.out.println(i + "\t" + icecreamArr[i] + "\t\t" + priceArr[i]);
			}
			System.out.println("계속 구매 하싈? (y/n)");
			char ipt = sc.nextLine().charAt(0);
			if (ipt=='n') {
				System.out.println();
				System.out.println("총" + amount +"번의 구매정보 발생");
				System.out.println("총계 : " + total);
				break;
				
			}
			billcnt++;

		}
	}
}
