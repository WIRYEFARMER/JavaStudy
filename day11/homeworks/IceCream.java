package kr.ac.kopo.day11.homeworks;

public class IceCream {
	int bibibic = 1000;
	int worldcon = 2000;
	int melona = 1000;
	int pollapo = 1200;
	int fishSSamanko = 1500;
	
	int buyIceCream(String icecream) {
		switch (icecream) {
		case "비비빅" : return bibibic;
		case "월드콘" : return worldcon;
		case "메로나" : return melona;
		case "폴라포" : return pollapo;
		case "붕어싸만코" : return fishSSamanko;
		
		}
		return 0;
		
	}
}
