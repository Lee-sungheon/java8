package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도 : 1, 수도아님 : 0) : ");
		int city = sc.nextInt();
		System.out.print("인구(단위 : 만) : ");
		int people = sc.nextInt();
		System.out.print("부자의 수(단위 : 만) : ");
		int rich = sc.nextInt();
		
		boolean condition1 = (city==1)&&(people>=100);
		boolean condition2 = (rich >= 50);
		boolean metro = condition1&&condition2;
		
		System.out.println("메트로폴리스 여부 : " + metro);

	}

}
