package Day01_11;

import java.util.Scanner;

public class Day0713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력하시겠습니까?(홀수 입력)");
		
		int line = sc.nextInt();
		int newline = 0;
		
		if (line%2==0)
		{
			System.out.println("홀수를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0);; // =return
		}
		else
			newline = line/2 + 1;
		
		for(int i=1 ; i<newline ; i++)
		{
			for(int j=0 ; j<i ; j++)
			{
				System.out.print("$");
			}
			
			System.out.println();
		}
		
		for(int i=newline ; i>0 ; i--)
		{
			for(int j=0 ; j<i ; j++)
			{
				System.out.print("$");
			}
			
			System.out.println();
		}

	}

}
