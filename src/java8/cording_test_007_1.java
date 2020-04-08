package java8;

import java.util.ArrayList;

public class cording_test_007_1 {

	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		int[] answer = {};
		int[] correctCount = new int[3];
		int[] answer1 = {1,2,3,4,5};
		int[] answer2 = {2,1,2,3,2,4,2,5};
		int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
		int max = 0;
			
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<answers.length ; j++ ) {
				if(answers[j] == answer1[j%5]) correctCount[0]++; 
				if(answers[j] == answer2[j%8]) correctCount[1]++;
				if(answers[j] == answer3[j%10]) correctCount[2]++;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		max = Math.max(correctCount[0], Math.max(correctCount[1], correctCount[2]));
		
		if(max==correctCount[0]) list.add(1);
		if(max==correctCount[1]) list.add(2);
		if(max==correctCount[2]) list.add(3);
		
		answer = new int[list.size()];
		for (int i=0 ; i<list.size() ; i++) {
			answer[i]=list.get(i);
		}
	}
}
