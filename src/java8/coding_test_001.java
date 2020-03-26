package java8;

public class coding_test_001 {
	
	  public static void main(String[] args) {
			
		  int[] answer = solution(10);
		  for(int i=0 ; i< answer.length ; i++)
	    	  System.out.print(answer[i]);
		}	
	  
	  public static int[] solution(int n) {
	    
	      int num = (int)Math.pow(2, n) - 1;
	      int[] answer = new int[num];
	      
	      if(n==1)
	    	  answer[0] = 0;
	      
	      else {
	    	  System.arraycopy(solution(n-1), 0, answer, 0, solution(n-1).length);
			
	    	  answer[(int)(num/2)]=0;
	    	  
	    	  int j=0;
	    	  for (int i=num-1 ; i>num/2 ; i--) {
	    		  if(answer[j]==1)
	    			  answer[i] = 0;
	    		  else
	    			  answer[i] = 1;
	    		  j++;
	    	  }
	      }
	     
	      return answer;
	  }

}
