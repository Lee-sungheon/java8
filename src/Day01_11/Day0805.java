package Day01_11;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		System.out.print("두 정수를 입력해주세요 : ");
		int a, b, min = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		//두수의 곱은 최대공약수 x 최소공배수
		
		if(a>b)
		{
			for(int i=b ; i>0 ; i--)
			{
				if(b%i == 0 && a%i == 0)
				{
					min = i;
					break;
				}
				
			}
			for(int i=a ; i>0 ; i++)
			{
				if(i%a == 0 && i%b == 0)
				{
					max = i;
					break;
				}
			}
		}
		
		else
		{
			for(int i=a ; i>0 ; i--)
			{
				if(a%i == 0 && b%i == 0)
				{
					min = i;
					break;
				}
				
			}
			max = a*b/min;
		}
		
		
		System.out.println("최대공약수 : " + min + ", 최대공배수 : " + max);
		
	}

}
