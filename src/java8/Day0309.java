package java8;

public class Day0309 {

	public static void main(String[] args) {
		int daegu = 200_0000;
		int global = 100_0000;
		
		String city = daegu >= global ? "대구광역시" : "대구";

		System.out.println(city);

	}

}