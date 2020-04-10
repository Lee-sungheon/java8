package Day01_11;

import java.util.Scanner;

public class Day0605 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력하고자 하는 구구단의 단수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num+"단");
		
		for(int i=1 ; i<10 ; i++)
		{
			for (int j=num; j<num+1 ; j++)
			{
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
