package Day01_11;

import java.util.Scanner;

public class Day0406 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�� ���� ����(N,M)�� �Է����ּ���.");
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int max = N >= M ? N : M;
		
		System.out.println("�Է� �� : "+ N +", " + M);
		System.out.println("�ִ� �� : " + max);

	}

}
