package kr.ac.kopo.day15;

public class ExceptionMain4 {
	public static void main (String[] args) {
		System.out.println("====start====");
		try {
		
			String str = "Hello";
			//String str = null;
		System.out.println("length : " + str.length());
		
		return;		//리턴을 만나면 종료되지만 finally를 사용하면 리턴이 있어도 finally까지 출력
		}catch(Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}finally {
			System.out.println("무적권 실행");		//리턴을 만나도 출력됨.
		}
		System.out.println("===end===");
		
	}

}
