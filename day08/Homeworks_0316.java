package kr.ac.kopo.day08;

import java.util.Scanner;

public class Homeworks_0316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] primeArr = new int[10][20];

		System.out.println("정수 10개를 입력하세요 0 입력시 종료 : ");

		for (int i = 0; i < primeArr.length; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			primeArr[i][0] = num;

			int idx2 = 1;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					primeArr[i][idx2] = j;
					idx2++;
				}

			}

		}
		for(int [] primes : primeArr) {
			if (primes[0] !=0) {
				System.out.print(primes[0] + "의 약수 : ");
				
				for (int i =1; i<primes.length; i++) {
					if (primes[i] !=0) {
						System.out.print(primes[i] + " ");
					}
				}System.out.println();
			}
		}

	}

}
