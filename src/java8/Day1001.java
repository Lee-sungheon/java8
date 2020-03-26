package java8;

public class Day1001 {

	public static void main(String[] args) {
		int s0 = 10, s1 = 20, s2 = 30, s3 = 40, s4 = 50;
		int[] students = {10, 20, 30, 40, 50}; //중괄호로 배열을 초기화하면 배열의 크기를
											   //입력되는 값으로 자동 계산
		int res1 = s0 + s1 + s2 + s3 + s4;
		int res2 = 0;
		System.out.println(res1);
		
		for(int i=0 ; i<5 ; i++) {
			res2 += students[i];	//배열의 인덱스를 변수로 사용가능
		}
		System.out.println(res2);
		
		s0 = 100;
		System.out.println(s0);
		students[0] = 1000;
		System.out.println(students[0]);

	}

}
