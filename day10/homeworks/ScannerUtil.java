package kr.ac.kopo.day10.homeworks;

import java.util.Scanner;

public class ScannerUtil {
	/*다양한 상수를 입력받을 수 있는 기능 클래스
	 *
	 */

	
	Scanner sc;
	public ScannerUtil() {
		sc = new Scanner(System.in);
	}
	public char nextChar(String msg) {
		System.out.println(msg);
		return sc.nextLine().charAt(0);
	}
	public int nextInt(String msg) {
		System.out.println(msg);
		int num=sc.nextInt();
		sc.nextLine();		//int float double등을 입력 받은 후 버퍼를 비우기 위하여 nextLine추가함
		return num;
	}
	public String nextString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
}
