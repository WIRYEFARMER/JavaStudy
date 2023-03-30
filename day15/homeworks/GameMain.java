package kr.ac.kopo.day15.homeworks;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int winCnt = 0;
		int loseCnt = 0;

		while (true) {
			Game game = null;
			int you = 0;
			System.out.println("게임을 선택하세요 \n A.가위바위보 \nB.주사위게임 \nC.종료");
			char selection = sc.nextLine().charAt(0);

			if (selection == 'A') {
				System.out.println("가위바위보 게임입니다. 가위바위보 중 하나를 선택하세요.\n 1.가위\n2.바위\n3.보");
				game = new ScissorsRockPaper();
				you = sc.nextInt();
			} else if (selection == 'B') {
				System.out.println("주사위 맞추기 게임임다~");
				game = new Dice();
				you = sc.nextInt();
			} else if (selection == 'C') {
				System.out.println("게임 종료");
				System.out.println("당신의 전적은" + winCnt + "승" + (loseCnt - ScissorsRockPaper.DRAW) + "패"
						+ ScissorsRockPaper.DRAW + "무 입니다.");

			} else {
				System.out.println("잘못 입력하심 다시 입력바람");
				break;
			}
			int result = game.startGame(you);
			if (result == 1) {
				winCnt++;

			} else {
				loseCnt++;
			}
			sc.nextLine();
			System.out.println("====================");

		}

	}

}
