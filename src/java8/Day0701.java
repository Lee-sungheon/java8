package java8;

import java.util.Scanner;

public class Day0701 {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("�� ���� ������ �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("�Է��� �� : " + num1 +", " + num2);
		if(num1 == num2)
			System.out.println("Same");
		else
			System.out.println("Different");

	}

}
