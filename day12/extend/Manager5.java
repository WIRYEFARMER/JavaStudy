package kr.ac.kopo.day12.extend;

public class Manager5 extends Employee {
	
	Employee[] empList;

	public Manager5() {
		super();
		
	}

	public Manager5(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}
	


}
