package java8;

import java.io.*;

public class back_004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in),8);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),8);
		int N, num, max = 0;
        
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for(int i=0 ; i<N ; i++) {
            num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(max<num) max=num;
        }
        
        int[] cntArray = new int[max + 1]; 
        
        for(int i=0 ; i<N ; i++) {
        	cntArray[arr[i]]++;
         }
        
        for(int i=0 ; i<cntArray.length ; i++){
            if(cntArray[i] != 0) {
            	for(int j=0 ; j<cntArray[i] ; j++) {
            		bw.write(i + "\n");
            	}
            }
        }
        
		br.close();
		bw.flush();
	}

}