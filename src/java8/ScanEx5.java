package java8;

import java.util.Scanner;

public class ScanEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 명의 이름을 입력해주세요 : ");
		Double text = sc.nextDouble();
		System.out.println(text);
		sc.close();
	}
}
