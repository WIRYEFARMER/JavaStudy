package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain1 {
	public static void main(String[] args) {
		// 키보드로 3개의 실수를 입력 받아 출력하는 코드를 작성하시오.
		Scanner sc = new Scanner(System.in);

		double[] ar = new double[3];

		for (int i = 0; i < ar.length; i++) {
			System.out.print(i + 1 + "번째 실수 :");
			ar[i] = sc.nextDouble();
		}
		/*
		 * 배열의 모든요소 출력방식
		 * 1)index를 이용해서 출력
		 * 2)1.5버전의 for문 이용해서 출력
		 * 3) Arrays.toString을 이용해서 출력
		 * */
		
		System.out.println("<INDEX를 이용한 출력>");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		System.out.println("<1.5버전의 for문을 이용한 출력>");
		for( double data : ar) {
			System.out.print(data + "\t");
			
		}System.out.println();
		
		System.out.println("<Arrays.toString()을 이용한 출력>");
		System.out.println(Arrays.toString(ar));
	}

}
