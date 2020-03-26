package java8;

public class Day1003 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0 ; i<arr1.length ; i++){
			sum += arr1[i];
		}
		System.out.println(sum);
		
		int[] arr2 = {0, 0, 0, 0, 0};		//0으로 채워진 크기가 5인 배열
		int[] arr3 = new int[5];			//배열의 크기가 5인 값이 없는 배열, 크기만 설정

		boolean[] arr4 = new boolean[5];
		for(int i=0 ; i<arr4.length ; i++)
			System.out.println(arr4[i]);
		
		String[] arr5 = new String[5];
		for(int i=0 ; i<arr5.length ; i++)
			System.out.println(arr5[i]);
		
//		arr3 = {10, 20, 30, 40, 50};  //중괄호 초기화는 최초의 한번만 사용 가능, 
//										각각의 인덱스에 접근해야 함
		
	}

}
