package kr.ac.kopo.day15.inter;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("삼성티비 구매 완료...");
	}

	@Override
	public void powerOn() {
		System.out.println("TV전원 온!!");// TODO Auto-generated method stub

	}

	@Override
	public void powerOff() {
		System.out.println("TV전원 옾흐~");// TODO Auto-generated method stub

	}

	@Override
	public void channelUp() {
		System.out.println("채널 업!!");// TODO Auto-generated method stub

	}

	@Override
	public void channelDown() {
		System.out.println("채널다운~~");// TODO Auto-generated method stub

	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨 업!!!!");// TODO Auto-generated method stub

	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨 다운~~~");// TODO Auto-generated method stub

	}

	@Override
	public void mute() {
		System.out.println("뮷흐~");// TODO Auto-generated method stub

	}

}
