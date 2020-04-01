package java8;

public class coding_test_004 {

	public static void main(String[] args) {
		int[] arr1 = {0, 0, 0, 0, 0};
		int[] arr2 = {30, 1, 2, 7, 28};
		int n = 5, diff=0;
		int[] arr3 = new int[n];
		String[] answer = new String[n];
		String[] strArr = new String[n];
		
		for(int i=0 ; i<n ; i++) {
			arr3[i] = (arr1[i]|arr2[i]);
			strArr[i] = Integer.toBinaryString(arr3[i]);
			System.out.println(strArr[i]);
		}
	
		for(int i=0 ; i<n ; i++) {
			String replace = strArr[i].replace("1", "#");
			answer[i] = replace.replace("0", " ");
			
			if(answer[i].length() < n) {
				diff = n - answer[i].length();
				for(int j=0 ; j < diff ; j++) {
					answer[i] = ' ' + answer[i];
				}
			}
			System.out.println(answer[i]);
		}
	}

}
