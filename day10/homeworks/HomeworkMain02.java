package kr.ac.kopo.day10.homeworks;

public class HomeworkMain02 {

	public static void main(String[] args) {
		ScannerUtil scan = new ScannerUtil();
		StringUtil util = new StringUtil();
		String str = scan.nextString("문자열을 입력 : ");
		String revStr = util.reverseString(str);
		System.out.println("str : " + str);
		System.out.println("revstr : " + revStr);
		//String upperStr = util.toUpperString(str);
		//System.out.println("대문자 변환 : " + upperStr);
	}

}
