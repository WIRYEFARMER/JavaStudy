package kr.ac.kopo.day10;

public class Calculator {
	int num1, num2;

	Calculator() {

	}

	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	static int plus(int num1, int num2) {
		int plus = num1 + num2;
		return plus;
	}

	static int minus(int num1, int num2) {
		int minus = num1 - num2;
		return minus;

	}

	static int times(int num1, int num2) {
		int times = num1 * num2;
		return times;
	}

	static double divide(double num1, double num2) {
		double divide = (num1 / num2);
		return divide;
	}

	public void check() {
		int[] ab = { num1, num2 };
		for (int num1 : ab) {
			boolean primecheck = true;
			if (num1 != 1) {
				for (int i = 2; i < num1 / 2; i++) {
					if (num1 % i == 0 && num1 % i != 2) {
						primecheck = false;
					}
				}
			} else {
				primecheck = false;
			}
			System.out.println(num1 + "소수체크 : " + primecheck);
		}

	}

}
