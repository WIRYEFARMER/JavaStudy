package kr.ac.kopo.day12;

import kr.ac.kopo.day10.homeworks.ScannerUtil;

public class IceCreamStore {

	void open() {

		ScannerUtil scan = new ScannerUtil();
		int cnt = scan.nextInt("아이스크림 몇개 입력할거? ==>");
		IcecreamBendingMachine[] iceArr = new IcecreamBendingMachine[cnt];

		for (int i = 0; i < iceArr.length; i++) {
			System.out.printf("***%d 번쨰 아이스크림 구매정보 입력 ***\n", i + 1);

			String name = scan.nextString("아이스크림명 : \n");
			int price = scan.nextInt("아이스크림 가격 : ");

			iceArr[i] = new IcecreamBendingMachine(name, price);

		}
		System.out.printf("< 총 %d 개 아이스크림 구매정보 출력 >  \n",cnt);
		System.out.println("-----------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림 가격");
		System.out.println("-----------------------------");
		for (int i = 0; i<iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName() + "\t" +iceArr[i].getPrice());
		}
		System.out.println("-----------------------------");
		IcecreamBendingMachine.totalInfo();

	}

}
