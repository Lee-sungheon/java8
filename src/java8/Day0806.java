 package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int random = rd.nextInt(101);
		
		
		while(true)
		{
			System.out.println("������ �Է����ּ���.(1~100)");
			int input = sc.nextInt();

			if(input == random)
			{
				System.out.println("����! ���� " + random + "�Դϴ�. ���α׷��� �����մϴ�.");
				break;
			}
			else if(input > random)
			{
				System.out.println("Up! �� ū ���ڸ� �Է��ϼ̽��ϴ�.");
			}
			else
				System.out.println("Down! �� ���� ���ڸ� �Է��ϼ̽��ϴ�.");
			
			System.out.println();
		}

	}

}
