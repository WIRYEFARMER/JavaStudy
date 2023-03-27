package kr.ac.kopo.day15.inter;

public interface TV {
	
	/*public static final 이 생략되어 있음*/int MAX_VOLUME_SIZE = 100;
	int MIN_VOLUME_SIZE = 0;
	
	
	/*public abstract가 생략되어있음*/void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	

}
