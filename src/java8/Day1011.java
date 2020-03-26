package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 10개를 입력하세요! : ");
		for(int x=0; x<r.length ; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("입력 데이터 값 : ");
		for(int x=0; x<r.length ; x++) {
			System.out.print((r[x] + ".."));
		}
		System.out.println();
		
		//오름차순 정렬
		for(int i=0; i<r.length ; i++) {
			for(int j=0; j<r.length-1-i ; j++) {
				if(r[j] > r[j+1]) {
					number=r[j+1];
					r[j+1]=r[j];
					r[j]=number;	
				}
			}
		}
		
//		Arrays.sort(r);	//오름차수 정렬 함수
		
		System.out.print("오름차순 데이터 값 : ");
		for(int x=0; x<r.length ; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("합 계 : ");
		int sum = 0;
		for(int x=0 ; x<r.length ; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.println("평균 : " + (sum/(r.length)));
	
	}

}
