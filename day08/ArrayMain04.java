package kr.ac.kopo.day08;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		// "하이테크" "자바" "교육"
		//String[] strArr = {"하이테크" , "자바" , "교육"};
		int loc=0;						//loc라는 변수를 추가하여 strArr 인덱스 값만 변경 하기 위해 선언
		
		
		
		String[] strArr = new String[5];					//배열을 5개를 생성하고 3개만 넣을 시 나머지는 null로 채워짐
		strArr[loc++] = "하이테크";			//loc++를 사용하여 수정을 쉽게 하게 함.
		strArr[loc++] = "인공지능 소프트웨어과";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("<INDEX를 이용한 출력>");
		for (int i = 0; i< strArr.length; i++) {
			System.out.println(strArr[i]);
			
		}
		System.out.println("<1.5버전 for 출력>");
		for(String str : strArr) {
			System.out.println(str);
			
		}
	
		System.out.println("<Arrays.toString() 이용 출력>");		//import 불러와야 함		
		System.out.println(Arrays.toString(strArr));
		
		
		
		//System.arraycopy 배열 복사 API 사용
		
		String[] strArr1 = new String[5];
		String[] strArr2 = new String[strArr.length];
		System.arraycopy(strArr, 2, strArr2, 1, 2);			//(원본배열,원본배열의시작위치(0부터시작),복사할배열,복사받을 시작위치,복사할 크기)
		System.out.println(Arrays.toString(strArr2));
		
		//for(int i=0; i<strArr2.length;i++)
			//System.out.println(strArr2[i]);
	}
	
	
	
	
}
