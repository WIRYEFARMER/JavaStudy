package kr.ac.kopo.day01;

/* printf : 변환문자를 이용하여 상수 출력
 * 		%c : 문자
 * 		%d : 10진수 정수
 * 		%f : 실수
 * 		%s : 문자열
 * 		%b : 논리값
 * 
 */


public class PrintMain02 {

	public static void main(String[] args) {
		
		
		System.out.printf(" %d %f %s\n",10,12.34, "홍길동");
		System.out.printf(" %d %.2f %s\n",10,12.34, "홍길동");	//%.2f는 소수점 두번째까지만 출력 + 반올림도 함
		System.out.printf(" [%5d] %.2f %s\n",10,12.34, "홍길동");	//%5d는 다섯자리 형태로 출력하라 오른쪽 정렬이 이루어짐 
		System.out.printf(" [%-5d] %.2f %s\n",1000,12.34, "홍길동");	//%-5d는 다섯자리 형태에서 왼쪽 정렬이 이루어짐
		System.out.printf(" [%-5d] %.2f [%10s]\n",1000,12.34, "홍길동");	// %10s는 10자리 오른쪽 정렬
		System.out.printf(" [%-5d] %.2f [%-10s]\n",1000,12.34, "홍길동");	// %-10s는 10자리 왼쪽 정렬
		System.out.printf(" [%05d] %.2f [%-10s]\n",123,12.36, "홍길동");	// %05d는 공란을 0으로 채워줌
		System.out.printf(" [%05d] %.2f [%-10s]\n",123,12.36, "홍길동");	// %-05d는 사용불가 12300이 되어버림
		System.out.printf(" [%05d] %.2f [%-10s]\n",12345678,12.36, "홍길동");	// %-05d는 사용불가 12300이 되어버림
		
		System.out.printf("4>2 : %b\n ", 4>2);
		
		// TODO Auto-generated method stub

	}

}
