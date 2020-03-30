package Day12;

public class CallByValue {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;

		CallByValue cbv = new CallByValue();
		int res = cbv.plus(num1, num2);
		System.out.println(res);
		System.out.println(num1 + num2); //CallByValue는 값만 전달하는 것이기 때문에
										 //변수의 값은 변하지 않음

		int[] arr = {10, 20, 30, 40, 50};
		int res2 = cbv.sum(arr);
		System.out.println(res2);
		
		int sum = 0;
		for (int n : arr) {				//CallByReference는 주소를 전달하기 때문에
										//주소에 있는 원본 값이 변함
			sum += n;
		}
		System.out.println(sum);
		
	}

	int plus(int x, int y) {
		x+=10;
		y+=10;
		return x + y;
	}
	
	int sum(int[] arr) {
		arr[2] = 330;
		int sum = 0;
		for(int n : arr) {
			sum+=n;
		}
		return sum;
	}
}
