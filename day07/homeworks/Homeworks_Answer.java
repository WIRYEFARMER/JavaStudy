package kr.ac.kopo.day07.homeworks;

import java.util.Scanner;

//10개의 정수를 입력받아 홀짝 구분

//0~99사이의 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성하시오.
//num1
public class Homeworks_Answer {
	static void Question1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요 : ");
		int[] num = new int[11];
		for (int i = 1; i < num.length; i++) {
			System.out.printf("num%d : ", i);
			num[i - 1] = sc.nextInt();

		}
		System.out.println("<짝수>");
		for (int i = 0; i < 10; ++i) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}

		}
		System.out.println("<홀수>");
		for (int i = 0; i < 10; ++i) {
			if (num[i] % 2 == 1) {
				System.out.println(num[i]);
			}

		}
	}
	static void Question2() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0;
		while (i <arr.length) {
			System.out.print("num" + (i+1)+" : ");
			int j = sc.nextInt();
			
			if (0<=j && j<=99) {
				arr[i]=j;
						i++;
			}
		}
		System.out.println("<PRINT>");
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println("\n<REVERSE>");
		for (int k= arr.length-1; 0<=i;i--) {
			int num10 = arr[i]/10;
			int num1 = arr[i]%10;
			
			System.out.println((num1 !=0 ? num1:"")+ ""+num10 +" ");
		}
		
	}
	
	static void Question3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("5명 학생의 성적을 입력하세요 ");
		int[] student = new int[5];
		for (int i= 0;1<student.length; i++) {
			System.out.print((i+1)+"'s 성적");
			student[i] = sc.nextInt();
			
		}
		System.out.println("<PRINT>");
		System.out.println("번호 \t성적\t학점");
		
		int err=0;
		int total = 0;
		for (int i=0; i<student.length; i++) {
			System.out.println((i+1) + "\t");
			
			char grade='F';
			
			if(0 <=student[i] && student[i] <=100) {
				if (90<=student[i]) {
					grade='A';
				}else if (80<=student[i]) {
					grade='B';
				}else if (70<=student[i]) {
					grade='C';
				}else if (60<=student[i]) {
					grade='D';
				}
				System.out.println(student[i] +"\t"+grade );
				total += student[i];
			
			}else {
				System.out.println("ERROR");
				err++;
		}
		}
		
		System.out.println("\n5명 입력중 ["+err+"]회 발생");
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.1f점", (double)total/5);



			}
		
	


		 
		
		
	
	public static void main(String[] args) {
		Question1();
		System.out.println("-------------------");
		Question2();
		System.out.println("-------------------");
		Question3();
		System.out.println("-------------------");
	}

}
