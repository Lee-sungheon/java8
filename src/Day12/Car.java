package Day12;

public class Car {
	// �ʵ�
	String model = "���";
	String company = "����ڵ���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;
	
	//������
	Car() {
		this("����ڵ���", "����", 100);
	}
	
	Car(String company, String color, int maxSpeed) { //�����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� ����
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("����ڵ���", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("����ڵ���", "����", maxSpeed);
	}
	
	Car(String company, int maxSpeed, String color) {
		
	}
	
	Car(String color, String company, int speed, int maxSpeed) {
		
	}
	
//	Car(String color, String company, int maxSpeed) { 	//string, string, int ������ �����Ƿ� �ߺ� �Ұ�
	
	// �޼ҵ�(�޼���)
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("���� �ӵ� : " + speed);
	}
	
	void brake() {
		speed -= 10;
		if(speed < 0) {
			speed = 0;
		}
		System.out.println("���� �ӵ� : " + speed);
	}

}
