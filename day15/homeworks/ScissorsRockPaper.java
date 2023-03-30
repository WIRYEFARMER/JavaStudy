package kr.ac.kopo.day15.homeworks;

import java.util.Random;

public class ScissorsRockPaper implements Game {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	static int DRAW = 0;

	@Override
	public int startGame(int you) {
		Random r = new Random();

		int com = r.nextInt(3)+1;

		if (com == you) {
			DRAW++;
			System.out.println("DRAW");
			return 0;
		}
		if (com == 1 && you == 2) {
			System.out.println("WIN!!컴퓨터 : 가위 [플레이유저 : 바위] YOU WIN");
			return 1;
		} else if (com == 2 && you == 3) {
			System.out.println("WIN!! 컴퓨터 : 바위 [플레이유저 : 보] YOU WIN");
			return 1;
		} else if (com == 3 && you == 1) {
			System.out.println("WIN!! 컴퓨터 : 보 [플레이유저 : 가위] YOU WIN");
			return 1;
		}System.out.println("YOU LOSE");
		return 0;
	}

}
