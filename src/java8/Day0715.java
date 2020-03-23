package java8;

import java.util.Scanner;

public class Day0715 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단?");
		int num = sc.nextInt();
		
		System.out.println(num + "단");
		for (int i = 1 ; i < 10 ; i++)
		{
			for (int j = num ; j < num+1; j++)
				System.out.print(j + " X " + i + " = " + i*j + "\t");
			System.out.println();
		
		}
		
	}

}
