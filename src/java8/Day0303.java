package java8;

public class Day0303 {

	public static void main(String[] args) {
		int number1 = 100; //지역변수
		System.out.println(number1);
		
		{   //중괄호 블럭
			int number2 = 200; //블럭변수
			System.out.println(number1);	
			System.out.println(number2);
		}
		
		System.out.println(number1);
//		System.out.println(number2);
	}

}
