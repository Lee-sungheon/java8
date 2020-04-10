package Day01_11;

import java.util.*;

public class Day0202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("num1,2 값 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.print("두 값의 합계는 ");
		System.out.print(result);
		System.out.print("입니다.");
		
		sc.close();
	}
}