package kr.ac.kopo.day16.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoView {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public void start() {
		Scanner sc = new Scanner(System.in);

		System.out.print("게임 수 입력 : ");
		int gameCnt = sc.nextInt();

		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임" + i + " : " + Arrays.toString(getLotto8()));
		}
	}

	private Integer[] getLotto1() {
		Random r = new Random();
		Integer[] arr = new Integer[6];

		int num1 = 6;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < num1; i++) {
			int random = r.nextInt(45) + 1;
			if (set.add(random)) {
				arr[i] = random;
			} else {
				i--;
			}

		}
		return arr;

	}

	private int[] getLotto2() {
		Random r = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		return lotto;

	}

	private int[] getLotto3() {
		int[] lottoNums = new int[6];
		Random r = new Random();

		for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;
			boolean bool = true;
			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					bool = false;
					break;
				}
				if (bool) {
					i++;
				}
			}

		}

		return lottoNums;
	}

	private int[] getLotto4() {
		int[] lottoNums = new int[6];
		Random r = new Random();

		loop: for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {

					continue loop;
				}

			}
			i++;

		}

		return lottoNums;
	}

	private int[] getLotto5() {
		int[] lottoNums = new int[6];
		boolean[] flags = new boolean[45]; // 0~44

		for (int i = 0; i < lottoNums.length;) {
			int random = r.nextInt(45);
			if (!flags[random]) {
				lottoNums[i++] = random + 1;
				flags[random] = true;
			} else
				System.out.print("!");

		}

		return lottoNums;

	}

	private int[] getLotto6() {
		int[] lottoNums = new int[6];
		int[] nums = new int[45];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;

		}
		for (int i = 0; i < 6; i++) {
			int randIdx = r.nextInt(45 - i);
			int temp = nums[randIdx];

			nums[randIdx] = nums[45 - 1 - i];
			nums[45 - 1 - i] = temp;
		}
		return lottoNums;

	}
	
	private int[] getLotto7() {
		int[] lottoNums = new int[6];
		
		Set<Integer> lottos = new HashSet<>();
		
		while(lottos.size() <6) {
			lottos.add(r.nextInt(45)+1);
			
		}
		int i =0;
		for (int num : lottos) {
			lottoNums[i++] = num;
		}
		
		
		//Object[] arr = lottos.toArray();
		
		return lottoNums;
	}
	
	private int[] getLotto8() {
		int[] lottoNums = new int[6];
		List<Integer> nums = new ArrayList<>();
		
		for(int i=1; i<=45;i++) {
			nums.add(i);
			
		}Collections.shuffle(nums);
		for (int i=0; i<lottoNums.length; i++) {
			lottoNums[i] = nums.get(i);
		}
		
		
		return lottoNums;
	}

}