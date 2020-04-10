package Day01_11;

public class Day1101 {

	public static void main(String[] args) {
		
		//1부터 100까지 저장하는 배열을 만들고 전체의 합 출력
		
		int[] arr = new int[100];
		int sum = 0;
		
		for(int i=0 ; i<100 ; i++) {
			arr[i] = i+1;
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		//0~9까지 지정된 배열을 출력 후 0으로 초기화하여 출력
		
		int[] arr2 = new int[10];
		
		for(int i=0 ; i<10 ; i++)
		{
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0 ; i<10 ; i++)
		{
			arr[i] = 0;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//두개의 배열 요소만 초기화하고 나머지는 규칙에 따라 채우고 출력
		int[] arr3 = new int[10];
		arr3[0] = 1;
		arr3[1] = 2;
		
		for(int i=2 ; i<10 ; i++) {
			arr3[i] = arr3[i-2] + arr3[i-1];
		}
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
		
	}

}
