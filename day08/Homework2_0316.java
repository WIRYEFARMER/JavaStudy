package kr.ac.kopo.day08;

import java.util.Scanner;

public class Homework2_0316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Student s1 = new Student();
	//	Student s2 = new Student();
	//	Student s3 = new Student();
	//	Student s4 = new Student();
	//	Student s5 = new Student();

	//	Student[] stArr = { s1, s2, s3, s4, s5 };
		
		Student[] stArr = new Student[5];
		for (int i =0; i<stArr.length; i++) {
			stArr[i] = new Student();
		}												//위처럼 student class 를 for와 1차원배열로 생성 가능
		
		for (int i = 0; i < stArr.length; i++) {
			System.out.printf("%d 's 성적입력 : ", i + 1);
			stArr[i].score = sc.nextInt();
			stArr[i].num = i + 1;
		}

		System.out.println("<<PRINT>>");
		System.out.println("번호 \t 성적 \t 학점");

		int err = 0;
		int total = 0;

		for (int i = 0; i < stArr.length; i++) {
			System.out.println(stArr[i].num + "\t");
			
			
			
			if (0 <= stArr[i].score && stArr[i].score <= 100) {

				if (90 <= stArr[i].score) {
					stArr[i].grade = 'A';
				} else if (80 <= stArr[i].score) {
					stArr[i].grade = 'B';
				} else if (70 <= stArr[i].score) {
					stArr[i].grade = 'C';
				} else if (60 <= stArr[i].score) {
					stArr[i].grade = 'D';
				} else if (60>stArr[i].score) {
					stArr[i].grade = 'F';
				}
				System.out.println("\t"+ stArr[i].score + "\t" + stArr[i].grade);
				total += stArr[i].score;
			} else {
				System.out.println("ERROR");
				err++;
			}

		}
		
		System.out.println("5명 입력 중 [" + err + "]회 에러 발생");
		System.out.println("총점 : " + total + "점");
		System.out.printf("평균 : %.1f점", (double) total / 5);

	}
}
