package kr.ac.kopo.day09;

public class MethodMain02 {
	
	
//----------다른 클래스에 있는 메소드 실행하기---------------

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(1);//다른 클래스에 있는 메소드 호출하기 : Method class에 있는 call메소드를 호출 하기 위해 new키워드를 사용하여 Method class를 불러온 후 Method class에 포함 되어 있는 call 메소드를 호출함.
		m.call("aaa",12);
		m.call('a');// >>묵시적 형변환으로 int로 변환됨
		m.call(12.34);	 
	}						
	
	
	
	
	
	
	
	
	

}
