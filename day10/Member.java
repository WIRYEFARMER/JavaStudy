package kr.ac.kopo.day10;

public class Member {
	/** 이름 */
	String name;
	/** 나이 */
	int age;
	/** 혈액형 */
	String bloodType;
	
	Member() {
		this("알수없음");
	}
	Member(String name) {
		this (name,-1);
	}
	
	Member(String name, int age) {
		this(name,age,"알수없음");	//this는 첫 줄에 있어야함.
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
/*	
	
	Member() { // 디폴트 생성자
		this("알수없음",-1,"알수없음");		//디폴트 생성자에 this를 사용하여 아무것도 입력 되지않은 곳은 null값으로 채워지지만 사용자를 위하여 사용자가 알기 쉬운 단어로 채워 호출시켜줌
		
//		this.name = "알수없음";
//		this.age = -1;
//		this.bloodType = "알수없음";
	}

	Member(String name) {
		this(name,-1,"알수없음");
		
//		this.name = name;
//		this.age = -1;
//		this.bloodType = "알수없음";
	}

	Member(String name, int age) {
		this(name,age,"알수없음");
//		this.name = name;
//		this.age = age;
//		this.bloodType = "알수없음";
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
*/
	void info() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 혈액형 : " + bloodType);
	}

}
