package Practice;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class JavaJApplet extends JPanel {
	private static final long serialVersionUID = 1L;
	
	static String output = "";
	int x=100, y=100;
	
	Font myFont = new Font("Serif", Font.BOLD, 55);
	
	public void init() {
//		Random rd = new Random();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("가위, 바위, 보 중 하나를 선택하세요. (가위 : s, 바위 : r, 보 : p, 종료 : q)");
//		System.out.print(">> ");
//		String user = sc.nextLine();
//		
//		int intuser = 0;
//		int com = rd.nextInt(3);
//
//		String userRsp = "", comRsp = "";
//
//		if (user.equalsIgnoreCase("s")) {
//			userRsp = "가위";
//			intuser = 0;
//		} else if (user.equalsIgnoreCase("r")) {
//			userRsp = "바위";
//			intuser = 1;
//		} else if (user.equalsIgnoreCase("p")) {
//			userRsp = "보";
//			intuser = 2;
//		} 
//
//		if (com == 0)
//			comRsp = "가위";
//		else if (com == 1)
//			comRsp = "바위";
//		else
//			comRsp = "보";
//
//		if (intuser - com == 1 || intuser - com == -2) {
//			output = ("유저 승! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
//		} else if (com - intuser == 1 || com - intuser == -2) {
//			output = ("컴퓨터 승! (컴퓨터 :" + comRsp + ", 유저 : " + userRsp + ")");
//		} else {
//			output = ("무승부! (컴퓨터 : " + comRsp + ", 유저 : " + userRsp + ")");
//		}
//		
//		sc.close();
//		
	}
	
	
	public void paint (Graphics g) {
		g.setFont(myFont);
//		g.drawString(output, x, y);
		Image image = Toolkit.getDefaultToolkit().
				getImage("C:\\Users\\HONEY\\Desktop\\가위바위보로_알_수_있는_성격분석4.jpg");
		g.drawImage(image, 300, 300, 200, 200, this);
	}



}
