package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		String str01 = new String("Hello World");
		String str02 = new String("Hello World");

		System.out.println("str01 : [" + str01 + "]");
		System.out.println("str02 : [" + str02 + "]");

		if (str01 == str02) {
			System.out.println("[주소비교]str01 == str02");

		} else {
			System.out.println("[주소비교]str01 != str02");
		}
		// 값 비교 (대소문자 구분)O
		boolean bool = str01.equals(str02);
		if (bool) {
			System.out.println("[대소문자 값비교O] str01==str02");
		} else {
			System.out.println("[대소문자 값비교O] str01!=str02");

		}
		// 값 비교 (대소문자 구분)X
		bool = str01.equalsIgnoreCase(str02);
		if (bool) {
			System.out.println("[대소문자 값비교X] str01==str02");
		} else {
			System.out.println("[대소문자 값비교X] str01!=str02");

		}

		String[] names = { "홍길동", "강길동", "홍길순", "홍길동", "김길순", "김길남", "길동홍" };
		System.out.println("names : " + Arrays.toString(names));
		System.out.println("< 홍길동인 사람을 검색 >");

		for (String name : names) {
			if (name.equals("홍길동")) {
				System.out.println(name);
			}
		}

		System.out.println("<홍씨 성을 가진 사람을 검색 : ");
		for (String name : names) {
			if (name.startsWith("홍")) {
				System.out.println(name);
			}
		}

		System.out.println("<이름이 길동인 사람을 검색 >");
		for (String name : names) {
			if (name.endsWith("길동")) {
				System.out.println(name);

			}
		}

		System.out.println("< \"길동\"이 포함된 사람을 검색 >");
		for (String name : names) {
			if (name.contains("길동")) {
				System.out.println(name);
			}

		}

		str01 = "boat";
		str02 = "banana";

		int cmp = str01.compareTo(str02);
		if (cmp == 0) {
			System.out.println(str01 + "==" + str02);
		} else if (cmp > 0) {
			System.out.println(str02 + "<" + str01);

		} else {
			System.out.println(str01 + "<" + str02);
		}
	}
}
