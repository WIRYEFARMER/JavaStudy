package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private String name;
	private String phone;

	Employee(String name, String phone) {
		this.name = name;
		this.phone = phone;

	}
/*
	@Override
	public boolean equals(Object obj) {
		Employee e= (Employee)obj;
		if(this.name.equals(e.name) && this.phone.equals(e.phone)) {
			return true;
		}return false;
		}		//이거 시험문제 낸대~~~			들어오는 객체와 나오는 객체의 중복여부판단을 equals를 사용
	
}*/

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
}
class Car {
	String model;
	String no;

	Car(String model, String no) {
		this.model = model;
		this.no = no;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		
		
		
		Employee e= new Employee("홍길동","010-1111-1111");
		Employee e2= new Employee("홍길동","010-1111-1111");
		
		if (e.equals(e2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		Map<Employee,Car> carList = new HashMap<>();
		carList.put(new Employee("홍길동","010-1111-1111"), new Car("소나타","123나4567"));
		
		carList.put(new Employee("고길동","010-2222-2222"), new Car("산타페","234다5678"));
		
		carList.put(new Employee("한길동","010-3333-3333"), new Car("K5","567무2478"));
		
		carList.put(new Employee("홍길동","010-1111-1111"), new Car("벤츠","346구7367"));
		
		
		
		System.out.println("등록된 차량 대수 : " + carList.size()+ "대");
		
		

	}

}
