package Day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayout extends JFrame{
	
	
	public BorderLayout() {
		super();
		add("North", new Button("North"));
		add("South", new Button("South"));
		add("East", new Button("East"));
		add("West", new Button("West"));
		Box box = Box.createVerticalBox();
		box.add(Box.createVerticalStrut(0));
		box.add(new Button("+"));
		box.add(Box.createVerticalStrut(0));
		box.add(new JTextField(20));
//		box.add(Box.createGlue());
		
		Jpan jp2 = new Jpan();
		box.add(jp2);
		add("South", box);
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayout blt = new BorderLayout();
		Jpan jp = new Jpan();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp.init();
		jp.setBackground(Color.yellow);
		blt.add("Center",jp);
	
	}
	
}

class Jpan extends JPanel {
	public void init(){
		setBackground(Color.yellow);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(100, 50, 100, 100);
	}
}

