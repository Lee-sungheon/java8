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
//		System.out.println("����, ����, �� �� �ϳ��� �����ϼ���. (���� : s, ���� : r, �� : p, ���� : q)");
//		System.out.print(">> ");
//		String user = sc.nextLine();
//		
//		int intuser = 0;
//		int com = rd.nextInt(3);
//
//		String userRsp = "", comRsp = "";
//
//		if (user.equalsIgnoreCase("s")) {
//			userRsp = "����";
//			intuser = 0;
//		} else if (user.equalsIgnoreCase("r")) {
//			userRsp = "����";
//			intuser = 1;
//		} else if (user.equalsIgnoreCase("p")) {
//			userRsp = "��";
//			intuser = 2;
//		} 
//
//		if (com == 0)
//			comRsp = "����";
//		else if (com == 1)
//			comRsp = "����";
//		else
//			comRsp = "��";
//
//		if (intuser - com == 1 || intuser - com == -2) {
//			output = ("���� ��! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
//		} else if (com - intuser == 1 || com - intuser == -2) {
//			output = ("��ǻ�� ��! (��ǻ�� :" + comRsp + ", ���� : " + userRsp + ")");
//		} else {
//			output = ("���º�! (��ǻ�� : " + comRsp + ", ���� : " + userRsp + ")");
//		}
//		
//		sc.close();
//		
	}
	
	
	public void paint (Graphics g) {
		g.setFont(myFont);
//		g.drawString(output, x, y);
		Image image = Toolkit.getDefaultToolkit().
				getImage("C:\\Users\\HONEY\\Desktop\\������������_��_��_�ִ�_���ݺм�4.jpg");
		g.drawImage(image, 300, 300, 200, 200, this);
	}



}
