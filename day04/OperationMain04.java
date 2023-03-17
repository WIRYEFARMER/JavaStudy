package kr.ac.kopo.day04;
	/*
		 * 두개 정수 입력 : 12.5
		 * 12는 5의 배수 판단 : 배수가 아닙니다.
		 * 
		 * 두개의 정수 입력 : 12.6
		 * 12는 6의 배수판단 : 배수입니다.
		 * 
		 */

public class OperationMain04 {

	public static void main(String[] args) {
	
		//String msg = true ? "배수 입니더" : "배수 아입니더";				//방법1
		//System.out.println(10>4 ? "배수입니다." : "배수가 아닙니다.");		//방법2 (조건식 ? true : false)조건식에 참일 시 왼쪽 출력 거짓일 시 오른쪽 출력
		
		
		int num01= 12, num02= 5;
		boolean bool = (num02 !=0 && num01 % num02 == 0);
		
		int num03= 12, num04= 6;
		boolean bool2 = num03 % num04 ==0;
		
		String result = bool ? "배수입니다잉" : "배수가 아입니다잉";
		String result2 = bool2 ? "배수입니다잉" : "배수가 아입니다잉";
		
				
				System.out.printf("%d는 %d의 배수 판단 : %s\n", num01,num02, result);
				System.out.printf("%d는 %d의 배수 판단 : %s\n", num03,num04, result2);
	}

}
