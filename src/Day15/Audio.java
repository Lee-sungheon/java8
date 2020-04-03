package Day15;

public class Audio implements RemoteControl{

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume = volume;			
		}
		System.out.println("Audio의 볼륨을 " + this.volume + "으로 변경합니다.");
	}

}
