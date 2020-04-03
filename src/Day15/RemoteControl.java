package Day15;

public interface RemoteControl {
	
	//��� �ʵ�
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;	//��Ģ������ public static final�� �ڵ����� ������
	
	//�߻� �޼ҵ�
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) System.out.println("���Ұ� ���·� �����մϴ�.");
		else System.out.println("���Ұ� ���¸� �����մϴ�.");
	}
	
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
