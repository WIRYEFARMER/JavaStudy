package kr.ac.kopo.day06.homeworks;

public class HomeworkMain1 {

	static void Homework01() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}
	}

	static void Homework02() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d", i);
			}
			System.out.println(" ");
		}
	}

	static void Homework03() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d", j);
			}
			System.out.println(" ");
		}
	}

	static void Homework04() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d", j + i);
			}
			System.out.println(" ");
		}
	}

	static void Homework05() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= i + 4; j++) {
				System.out.printf("%d", j);
			}
			System.out.println(" ");
		}
	}

	static void Homework06() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*", i);
			}
			System.out.println("");
		}
	}

	static void Homework07() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*", i);
			}
			System.out.println("");
		}
	}

	static void Homework08() {
		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print("_");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("*", i);
			}
			System.out.println("");
		}
	}

	static void Homework09() {
		for (int i = 5; i >= 1; i--) {
			for (int k = 4; k >= 6 - i; k--) {
				System.out.print("_");
			}
			for (int j = 1; j <= 6 - i; j++) {
				System.out.printf("*", i);
			}
			System.out.println("");
		}
	}

	static void Homework10() {
		for (int i = 1; i <= 9; i++) {
			if (i < 6) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < 10 - i; j++) {
					System.out.print("*");
				}
			}System.out.println(" ");
			
		}
	}
	static void Homework11() {
		for (int i = 1; i <= 9; i++) {
			if (i<6) {
				for (int j = 0; j <6-i; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < i-4; j++) {
					System.out.print("*");
				}
			}System.out.println(" ");
			
		}
	}
	static void Homework12() {
		for (int i = 1; i <= 9; i++) {
			if (i<6) {
				for (int j = 0; j < i-1; j++) {
					System.out.print("_");
				} 
				
				for (int j = 0; j <6-i; j++) {
					System.out.print("*");
			
				}

			} else {
				for (int j = 0; j < 9-i; j++) {
					System.out.print("_");
				} 
				for (int j = 0; j < i-4; j++) {
					System.out.print("*");
				}
			}System.out.println(" ");
			
		}
	}
	
	static void Homework13() {
		for (int i = 1; i <= 9; i++) {
			if (i<6) {
				for (int j = 0; j < 5-i; j++) {
					System.out.print("_");
				} 
				
				for (int j = 0; j <i; j++) {
					System.out.print("*");
			
				}

			} else {
				for (int j = 0; j < i-5; j++) {
					System.out.print("_");
				} 
				for (int j = 0; j < 10-i; j++) {
					System.out.print("*");
				}
			}System.out.println(" ");
			
		}
	}

	public static void main(String[] args) {
		Homework01();
		System.out.println("----------Question1 end---------------");
		Homework02();
		System.out.println("----------Question2 end---------------");
		Homework03();
		System.out.println("----------Question3 end---------------");
		Homework04();
		System.out.println("----------Question4 end---------------");
		Homework05();
		System.out.println("----------Question5 end---------------");
		Homework06();
		System.out.println("----------Question6 end---------------");
		Homework07();
		System.out.println("----------Question7 end---------------");
		Homework08();
		System.out.println("----------Question8 end---------------");
		Homework09();
		System.out.println("----------Question9 end---------------");
		Homework10();
		System.out.println("----------Question10 end---------------");
		Homework11();
		System.out.println("----------Question11 end---------------");
		Homework12();
		System.out.println("----------Question12 end---------------");
		Homework13();
		System.out.println("----------Question13 end---------------");
	}

}
