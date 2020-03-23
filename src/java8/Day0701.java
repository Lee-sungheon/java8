package java8;

import java.util.Scanner;

public class Day0701 {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("두 개의 정수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("입력한 수 : " + num1 +", " + num2);
		if(num1 == num2)
			System.out.println("Same");
		else
			System.out.println("Different");

	}

}
