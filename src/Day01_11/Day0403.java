package Day01_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {

	public static void main(String[] args) throws IOException {
		InputStreamReader instr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(instr);  //���ڸ� �Է¹��� �� ���� (���ڵ� ���ڷ� �ν�)
		
		System.out.println("���ڿ� �Է�");
		String str = inbr.readLine();
		System.out.println(str);
		
		System.out.println("���� �Է�");
		int num = Integer.parseInt(inbr.readLine());  //���ڿ��� ���ڷ� �����ϴ� method
		System.out.println(num + 10);
		
		inbr.close();
		instr.close();   //�ݴ� ���� ���� ������ �������� �ݾƾ� ��
	}

}
