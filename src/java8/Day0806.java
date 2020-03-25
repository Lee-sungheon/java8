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
			System.out.println("정수를 입력해주세요.(1~100)");
			int input = sc.nextInt();

			if(input == random)
			{
				System.out.println("정답! 답은 " + random + "입니다. 프로그램을 종료합니다.");
				break;
			}
			else if(input > random)
			{
				System.out.println("Up! 더 큰 숫자를 입력하셨습니다.");
			}
			else
				System.out.println("Down! 더 작은 숫자를 입력하셨습니다.");
			
			System.out.println();
		}

	}

}
