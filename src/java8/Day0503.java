package java8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주사위 게임을 시작합니다.");
		int dice = (int)(Math.random()*6) + 1;	
		System.out.println("주사위를 던집니다.");

		if(dice == 1)
			System.out.println("주사위의 눈금은 1입니다.");
		else if(dice == 2)
			System.out.println("주사위의 눈금은 2입니다.");
		else if(dice == 3)
			System.out.println("주사위의 눈금은 3입니다.");
		else if(dice == 4)
			System.out.println("주사위의 눈금은 4입니다.");
		else if(dice == 5)
			System.out.println("주사위의 눈금은 5입니다.");
		else
			System.out.println("주사위의 눈금은 6입니다.");
		
		sc.close();
	}

}
