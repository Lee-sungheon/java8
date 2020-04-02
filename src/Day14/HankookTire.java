package Day14;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaiton) {
			System.out.println((location + " HankookTire ����: " + (maxRotaiton - accumulatedRotation) + "ȸ"));
			return true;
		}
		else {
			System.out.println("***" + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
