package kr.ac.kopo.day10;

public class MethodExample {
	
	static void printGugudanAll() {
		for (int dan=2; dan <=9; dan++) {
			System.out.println("***"+ dan + "***");
			for (int i=1;i<=9;i++) {
				System.out.println(dan + " * " +i +" = " + dan*i);
			}
		}
	}
	

	public static void main(String[] args) {
		printGugudanAll();

	}

}
