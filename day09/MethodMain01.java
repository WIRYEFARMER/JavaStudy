package kr.ac.kopo.day09;

public class MethodMain01 {
	//전달할 값이 없을떈 void 사용 , 전달할 값이 있을 땐 넘겨 주는 값에 따른 타입을 기재해야함.
	static int prnstar(int num, String data) { // <<int num은 아래 메인 메소드에 있는 int cnt변수가 prnstar의 메소드의 int num으로 넘김
		System.out.println("*******");
		System.out.println("호출자가 넘겨준 정수 : " + num);
		
		System.out.println("호출자가 넘겨준 문자열 : " + data);
		int sum = num % 10 + num / 10; // return은 피호출자(prnstar메소드)가 호출자(main메소드)로 값을 포함 한채로 반환
		return sum;
	}

	public static void main(String[] args) { // 인자 = parameter
		int cnt = 15;
		int total = prnstar(cnt, ""); // >>prnstar 메소드 int num이란 변수에 입력됨.
		System.out.println("HELLO");
		System.out.println("자리수의 합 : " + total);
		prnstar(5, ""); //	 >>	prnstar메소드에 int num으로 선언 되어있으므로 괄호안엔 int 값만 넣을 수 있음
		System.out.println("HI");
		prnstar(cnt, "abc");
		System.out.println("GOODBYE");
		prnstar(1, "");
		

	}

}