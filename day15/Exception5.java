package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception5 {

	public static void a() {
		System.out.println("a()시작");
		// 컴파일 시점의 예외처리 , checked Exception
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println("a()종료");
	}

	public static void b() throws Exception {

		System.out.println("b()시작");

		String str = null;
		System.out.println("length : " + str.length());

		System.out.println("b()종료");

	}

	public static void main(String[] args)  {
		a();

		try {
			b();
		} catch (Exception e) {
			System.out.println("main 예외처리");
			e.printStackTrace();
		}
	}

}
