package kr.ac.kopo.day12.extend;

public class Manager extends Employee {
//	int no;
//	String name;
//	int salary;
//	String grade;
	Employee[] empList; // 관리사원 목록리스트

	public Manager() {

	}

	public Manager(int no, String name, int salary, String grade, Employee[] empList) {
		super(no,name,salary,grade);

		this.empList=empList;

	}
	@Override
	public void info() {
		super.info();
		System.out.println("------------------------------------------");
		System.out.println("\t <관리사원 리스트>");
		System.out.println("------------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
		
		
		
		
		
	}

}
