package Day01_11;

import java.util.Scanner;

public class Day1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -10000000;
		int[] input = new int[5];
		
		System.out.println("5���� ������ �Է����ּ���.");
		for(int i=0 ; i<5 ; i++)
			input[i] = sc.nextInt();
		
		System.out.print("�Է� �� : " );
		for(int i=0 ; i<5 ; i++)
			System.out.print(input[i] + " ");
		
		for(int i=0 ; i<input.length ; i++)
		{
			if(input[i] > max)
				max = input[i];
		}
		
		System.out.println();
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		sc.close();
	}

}
