package kr.ac.kopo.day14.Study;

public class CastMain01 {

	public static void print(Parent p) {
		
		
		if (p instanceof Child01) {
			Child01 c01 = (Child01)p;
			c01.sleep();
			c01.study();
		}else if (p instanceof Child02) {
			Child02 c02 =(Child02)p;
			c02.game();
			c02.sing();
			
		}
		
		/*
		System.out.println(p instanceof Child01);
		System.out.println(p instanceof Child02);
		System.out.println(p instanceof Parent);
		//instanceof 는 양 옆에 들어가는게 상속관계여야만 작동
		*/
		
		
		p.info();

	}

	public static void main(String[] args) {

		print(new Child01());
	//	print(new Child02());
	//	print(new Parent());

		// Child01 c01 = new Child01();
		// c01.info();

		// Child02 c02 = new Child02();
		// c02.info();

		// Parent p = new Parent();
		// p.info();

		/*
		 * 
		 * 
		 * Child01 c01 = new Child01(); c01.info(); c01.study(); c01.sleep();
		 * 
		 * 
		 * Parent p = new Child01(); p.info(); //p.sleep(); //접근 불가 //p.study(); //접근 불가
		 */
	}

}
