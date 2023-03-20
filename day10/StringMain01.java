package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain01 {
	
	public static void main (String[] args) {
		String str = new String();
		String str2 = new String("HELLO");
		char[] chars = {'H','E','L','L','O'};
		String str3 = new String(chars);
		byte[] bytes = {72,101,108,108,111};	//아스키코드를 조합해서만듬
		String str4 = new String(bytes);
		
		System.out.println("str : [" +str + "]");
		System.out.println("str2 : ["+str2 + "]");
		System.out.println("str3 : [" + str3 + "]");
		System.out.println("str4 : [" + str4 + "]");
		
		System.out.println(str4 + "의 길이 : " +str4.length() );
		
		for (int i = 0; i<str4.length(); i++) {	//문자열에서 문자를 하나씩 출력
			System.out.println(i + "번째 문자 : " +str4.charAt(i));
		}
		
		chars = new char[10];
		System.out.println("chars : " + Arrays.toString(chars));
//		str4.getChars(0, str4.length(), chars, 0);
		str4.getChars(2, 4, chars, 6); //chars배열에 2~3번지에 있는 값을 6번지에 저장함
		System.out.println("chars: " +Arrays.toString(chars));
	}

}
