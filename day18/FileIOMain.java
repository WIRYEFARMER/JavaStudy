package kr.ac.kopo.day18;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain {

	public static void main(String[] args) {
		
		System.out.print("문자를 입력하세요 . ctrl +z 입력시 종료 합니다.");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		while(true) {
		

			try {
				int c = isr.read();
				if (c==-1) {
					break;
				}
				System.out.print((char)c);
			} 	catch (Exception e) {
				e.printStackTrace();
			
			}
	
			
		}
	
		
			
			
		
		
		
		
		
		
		
		
		
		
		/*한글출력이 안되는 byte스트림
		while(true) {
			
			try {			//try 치고 컨트롤+스페이스+엔터 치면 try catch 자동 생성
				int c = is.read();
				if (c==-1) {
					break;
				}
				System.out.print((char)c);			//문자로 보기위해 명시적 형변환을 해줌. 명시적형변환을 안할 시 아스키코드값으로 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			*/
			
		}

	

}
