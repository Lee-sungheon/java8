package java8;

public class Day1004 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		
		String str1 = "안녕하세요";
		str1 = "hello"; //동일한 형태의 다른 객체를 대입할 수 있음
		
		arr2 = new int[] {100, 200, 300, 400, 500}; //배열도 동일한 형태의 다른 객체를 대입할 수 있음
//		arr2 = {100, 200, 300, 400, 500};  // 이건 안됨
		
		arr1 = new int[10]; //다른 객체로 변환 가능 -> 다른 크기의 배열을 사용하는것은
							//기존 배열을 버리고 새로운 배열을 만드는 것과 같음
		
		System.out.println(str1.length());
		System.out.println(arr1.length);
	}

}
