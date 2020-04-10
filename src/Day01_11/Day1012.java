package Day01_11;

import java.util.Random;
import java.util.Scanner;

public class Day1012 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		com[0] = rd.nextInt(9)+1;
		
		do {
			com[1] = rd.nextInt(9) + 1;
		} while(com[1] == com[0]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while(com[2] == com[0] || com[2] == com[1]);
		
		int str = 0, ball = 0, life = 11;
		while(str != 3) {
			
			str = 0;
			ball = 0;
			
			System.out.println("1 ~ 9 까지 숫자를 세 개 입력해 주세요");
			int x = 0;
			do {
				x = 0;
				for (int i=0 ; i<3 ; i++) {
					user[i] = sc.nextInt();
					if(user[i]<=0 || user[i]>9) {
						x++;
					}
				}
				if(x>0)
					System.out.println("1 ~ 9 까지의 숫자를 입력해주세요!");
			} while(x!=0);
			
			for (int i=0 ; i<3 ; i++) {
				if(user[i] == com[i])
					str++;
			}
			
			for (int i=0 ; i<3 ; i++) {
				for (int j=0 ; j<3 ; j++) {
					if(user[i] == com[j] && i!=j)
						ball++;
				}
			}
			
			System.out.println(str + " Strike " + ball + " Ball!");
			if(str != 3)
			{
				life--;
				System.out.println("남은 기회 : " + life + "회");
			}
			
			if(life == 0) {
				System.out.println("Game Over!");
				System.exit(0);
			}
			System.out.println();
		}
		
		System.out.println("정답! 게임을 종료합니다.");
		sc.close();
	}
	
}
