package Day01_11;

import java.util.Scanner;

public class Day0406 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("두 개의 정수(N,M)을 입력해주세요.");
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int max = N >= M ? N : M;
		
		System.out.println("입력 값 : "+ N +", " + M);
		System.out.println("최대 값 : " + max);

	}

}
