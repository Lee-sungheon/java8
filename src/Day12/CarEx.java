package Day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("쌍용자동차", "노랑", 350);	//Car 객체 생성
		
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
	
		myCar.company = "현대자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car(null, 0, null);
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
		
		System.out.println("[생성자 예제]");
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.color);
		System.out.println(c1.model);
		System.out.println(c1.speed);
		System.out.println(c1.maxSpeed);
		
		System.out.println("[생성자 예제]");
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.color);
		System.out.println(c2.model);
		System.out.println(c2.speed);
		System.out.println(c2.maxSpeed);
		
		System.out.println("[생성자 예제]");
		Car c3 = new Car("파랑", 350);
		System.out.println(c3.company);
		System.out.println(c3.color);
		System.out.println(c3.model);
		System.out.println(c3.speed);
		System.out.println(c3.maxSpeed);

		c3.accel(); // 메소드 호출
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();
		
	}

}
