package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain6 extends Exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("홀수를 입력해 : ");

		int num = sc.nextInt();

		try {
			if (num % 2 != 1) {
				throw new OddMismatchException(num + "은 홀수가 아입니다~");

				// throw new Exception("입력한 정수가 홀수가 아닙니다.");
			}

			System.out.println("num : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
