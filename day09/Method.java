package kr.ac.kopo.day09;

public class Method {
	
	void call() {
		System.out.println("call() 메소드를 호출...");
		
	}
	void call(int i) {
		System.out.println("call(int) 메소드호출...");
		
		
	}
	void call(String s, int i) {
		System.out.println("call(string,int) 메소드 호출...");
	}
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
}

//같은 클래스 내 같은 메소드가 있어도 뒤에 매개변수가 있을 시 다른 메소드로 취급 >> 메소드 오버로딩이라고 함