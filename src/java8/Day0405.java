package java8;

import java.util.Scanner;

public class Day0405 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("�� ���� ����(N,M)�� �Է����ּ���.");
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		System.out.println("��ȯ�� N : " + N + ", M : " + M);
		
		int temp = N;
		N = M;
		M = temp;
		
		System.out.println("��ȯ�� N : " + N + ", M : " + M);

	}

}
