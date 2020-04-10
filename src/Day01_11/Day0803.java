package Day01_11;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {

	public static void main(String[] args) {
		//난수를 생성해서 구구단 문제를 출력하고 답을 입력하도록 작성
	
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int random1, random2, quiz, ans;
		
		long startTime = System.currentTimeMillis();
		for (int i=0 ; i<10 ; i++)
		{
			random1 = rd.nextInt(8) + 2;
			random2 = rd.nextInt(9) + 1;
			quiz = random1 * random2;

			System.out.print(random1 + " X " + random2 + " = ");
			ans = sc.nextInt();

			if (quiz == ans)
				System.out.println("정답입니다.");
			else
			{
				System.out.println("오답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			
		}
		long endTime = System.currentTimeMillis();
		System.out.println("게임 진행 시간 : " + ((double)endTime - startTime)/1000 + "s");
		
	}

}
