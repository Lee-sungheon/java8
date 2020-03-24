package java8;

public class Day0801 {

	public static void main(String[] args) {
		//1~100 중 3과 5의 공배수의 합 출력
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			if(i%3==0 && i%5==0)
				sum=+i;
		}
		System.out.println(sum);
		
		// 1~100 중에 짝수는 더하고 홀수는 뺀 결과를 출력
		int result = 0;
		for(int i=1 ; i<=100; i++)
		{
			if(i%2==0) result+=i;
			else result-=i;
		}
		System.out.println(result);
	}

}
