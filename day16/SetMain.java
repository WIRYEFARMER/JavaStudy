package kr.ac.kopo.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* set : 순서x,중복x
 * 구현클래스 : hashset, treeset
 * 메소드
 * 1)add() : 데이터삽입
 * 2)contains() : 데이터 존재여부 판단
 * 3)remove() : 특정 데이터 삭제
 * 4)clear() : 전체데이터 삭제
 * 5)size() : 전체 원소 개수 조회
 * 6)isEmpty() : 리스트가 비어있는 여부 판단
 * 
 * */


public class SetMain {
	public static void main (String[] args) {
		
		Set<String> set=new HashSet<>();	//1.7버전 부터 뒤 제네릭에 String을 표시 안하여도 됨.
		set.add("one");
		System.out.println("add(two) : "+ set.add("two"));
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println("add(two) : "+ set.add("two"));		//중복이 안됨.
		
		System.out.println("set : "+ set);
		
		//"two"가 존재하면 삭제하고 "삭제성공 " , 존재하지 않으면 "존재하지않음" 이라고 출력.
		System.out.println(set.remove("two") ? "삭제성공" : "존재하지않음");
		
		
		
		
		/*
		if (set.contains("two")) {
			set.remove("two");
			System.out.println("삭제성공");
		
		}else {
			System.out.println("존재하지 않음");
		}
		*/
		
		/*
		 * Set 전체데이터를 접근하는 방식
		 * 1. 1.5버전 for문
		 * 2. toArray() 메소드 이용
		 * 3.Iterator객체 이용
		 * 
		 * 
		 * 
		 * */
		System.out.println("<1.5버전의 for문을 이용>");
		for(String data : set) {
			System.out.println(data);
		}
		
		System.out.println("<toArray() 메소드를 이용>");
		Object[] dataArr = set.toArray();
		for (int i=0; i < dataArr.length; i++) {
			System.out.println(dataArr[i] + " length() : " + ((String)dataArr[i]).length());	//오브젝트를 받아서 문자열의 길이를 못받지만 앞에 (String)을 붙혀 명시적형변환을 하면 문자열 길이를 알수있음.
		}
		
		/*
		 * Iterator 주요 메소드
		 * hasNext() : 다음데이터 존재여부 판단
		 * next() : 데이터 이동
		 * 
		 * */
		
		
		
		
		
		System.out.println("<Iterator 객체를 이용>");
		Iterator<String> ite = set.iterator();
		
		
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
