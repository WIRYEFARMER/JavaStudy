package kr.ac.kopo.day15.inter;

public class LGTV implements TV {
	private boolean power;
	private int channelNo;
	private int volumeSize;
	private int tempVolumeSize;
	private boolean muteFlag = false;

	public LGTV() {
		power = false;
		channelNo = 10;
		volumeSize = 7;
		System.out.println("LGTV를 구매하였습니다.");
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV전원을 켭니다.");
		info();

	}

	public void info() {
		System.out.println("채널번호" + channelNo + "음량크기" + volumeSize);
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV전원을 끕니다.");

	}

	@Override
	public void channelUp() {
		channelNo++;
		System.out.println("채널 업");
		info();

	}

	@Override
	public void channelDown() {
		channelNo--;
		System.out.println("채널 다운");
		info();

	}

	@Override
	public void volumeUp() {
		if (TV.MAX_VOLUME_SIZE < volumeSize) {
			volumeSize++;

		}
		System.out.println("볼륨업");
		info();

	}

	@Override
	public void volumeDown() {
		if (TV.MIN_VOLUME_SIZE != volumeSize) {
			volumeSize--;

		}
		System.out.println("볼륨다운");
		info();

	}

	@Override
	public void mute() {
		if (!muteFlag) {
			tempVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
			System.out.println("음소거");
		}

		else {
			volumeSize = tempVolumeSize;
			muteFlag = false;
			System.out.println("음소거 해제");
		}

	}

}
