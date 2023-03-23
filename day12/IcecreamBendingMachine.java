package kr.ac.kopo.day12;

public class IcecreamBendingMachine {
	
	String name;
	int price;
	static int total;
	
	IcecreamBendingMachine() {
		
	}
	
	public IcecreamBendingMachine(String name, int price) {
		this.name = name;
		this.price = price;
		IcecreamBendingMachine.total += price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	public static void totalInfo() {
		System.out.println("총액 : " +IcecreamBendingMachine.total + "원");
	}

}
