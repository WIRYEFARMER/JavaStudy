package kr.ac.kopo.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1_Answer_0316 {

	public static void main(String[] args) {
		int [][] numArr = new int[10][20];
		int loc=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. 최대 10개 입력 0입력시 종료됩니다. ");
		
//		while(true) {
//			numArr[loc][0] = sc.nextInt();
//			if (numArr[loc][0] == 0) {
//				break;
//				
//			}
//			
//			if(loc++ == numArr.length) {			//
//				break;
//			}
//		}

		do {
			numArr[loc][0] = sc.nextInt();
			int j =1;
			for (int i = 1; i<=numArr[loc][0]; i++) {
				if (numArr[loc][0] % i ==0) {
					numArr[loc][j++] = i;
				}
			}
			numArr[loc][0] = j-1;		//loc에 j값 저장 >>>	0번지에 저장되어있던 수를 몇번지 까지 들어있는지 0번지에 입력 마지막 번지에 있는 숫자는 약수를 나누기 위한 기본값
			
		}while (numArr[loc][0] !=0 && loc++ <10);			//do-while 문으로 위 while문을 간략화.
		
		for(int i=0; i<loc;i++) {
			int idx = numArr[i][0];
			System.out.print(numArr[i][idx] + "의 약수 : ");
			for(int j=1; j<=idx; j++)
				System.out.print(numArr[i][j] + " ");
			System.out.println();
		}
		
	//	for (int[] arr:numArr) {
	//		System.out.println(Arrays.toString(arr));
		}
	}


