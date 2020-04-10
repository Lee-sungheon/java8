package Day01_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		InputStreamReader instr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(instr);  //문자만 입력받을 수 있음 (숫자도 문자로 인식)
		
		System.out.println("문자열 입력");
		String str = inbr.readLine();
		System.out.println(str);
		
		System.out.println("숫자 입력");
		int num = Integer.parseInt(inbr.readLine());  //문자열을 숫자로 변경하는 method
		System.out.println(num + 10);
		
		inbr.close();
		instr.close();   //닫는 것은 만든 순서의 역순으로 닫아야 함
	}

}
