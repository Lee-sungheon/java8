package Day15;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

	String[] quiz = {"apple", "class", "hero", "attitude", "money", "twosomeplace"};
	String input;
	char input2;											
	String hiddenString;									//����
	StringBuffer outputString;								//�Է� ����
	StringBuffer repetition;								//Ű �ݺ� ���� Ȯ��
	Scanner sc;
	int remainder;											//���� ��ȸ
	
	public Hangman() {
		sc = new Scanner(System.in);
		Random rd = new Random();
		int num = rd.nextInt(quiz.length);
		hiddenString = quiz[num];
		outputString = new StringBuffer("");
		repetition = new StringBuffer("");
		for(int i=0 ; i<hiddenString.length(); i++) {
			outputString.append("_");
		}
		remainder = 6;
	}
	
	public void playGame() {
		
		System.out.println("Hangman Game�� �����մϴ�.");
		
		while(true) {
			System.out.print("���� : " + outputString);
			System.out.println("("+hiddenString.length() + "����)" + "(Life : " + remainder +")");
			System.out.println("���ĺ��� �Է����ּ���.");
			System.out.print(">> ");
			
			input = sc.nextLine();
			input2 = input.charAt(0);
			
			if(input.length()==1 && input2>='a' && input2<='z') {
				if(repetition.toString().indexOf(input2) == -1) {
					repetition.append(input);
					if(hiddenString.indexOf(input2)==-1) {
						remainder--;
						System.out.println("Ʋ�Ƚ��ϴ�!");
						if(remainder==0) {
							System.out.println("GameOver! ������ " + hiddenString + "�Դϴ�.");
							break;
						}
					}
					
					else {
						for(int i=0 ; i<hiddenString.length() ; i++) {
							if(hiddenString.charAt(i) == input2) {
								outputString.setCharAt(i,input2);
							}
						}	
						if(outputString.indexOf("_")==-1) {
							System.out.println("���� : " + outputString);
							System.out.println("�����Դϴ�! ������ �����մϴ�.");
							break;
						}
					}
					
				}
				else {
					System.out.println("�̹� �� �� �Է��ߴ� �����Դϴ�! �ٽ� �Է����ּ���.");
				}
			}
			else {
				System.out.println("a~z������ ���ڸ� �Է����ּ���.");
			}
		}
	}
}
