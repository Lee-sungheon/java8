package Day14;

public class Tire {
	
	public int maxRotaiton;					//최대 회전수 (타이어 수명)
	public int accumulatedRotation;			//누적 회전수
	public String location;					//타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotaiton = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaiton) {
			System.out.println(location + " Tire 수명: " + (maxRotaiton - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
