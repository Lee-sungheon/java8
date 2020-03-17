package java8;

public class Day0401 {

	public static void main(String[] args) {
		int a = 3, b = 5;
		System.out.println(a + " << 2 = " + (a<<2));
		System.out.println(a + " >> 1 = " + (a>>1));
		System.out.println(a + " >> 2 = " + (a>>2));
		System.out.println("~b = " + ~b);
		System.out.println("~b << 1 = " + (~b<<1));
		System.out.println("~b >> 1 = " + (~b>>1));
		System.out.println("~b >>> 1 = " + (~b>>>1));
		
		System.out.println(a + " AND " + b + " = " + (a & b));
		System.out.println(a + " OR " + b + " = " + (a|b));
		System.out.println(a + " XOR " + b + " = " + (a^b));
	}

}
