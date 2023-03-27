package kr.ac.kopo.day15.inter;

public class UserMain {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
		//TV tv = new LGTV();
		tv.powerOn();
		tv.volumeDown();
		tv.mute();
		tv.channelUp();
		tv.mute();
		tv.powerOff();
		
		System.out.println(tv);
		
		
		

	}

}
