package Day01_11;

import java.util.Scanner;

public class Day0404 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("�簢���� ���� ���� ���̸� �Է����ּ���.");
		
		int wide = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("�簢���� ���� : " + (wide*height));
		System.out.println("�簢���� �ѷ� : " + (2*(wide+height)));
	
		sc.close();
	}
}
