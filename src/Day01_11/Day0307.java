package Day01_11;

public class Day0307 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		a += b;
		System.out.println(a);
		a -= b;
		System.out.println(a);
		a *= b;
		System.out.println(a);
		a /= b;
		System.out.println(a);

		a *= 3 + 10;  // 대입 연산자는 마지막에 연산
		System.out.println(a);
		
		a += 1;
		System.out.println(a);

	}

}
