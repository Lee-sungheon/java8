package Day01_11;

import java.util.Scanner;

public class Day0501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홀수와 짝수를 판별하는 프로그램입니다. \n숫자를 입력해주세요.");
		int inputNumber = sc.nextInt();
		
//		String result = inputNumber % 2 == 0 ? "짝수" : "홀수"; //삼항 연산자를 사용
		
		if (inputNumber%2==0)
			System.out.printf("입력한 숫자는 %d이며 짝수입니다.",inputNumber);
		else
			System.out.printf("입력한 숫자는 %d이며 홀수입니다.",inputNumber);
		
	}

}
