package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		System.out.println("====start====");
		Random r = new Random();

		int random = r.nextInt(3);

		try {
			System.out.println("random : " + random);

			System.out.println(10 / random);

		} catch (ArithmeticException ae) {
			System.out.println("#########예외 발생########");
			System.out.println(ae.getMessage()); 	//예외가 발생한 이유를 출력
			ae.printStackTrace();		//에러가 난 부분을 추적해서 찾아줌
		}

		finally {

			System.out.println("====end====");
		}

	}
}
