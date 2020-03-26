package java8;

public class Day1002 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};	//선언시에는 마지막에 세미콜론 사용
		int arr2[] = {60, 70, 80, 90, 100};	//2가지 생상방식을 혼용해도 문제되지 않음
		
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr1[i]);
		
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr2[i]);
		
		arr1[2] = 300;	//배열의 인덱스는 일반 변수처럼 값을 변경할 수 있다.
		for(int i=0 ; i<5 ; i++)
			System.out.println(arr1[i]);
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=0 ; i<arr3.length ; i++)
			System.out.println(arr3[i]);
		
	}
}
