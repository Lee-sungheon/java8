package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class back_007 {
	//좌표 솔팅 후 그리디 알고리즘
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		Arrays.sort(arr,new Comparator<int[]> () {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] < o2[1])
					return -1;
				
				else if(o1[1] == o2[1]) {
					if(o1[0] < o2[0])
						return -1;
					else
						return 1;
				}
				else
					return 1;
				} 
		});
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i][0] + " ");
			System.out.println(arr[i][1]);
		}
		
		int start=arr[0][1];
		int count = 1;
		for (int i = 1; i < n; i++) {
			if(arr[i][0]>=start)
			{
				start=arr[i][1];
				count++;	
			}
		}
		
		System.out.println(count);
		
	}
}
