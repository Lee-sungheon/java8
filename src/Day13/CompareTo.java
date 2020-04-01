package Day13;

public class CompareTo {

	public static void main(String[] args) {
		String a = "java Programming";
		String b = "iava Programming";
		
		System.out.println(a.compareTo(b));
		
		System.out.println(a.regionMatches(false, 0, b, 0, b.length()));
		
		System.out.println(a.equals(b));

	}

}
