package java8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		int intInput;
		System.out.println("������ �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		intInput = sc.nextInt();

		
		System.out.println("�Է��� �� : " + intInput);
		if(intInput % 2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
	}

}
