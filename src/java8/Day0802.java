package java8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		//"Hello, world 10번 출력
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hello, world!" + i);
		}

		//@ 5개씩 7줄 출력
		for(int i=0 ; i<7 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
				System.out.print("@");
			System.out.println();	
		}
		
		System.out.println();
		
		//위 출력물에서 2열과 4열이 #이 되도록 변경
		for(int i=0 ; i<7 ; i++)
		{
			for(int j=0 ; j<5 ; j++)
			{
				if(i%2 == 1)
					System.out.print("#");
				else
					System.out.print("@");
			}
			System.out.println();	
		}
		
		//문자열을 입력받아서 for문으로 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		String str = sc.nextLine();
		for(int i=0 ; i<str.length() ; i++)
			System.out.print(str.charAt(i));
		
	}

}
