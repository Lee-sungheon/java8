package Day01_11;

import java.util.Scanner;

public class Day1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -10000000;
		int[] input = new int[5];
		
		System.out.println("5개의 정수를 입력해주세요.");
		for(int i=0 ; i<5 ; i++)
			input[i] = sc.nextInt();
		
		System.out.print("입력 값 : " );
		for(int i=0 ; i<5 ; i++)
			System.out.print(input[i] + " ");
		
		for(int i=0 ; i<input.length ; i++)
		{
			if(input[i] > max)
				max = input[i];
		}
		
		System.out.println();
		System.out.println("최대값은 " + max + "입니다.");
		sc.close();
	}

}
