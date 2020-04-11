package java8;

import java.util.Scanner;

public class baek_002 {
	public static void main(String[] args) {
		int testcase;
		double minr, maxr;
		double d;
		
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		
		int[] answer = new int[testcase];
		int[][] xyr = new int[testcase][6];
		for(int i=0 ; i<testcase ; i++) {
			for(int j=0 ; j<6 ; j++) {
				xyr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<testcase ; i++) {
			maxr = xyr[i][2] + xyr[i][5];
			minr = Math.abs(xyr[i][2] - xyr[i][5]);
			d = Math.sqrt(Math.pow(xyr[i][0]-xyr[i][3],2) + Math.pow(xyr[i][1]-xyr[i][4],2));
			
			if(d==0 && minr==0)
				answer[i] = -1;
			else if(d==minr || d==maxr)
				answer[i] = 1;
			else if(d<minr || d>maxr)
				answer[i] = 0;
			else if(d>minr && d<maxr)
				answer[i] = 2;
			
			System.out.println(answer[i]);
		}
		
		
	}
}
