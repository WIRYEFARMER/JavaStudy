package kr.ac.kopo.day03;

public class OperationMain02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		//boolean result = ++a > 1 && ++b >= 0;	//단항 관계 논리 연산자 +) a가 이미 false이므로 b역시 false
		boolean result = ++b >=0 && ++a > 1;	//b가 true이므로 a가 false여도 계산 됨
		System.out.printf("a= %d b= %d\n",a,b);

	}

}
