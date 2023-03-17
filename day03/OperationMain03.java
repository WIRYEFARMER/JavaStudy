package kr.ac.kopo.day03;
	/*
		 * 두개 정수 입력 : 12.5
		 * 12는 5의 배수 판단 : false
		 * 
		 * 두개의 정수 입력 : 12.6
		 * 12는 6의 배수판단 : true
		 * 
		 */

public class OperationMain03 {

	public static void main(String[] args) {
	
		int num01= 12, num02= 5;
		boolean bool = (num02 !=0 && num01 % num02 == 0);
		
		int num03= 12, num04= 6;
		boolean bool2 = num03 % num04 ==0;
		
				
				System.out.printf("%d는 %d의 배수 판단 : %b\n", num01,num02, bool);
				System.out.printf("%d는 %d의 배수 판단 : %b\n", num03,num04, bool2);
	}

}
