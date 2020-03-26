package java8;

public class Day1009 {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[30];
		int sum1 = 0, sum2 = 0;
		
		System.out.println("C형 for문");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("향상된 for문");
		for(int number : arr) {
			System.out.println(number);
		}
		
		long sTime1 = System.currentTimeMillis();
		System.out.println("C형 for문");
		for(int i=0 ; i<arr2.length ; i++) {
			sum1 += i;
		}
		long eTime1 = System.currentTimeMillis();
		System.out.println(eTime1 - sTime1);
		
		long sTime2 = System.currentTimeMillis();
		System.out.println("향상된 for문");
		for(int number : arr2) {
			sum2 += number;
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2 - sTime2);
		System.out.println(sum1 + ", " + sum2);
		
	}

}
