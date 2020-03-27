package java8;

public class Day1102 {

	public static void main(String[] args) {
		// 2차원 배열
		
		int[][] arr = new int[5][5];
		int cnt = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(i%2==0) {
				for(int j=0 ; j<5 ; j++) {
					cnt++;
					arr[i][j] = cnt;
				}	
			}
			else {
				for(int j=0 ; j<5 ; j++) {
					cnt++;
					arr[i][4-j] = cnt;
				}	
			}
		}

		for(int i=0 ; i<5 ; i++) {

			for(int j=0 ; j<5 ; j++) {
				System.out.print(arr[i][j] + "\t");
			}	
			System.out.println();
		}
	}
}
