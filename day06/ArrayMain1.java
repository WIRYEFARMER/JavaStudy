package kr.ac.kopo.day06;

public class ArrayMain1 {
	public static void main(String[] args) {

		int[] ar;
		ar = new int[9];

		System.out.println("ar : " + ar);
		System.out.println("ar배열의 길이 : " + ar.length);
		System.out.println("첫번째 정수 : " + ar[0]);
		System.out.println("두번째 정수 : " + ar[1]);
		System.out.println("세번째 정수 : " + ar[2]);
		System.out.println("네번째 정수 : " + ar[3]);
		System.out.println("다섯번째 정수 : " + ar[4]);

		for (int i = 0; i < ar.length - 1; i++) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}
	}

}
