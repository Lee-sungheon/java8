package java8;

import java.util.Scanner;

public class back_006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt(); 
		int sum = 0, cnt = 0;
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(sum != k) {
			for(int i=n-1 ; i>=0 ; i--) {
				if(arr[i] <= (k-sum)) {
					sum += arr[i];
					cnt++;
					break;
				}
			}
		}
			
		System.out.println(cnt);
		sc.close();
	}
}
