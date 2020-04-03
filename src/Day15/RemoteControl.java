package Day15;

public interface RemoteControl {
	
	//상수 필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;	//원칙적으로 public static final이 자동으로 생성됨
	
	//추상 메소드
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) System.out.println("음소거 상태로 설정합니다.");
		else System.out.println("음소거 상태를 해제합니다.");
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
