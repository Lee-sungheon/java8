package Day12;

public class Computer {
	int sum(int[] arr) {
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	//가변형 매개변수
	int sum2(int... arr) {
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
}
