package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("���� ��ȯ ����");
		FontJApplet p = new FontJApplet();
		
		f.add(p);
		f.setBackground(Color.blue);
		f.setSize(600, 500);
		f.setResizable(false);
		f.setTitle("���ø� ù ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
