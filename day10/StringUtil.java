package kr.ac.kopo.day10;

import java.util.Scanner;

public class StringUtil {
	// 1

	boolean isUpperChar(char c) {
		if ((int) c < 97) {
			return true;
		} else {
			return false;
		}

	}

	// 2
	boolean isLowerChar(char c) {
		if ((int) c > 97) {
			return true;
		} else {
			return false;
		}
	}

	// 3
	static int max(int i, int j) {
		if (i > j) {
			return i;
		} else {
			return j;
		}

	}

	// 4
	static int min(int i, int j) {
		if (i < j) {
			return i;
		} else {
			return j;
		}
	}
	// 5

	static String reverseString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(str.length() - 1 - i);

		}
		return result;

	}

	// 6
	static String toUpperString(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] = (char) (chars[i] + ('A' - 'a'));
			}
		}
		return new String(chars);
	}

	// 7
	static String toLowerString(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] = (char) (chars[i] + ('a' - 'A'));
			}
		}
		return new String(chars);
	}

	// 8
	int compareTo(String str, String str2) {
		int leng = str.length() < str2.length() ? str.length() : str2.length();

		for (int i = 0; i < leng; ++i) {
			if ((int) str.charAt(i) != (int) str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		
		if (str.length() == str2.length()) {			
			return 0;
		}
		
		return str.length() > str2.length() ? 1 : -1;
	}

	// 9
	boolean endsWith(String str, String sub) {
		int leng1 = str.length() - sub.length();

		int sIdx = 0;
		for (int i = leng1; i < str.length(); ++i) {
			if (str.charAt(i) != sub.charAt(sIdx)) {
				return false;
			}
			++sIdx;
		}
		return true;
	}

	// 10
	int indexOf(String str, String sub) {

		// str 문자열 탐색
		for (int i = 0; i < str.length() - sub.length() + 1; ++i) {
			int check = 0;

			// str 배열의 현 문자가 sub 배열의 시작점과 일치한다면
			if (str.charAt(i) == sub.charAt(0)) {

				// sub 배열만큼 동시에 탐색 시작
				for (int j = 0; j < sub.length(); ++j) {

					// 두 글자가 같다면
					if (str.charAt(i + j) == sub.charAt(j)) {

						// 맞는 개수 ++
						++check;
					} else {
						break;
					}
				}
				// 맞은 갯수가 검색문자열과 같다면
				if (check == sub.length()) {
					return i;
				}
			}
		}
		return -1;
	}
	
	//1
	public static int checkChar(String strData,char ch ) {
		int cnt=0;
		for (int i=0; i<strData.length();i++) {
			if (strData.charAt(i) == ch) {
				cnt++;
			}
		}return cnt;
	}
	
	
	//2
	
	public static String removeChar(String oriStr,char delChar) {
		String removed = "";
		for (int i=0; i<oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				removed += oriStr.charAt(i);
				
			}
		}return removed;
		
	}
	public static void main(String[] args) {
		int answer = checkChar("Hello world JAVA", 'w');
		System.out.println(answer);
		String ansStr = removeChar("Hello world JAVA", 'l');
		System.out.println(ansStr);
	}

}
