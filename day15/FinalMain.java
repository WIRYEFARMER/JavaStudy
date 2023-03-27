package kr.ac.kopo.day15;

/*final*/ class Super {
	/* final */ int NO = 100;

	Super() {
	}

	Super(int num) {
		this.NO = num;
	}

	/* final */ void print() {
		System.out.println("super..");
	}
}

class Sub extends Super {

}

public class FinalMain {
	public static void main(String[] args) {
		Super s = new Super();

	}

}
