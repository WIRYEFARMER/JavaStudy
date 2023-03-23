package kr.ac.kopo.day13.abs02;

import java.util.Scanner;

public class PrinterView {

	private Scanner sc = new Scanner(System.in);

	public void work() {
		System.out.print("출력할 프린터를 선택하세요(1.LG 2.삼성 3.HP) : ");
		int choice = sc.nextInt();
		sc.nextLine(); // 버퍼 비우는 용도

		Printer p = null;

		switch (choice) {
		case 1:
			p = new LGPrinter();
			// p.print();
			break;

		case 2:
			p = new SamsungPrinter();
			// p.print();
			break;
		case 3:
			p = new HPPrinter();
			break;

		default:
			System.out.println("잘못입력햇수다");

		}
		if (p != null) {
			p.print();

		}
	}

}
