package Day01_11;

import java.util.Scanner;

public class Day0404 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("사각형의 가로 세로 길이를 입력해주세요.");
		
		int wide = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("사각형의 넓이 : " + (wide*height));
		System.out.println("사각형의 둘레 : " + (2*(wide+height)));
	
		sc.close();
	}
}
