package java8;

import java.util.Scanner;

public class baek_001 {

	public static void main(String[] args) {
		int roomCnt;
		long sum = 0;
		int supervisor1, supervisor2;
		
		Scanner sc = new Scanner(System.in);
		roomCnt = sc.nextInt();
		
		int[] peopleCnt = new int[roomCnt];
		int[] svCnt = new int[roomCnt];
		
		for(int i=0 ; i<roomCnt ; i++) {
			peopleCnt[i] = sc.nextInt();
		}
		supervisor1 = sc.nextInt();
		supervisor2 = sc.nextInt();
		
		if(supervisor2 != 0) {
			for(int i=0 ; i<roomCnt ; i++) {
				if(peopleCnt[i]-supervisor1<0) svCnt[i]=0;
				else {
					svCnt[i] = (int)Math.ceil((peopleCnt[i]-supervisor1) / (double)supervisor2);
					sum += svCnt[i];
				}
			}
		}
		System.out.println(sum+roomCnt);
	}

}
