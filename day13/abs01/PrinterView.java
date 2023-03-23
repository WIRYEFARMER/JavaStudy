package kr.ac.kopo.day13.abs01;

import java.util.Scanner;

public class PrinterView {

	private Scanner sc = new Scanner(System.in);

	public void work() {
		System.out.print("출력할 프린터를 선택하세요(1.LG 2.삼성) : ");
		int choice = sc.nextInt();
		sc.nextLine(); // 버퍼 비우는 용도

		switch (choice) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			break;

		case 2:
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			
			break;

		}

	}

}
