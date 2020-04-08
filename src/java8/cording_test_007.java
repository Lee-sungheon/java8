package java8;

public class cording_test_007 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] answers = {1,3,2,4,2};
		int[] answer = {};
		int[] correctCount = new int[3];
		int[] answer1 = {1,2,3,4,5};
		int[] answer2 = {2,1,2,3,2,4,2,5};
		int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
		int[] rank = new int[3];
		int cnt = 0, k = 0;
			
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<answers.length ; j++ ) {
				if(answers[j] == answer1[j%5]) correctCount[0]++; 
				if(answers[j] == answer2[j%8]) correctCount[1]++;
				if(answers[j] == answer3[j%10]) correctCount[2]++;
			}
		}
		
		for (int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(correctCount[i]<correctCount[j]) rank[i]++;
			}
			if(rank[i] == 0) cnt++;
		}

		answer = new int[cnt];
		
		for (int i=0 ; i<3 ; i++) {
			if(rank[i] == 0) {
				answer[k] = i+1;
				k++;
			}
			if(k==cnt) break;
		}
	}

}
