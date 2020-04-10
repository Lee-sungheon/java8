package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("색상 변환 예제");
		FontJApplet p = new FontJApplet();
		
		f.add(p);
		f.setBackground(Color.blue);
		f.setSize(600, 500);
		f.setResizable(false);
		f.setTitle("애플릿 첫 예제");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
