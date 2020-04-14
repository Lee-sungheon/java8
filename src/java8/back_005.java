package java8;

import java.util.Arrays;
import java.util.Scanner;

public class back_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, result = 0;
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			sum+=arr[i];
			arr2[i] += sum;
			result += arr2[i];
		}
		
		System.out.println(result);
		sc.close();
	}

}
