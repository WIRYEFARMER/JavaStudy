package kr.ac.kopo.day15;

import java.util.Random;

public class ExceptionMain3 {

	public static void main(String[] args) {
		System.out.println("====start====");
		Random r = new Random();

		int random = r.nextInt(3);

		try {
			System.out.println("random : " + random);

			System.out.println(10 / random);

			String str = "hello";
			System.out.println(str.charAt(5));
		} catch (Exception e) {			//아리스메틱,스트링인덱스아웃오브바운즈 익셉션을 한번에 처리
			e.printStackTrace();
		}

		/*
		 * catch (ArithmeticException ae) {
		 * System.out.println("#########예외 발생########");
		 * System.out.println(ae.getMessage()); // 예외가 발생한 이유를 출력 ae.printStackTrace();
		 * // 에러가 난 부분을 추적해서 찾아줌 } catch (StringIndexOutOfBoundsException se) {
		 * System.out.println("StringIndexOutOfBoundsException 예외발생!!!");
		 * se.printStackTrace(); }
		 */
		finally {

			System.out.println("====end====");
		}

	}
}
