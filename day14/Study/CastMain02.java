package kr.ac.kopo.day14.Study;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		
		//컴파일 오류 발생
		//Child01 c =new Parent();
		
		
		//실행시 오류 발생
		//Child01 c = (Child01) new Parent();
		
		/* 자식클래스타입 = (자식클래스) 부모클래스타입
		 * 
		 */
		
		//묵시적형변환이 먼저 이루어져야 명시적형변환이 가능.
		Parent p = new Child01();
		
		Child01 c = (Child01)p;
	}

}
