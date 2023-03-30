package kr.ac.kopo.day17.lotto;

import java.util.Arrays;

public class MC {
	
	private Machine machine;
	
	public MC() {
		machine = new Machine();
	}
	
	public void ment() {
		System.out.println("안녕하세요. 제 xx회 로또 방송입니다.");
		System.out.println("로또 추첨을 시작하겠습니다.");
		
		machine.start();
		int[] lottoNums = new int[6];
		
		for(int i=0; i<6; i++) {
			try {
				Thread.sleep(1000);		//1000ms(1s)단위로 출력
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			Ball ball = machine.getBall();
			
			System.out.println(i+1 + "번째 로또 번호는 [" +ball.getNumber() + "]입니다.");
			lottoNums[i] = ball.getNumber();
			
		}
		System.out.println("제 xx회 로또 당첨번호는 " + Arrays.toString(lottoNums)+ "입니다.");
		
		
	}

}
