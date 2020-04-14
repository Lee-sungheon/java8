package Practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ParamApplet extends JApplet {
	private static final long serialVersionUID = 1L;
	Font myFont = new Font("Serif", Font.BOLD, 25);
	int[] input = {30, 15, 45, 10};
	String[] title = {"Äá", "¹Ð", "½Ò", "¿Á¼ö¼ö"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.gray};
	
	public void init() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		JLabel lb = new JLabel("ÀÌ¸§");
		JTextField tf = new JTextField();
		lb.setBounds(100,100,100,100);
		add(lb);
		tf.setBounds(200,200,100,100);
		add(tf);
		JLabel lb2 = new JLabel("ÁÖ¼Ò");
		JTextField tf2 = new JTextField(30);
		add(lb2);
		add(tf2);
	
	}
	
//	public void paint (Graphics g) {
//
//		g.setFont(myFont);
//		g.drawString("Java", 300, 300);
//		g.setColor(Color.yellow);
//		g.fillRect(50, 50, 50, 50);
//		g.setColor(Color.black);
//		g.drawLine(10, 20, 150, 150);
//		for(int y=0 ; y<150 ; y+=20)
//			g.drawLine(10+y, 20, 10+y, 150);
//			
//		g.setColor(Color.blue);
//		g.drawString("±Û¾¾ ¾²±â",20,20);
//		
//		for(int y=1 ; y<=5 ; y++) {
//			Color myColor = new Color(0, 0, y*50);
//			g.setColor(myColor);
//			g.fill3DRect(y*30+200, 22, 28, 28, false);
//		}
//		
//		int n=0;
//		for(int i=0 ; i<input.length ; i++) {
//			g.setColor(color[i]);
//			g.fillArc(0, 300, 300, 300, n, 360*input[i]/100);
//			n += (360*input[i]/100);
//		}
//		
//		int y=0;
//		for(int i=0 ; i<input.length ; i++) {
//			g.setColor(color[i]);
//			g.fillRect(400, 300+y, 40, 40);
//			g.setColor(Color.black);
//			g.drawString(title[i], 450, 335+y);
//			y+=50;
//		}
//
//		
//	
//	}
	
}
