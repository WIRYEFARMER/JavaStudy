package kr.ac.kopo.day06.homeworks;

public class Homework_0314 {
	static void Homework1_0314() {
		for (int i = 5; i >= 1; i--) {
			for (int k = 4; k >= 6 - i; k--) {
				System.out.print("_");
			}
			for (int j = 1; j <= 11 - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	static void Homework2_0314() {
		for (int i = 5; i >= 1; i--) {
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("_");
			}
			for (int j = 10; j > 11 - (i * 2); j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	static void Homework3_0314() {
		int star = 9;
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				star--;
			} else {
				star++;
			}

			for (int k = 1; k < 9 - star; k++) {
				System.out.print("_");
			}
			for (int j = 2; j < star * 2 - 5; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	static void Homework4_0314() {
		int star = 0;
		int space = 0;
		for (int i =0; i<10;i++) {
			if (i<5) {
				star++;
			}else {
				star--;
			}
			for(int j=0;j<star-space;j++) {
				System.out.print("*");}
			for(int j=0; j<9-star*2;j++) {
				System.out.print("_");}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			
			
			}System.out.println();

		}
	}
	

	public static void main(String[] args) {
		Homework1_0314();
		System.out.println("Question1 end---");
		Homework2_0314();
		System.out.println("Question2 end---");
		Homework3_0314();
		System.out.println("Question3 end---");
		Homework4_0314();
		System.out.println("Question4 end---");
	}
}
