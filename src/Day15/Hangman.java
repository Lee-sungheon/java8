package Day15;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

	String[] quiz = {"apple", "class", "hero", "attitude", "money", "twosomeplace"};
	String input;
	char input2;											
	String hiddenString;									//정답
	StringBuffer outputString;								//입력 문자
	StringBuffer repetition;								//키 반복 여부 확인
	Scanner sc;
	int remainder;											//남은 기회
	
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
		
		System.out.println("Hangman Game을 시작합니다.");
		
		while(true) {
			System.out.print("문제 : " + outputString);
			System.out.println("("+hiddenString.length() + "글자)" + "(Life : " + remainder +")");
			System.out.println("알파벳을 입력해주세요.");
			System.out.print(">> ");
			
			input = sc.nextLine();
			input2 = input.charAt(0);
			
			if(input.length()==1 && input2>='a' && input2<='z') {
				if(repetition.toString().indexOf(input2) == -1) {
					repetition.append(input);
					if(hiddenString.indexOf(input2)==-1) {
						remainder--;
						System.out.println("틀렸습니다!");
						if(remainder==0) {
							System.out.println("GameOver! 정답은 " + hiddenString + "입니다.");
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
							System.out.println("문제 : " + outputString);
							System.out.println("정답입니다! 게임을 종료합니다.");
							break;
						}
					}
					
				}
				else {
					System.out.println("이미 한 번 입력했던 문자입니다! 다시 입력해주세요.");
				}
			}
			else {
				System.out.println("a~z까지의 문자를 입력해주세요.");
			}
		}
	}
}
