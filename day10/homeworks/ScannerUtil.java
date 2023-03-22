package kr.ac.kopo.day10.homeworks;

import java.util.Scanner;

public class ScannerUtil {
	/*다양한 상수를 입력받을 수 있는 기능 클래스
	 *
	 */

	
	Scanner sc;
	ScannerUtil() {
		sc = new Scanner(System.in);
	}
	char nextChar(String msg) {
		System.out.println(msg);
		return sc.nextLine().charAt(0);
	}
	int nextInt(String msg) {
		System.out.println(msg);
		int num=sc.nextInt();
		return num;
	}
	String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
}
