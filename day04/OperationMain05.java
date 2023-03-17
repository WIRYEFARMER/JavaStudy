package kr.ac.kopo.day04;


public class OperationMain05 {

	public static void main(String[] args) {
		int num = 0xE855AA39;
		System.out.printf("%x\n" , num);		//%x를 %X로 대문자로 사용할 시 출력값도 대문자로 출력 됨.
		System.out.printf("%x\n" , ~num);		//~는 bit not 이란 뜻 true는 false로 false는 true로, 0은1로 1은 0으로 바꾸어주는 표기.
		System.out.printf("%08x\n" , num & 0xffff0000);
		System.out.printf("%08x\n" , num & 0x0000ffff);
		
	}

}
