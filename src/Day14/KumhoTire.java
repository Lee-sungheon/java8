package Day14;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotaiton) {
			System.out.println((location + " KumhoTire ¼ö¸í: " + (maxRotaiton - accumulatedRotation) + "È¸"));
			return true;
		}
		else {
			System.out.println("***" + location + " KumhoTire ÆãÅ© ***");
			return false;
		}
	}
}
