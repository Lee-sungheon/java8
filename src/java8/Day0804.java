package java8;

import java.util.Scanner;

public class Day0804 {

	public static void main(String[] args) {
		
		System.out.print("�� ������ �Է����ּ��� : ");
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		Solution(a, b);
		
	}

	public static int Solution(int a, int b) {
	
		int solution = 0;
		
		if(a>=b)
		{
			for (int i = b ; i <= a ; i++)
				solution += i;
		}
		
		else
		{
			for (int i = a ; i <= b ; i++)
				solution += i;
		}
		
		System.out.println(solution);
		
	return(solution);
	}
}
	
