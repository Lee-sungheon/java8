package java8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		int intInput;
		System.out.println("정수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		
		System.out.println("입력한 수 : " + intInput);
		if(intInput % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
