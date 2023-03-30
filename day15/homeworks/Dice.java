package kr.ac.kopo.day15.homeworks;

import java.util.Random;

public class Dice implements Game{

	@Override
	public int startGame(int you) {
		Random r = new Random();
		
		int me= r.nextInt(6)+1;
		
		if (me==you) {
			System.out.println("YOU WIN" +"컴퓨터가 낸 숫자 : " + me );
			return 1;
		}System.out.println("YOU LOSE" + "컴퓨터가 낸 숫자 : " + me);
		return 0;
	}

	
}
