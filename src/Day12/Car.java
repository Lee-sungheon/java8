package Day12;

public class Car {
	// 필드
	String model = "쏘울";
	String company = "기아자동차";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;
	
	//생성자
	Car() {
		this("기아자동차", "검정", 100);
	}
	
	Car(String company, String color, int maxSpeed) { //생성자를 생성하지 않으면 기본생성자가 자동으로 생성
		this.company = company;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed) {
		this("기아자동차", color, maxSpeed);
	}
	
	Car(int maxSpeed) {
		this("기아자동차", "검정", maxSpeed);
	}
	
	Car(String company, int maxSpeed, String color) {
		
	}
	
	Car(String color, String company, int speed, int maxSpeed) {
		
	}
	
//	Car(String color, String company, int maxSpeed) { 	//string, string, int 형식이 있으므로 중복 불가
	
	// 메소드(메서드)
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재 속도 : " + speed);
	}
	
	void brake() {
		speed -= 10;
		if(speed < 0) {
			speed = 0;
		}
		System.out.println("현재 속도 : " + speed);
	}

}
