package java8;

public class coding_test_003 {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		int[] answer = new int[N];
        int[] fail = new int[N];
        double[] probability = new double[N]; 
        int sum = 0, intTemp = 0;
        double doubleTemp = 0;
        
        for(int i=0 ; i < N ; i++){
            for(int j=0 ; j<stages.length ; j++){
                if(stages[j] == i+1){
                    fail[i]++;
                }
            }
            probability[i] = ((double)fail[i]/(stages.length - sum));
            answer[i] = i+1;
            
            sum = 0;
            for(int j=0 ; j <= i ; j++)
            	sum += fail[j];
        }        
        
        //내림차순 정렬
        for(int i=0; i<probability.length ; i++) {
			for(int j=0; j<probability.length-1-i ; j++) {
				if(probability[j] < probability[j+1]) {
					doubleTemp=probability[j+1];
					probability[j+1]=probability[j];
					probability[j]=doubleTemp;
					
					intTemp = answer[j+1];
					answer[j+1] = answer[j];
					answer[j] = intTemp;
				}
			}
		}
        
        for(int i=0 ; i<N ; i++) {
        	System.out.println(answer[i]);
        	
        }
	}

}
