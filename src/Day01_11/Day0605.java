package Day01_11;

import java.util.Scanner;

public class Day0605 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ϰ��� �ϴ� �������� �ܼ��� �Է����ּ��� : ");
		int num = sc.nextInt();
		
		System.out.println(num+"��");
		
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
