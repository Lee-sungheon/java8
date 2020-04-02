package Day14;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaiton) {
			System.out.println((location + " KumhoTire ����: " + (maxRotaiton - accumulatedRotation) + "ȸ"));
			return true;
		}
		else {
			System.out.println("***" + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
}
