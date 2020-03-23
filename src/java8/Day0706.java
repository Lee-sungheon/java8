package java8;

public class Day0706 {

	public static void main(String[] args) {
		
		int mul = 1, max = 10;
		
		for(int i = 1 ; i <= max ; i++)
		{
			mul *= i;
		}
		
		System.out.println("1ºÎÅÍ " + max + "±îÁö °ö : " + mul);
	}

}
