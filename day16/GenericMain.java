package kr.ac.kopo.day16;

import kr.ac.kopo.day15.inter.LGTV;

class A {
	private Object member;
	A(Object member) {
		this.member=member;
	}
	Object getMember() {
		return member;
	}
}
class B<T> {
	private T member;
	B (T member) {
		this.member = member;
	}
	T getMember() {
		return member;
	}
}

class List<T> {
	
}
public class GenericMain {

	public static void main(String[] args) {
		
		
		B<String> b1 = new B<String>("hello");
		B<LGTV> b2= new B<LGTV>(new LGTV());
		b1.getMember();
		b2.getMember();
		String Data = b1.getMember();
		
		
		//A클래스의 불편함을 위 B클래스에서 Generic형 사용
		
		A a1= new A("hello");
		
		String str = (String)a1.getMember();		//오브젝트형으로 받아서 스트링 타입으로 변환시켜줌
		System.out.println("문자열의 길이 : " + str.length());
		A a2= new A(new LGTV());
		LGTV tv = (LGTV)a2.getMember();
		tv.powerOn();
		
		
		
	
		
		
	}

}
