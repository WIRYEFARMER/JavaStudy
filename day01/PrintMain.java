package kr.ac.kopo.day01;

/*
 * 
 *출력 메소드 System.out.print()
 *
 *print()	: 개행문자 미포함(엔터 미포함 한 줄에 쭉 나옴)
 *println() : 개행문자포함(엔터키를 포함하고 있음)
 *printf()	: 정수 실수 문자열 jdk1.5버전 이상만 (f는 formating)
 */

/**
 * 문서형 주석
 * 
 * @author User
 *
 */

public class PrintMain {

	public static void main(String[] args) {
		System.out.println(10 + ' '); // 답이 42나오는 이유 : 공백이 32
		System.out.println("Enter");
		System.out.print("\n 엔터 \t 탭 \'작은 따옴표 \\ 역슬래시 enter"); // \n 엔터 \t 탭 \' 작은따옴표 \\ 역슬래시
		System.out.println('A');
		System.out.print('A');
		System.out.print("A \n");
		System.out.println('A');
		System.out.println("10 12.34 홍길동");
	}

}
