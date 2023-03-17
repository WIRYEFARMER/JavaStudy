package kr.ac.kopo.day06.homeworks;

/*	 
 *				*****
 *				_****
 *				__***
 *				___**
 *				____*
 *				___**
 *				__***
 *				_****
 *				***** 	
*/

public class HomeworkMain2 {

	public static void main(String[] args) {

		for(int i =1; i<=9;i++) {
			if(i<=5) {
				for(int j=1; j<=5;j++) {
					System.out.printf("%c",j>=1 ? '*' : '_');
					
			}
		}else {
			for(int j=1; j<=5;j++) {
				if(j<10-i) {
					System.out.print('_');
				}else {
					System.out.print('*');
				}
			}
		}
		System.out.println();
	}
		
		
		
		
		
		
		
		
		/*	//방법1
		for (int i = 1; i <= 9; i++) {
			if (i < 6) {
				for (int j = 0; j < i - 1; j++) {
					System.out.print("_");
				}

				for (int j = 0; j < 6 - i; j++) {
					System.out.print("*");

				}

			} else {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i - 4; j++) {
					System.out.print("*");
				}
			}
			System.out.println(" ");

		}
		*/
	}

}
