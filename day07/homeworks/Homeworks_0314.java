package kr.ac.kopo.day07.homeworks;

import java.util.Scanner;

public class Homeworks_0314 {

	static void Homework1() {

	for(int i=1;i<101;i++) {

		System.out.print(i);
		
	}
	}
	static void Homework2() {

	for(int i=1;i<100;i++) {
		if (i%2 != 0)

		System.out.print(i);
		
	}
	}
		
		static void Homework3() {

			for(int i=100;i>0;i--) {
				if (i%2 == 0)

				System.out.print(i);
		
						
		
	}
	}
		static void Homework4() { 
			int snail=0;
			int hour = 0;
			while ((snail+=5) <100) {
			snail+= (snail<50 ? -1 :-2);
			System.out.printf("[%d 시간] 달팽이가 올라간 총 높이 : %d M\n",++hour ,snail);
			}System.out.printf("[%d 시간] 달팽이가 올라간 총 높이 : %d M\n",++hour ,snail);
		}

		static void Homework5() {
			Scanner sc = new Scanner(System.in);
			System.out.println("2-9사이의 단을 입력 : ");
			int dan = sc.nextInt();
			System.out.printf("***%d단***",dan);
		
		
			
			for (int i=1; i<10; i++) {
				
				int total = dan * i;
				System.out.printf(dan + " * " + i + " = "+total+'\n');
				
				i--;
				
			}
		}
		static void Homework6() {
			for(int i=2;i<10;i++) {
				System.out.printf("***%d단***", i + '\n');
				
				for (int j=1;j<10;j++) {
					int total = i * j;
					System.out.printf(i + "*" + j + " = " + total + '\n');
				}
			}
			
		}
		static void Homework7() {
			Scanner sc = new Scanner(System.in);
			System.out.println("시작단을 입력하세요 : ");
			
			
		}
		
		static void Homework8() {
			for (int st = 2; st < 10; st += 3) {
				for (int i = 1; i < 10; ++i) {
					for (int j = st; j < (st + 3 < 10 ? st + 3 : 10); ++j) {
						System.out.print(j + " * " + i + " = " + i * j + "   ");
					}
					System.out.println();
				}
				System.out.println();
			}

		}
			
			
		
	public static void main(String[] args) {
		//Homework1() ;
		System.out.println();
		//Homework2() ;
		//System.out.println();
		//Homework3() ;
		Homework4();
		//System.out.println();
		//Homework5() ;
		//System.out.println();
		//Homework6() ;
		//Homework7();
		//Homework8();
		System.out.println();
	}

}
