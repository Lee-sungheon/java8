package Day13;

import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
		String now = "2020/03/31";
		
		StringTokenizer st = new StringTokenizer(now, "/");
		
		int cnt = st.countTokens();
		System.out.println(cnt);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String[] arr = now.split("/");
		for(String str : arr) {
			System.out.println(str);
		}
 	}

}
