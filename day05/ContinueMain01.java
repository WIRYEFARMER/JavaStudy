package kr.ac.kopo.day05;

public class ContinueMain01 {

	public static void main(String[] args) {
		int cnt;
		
		for (cnt = 1; cnt <=10; cnt++) {
			
			if(cnt>=3) {
				continue;
			}
			System.out.println("HI");
		}
		System.out.println("cnt : " + cnt);
	}

}
