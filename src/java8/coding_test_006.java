package java8;

public class coding_test_006 {

	public static void main(String[] args) {

		String s = "ZAB";
		int n = 1;

		String answer = "";
		StringBuffer str = new StringBuffer("");

		char[] cha = s.toCharArray();

		for(int i=0 ; i<cha.length ; i++) {
			if(cha[i]>='a'&&cha[i]<='z'){
				cha[i] += n;
				if(cha[i]>'z') cha[i] -= 26;
			}
			
			else if(cha[i]>='A'&&cha[i]<='Z'){
				cha[i] += n;
				if(cha[i]>'Z') cha[i] -= 26;
			}
			
			str.append(cha[i]);
		}
		answer = str.toString();
		System.out.println(answer);

	}

}
