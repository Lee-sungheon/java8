package java8;

import java.util.Scanner;

public class Day0405 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("두 개의 정수(N,M)을 입력해주세요.");
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		System.out.println("교환전 N : " + N + ", M : " + M);
		
		int temp = N;
		N = M;
		M = temp;
		
		System.out.println("교환후 N : " + N + ", M : " + M);

	}

}
