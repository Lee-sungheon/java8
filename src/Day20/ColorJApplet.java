package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJApplet extends JPanel{
	private static final long serialVersionUID = 1L;

	public void init() {
		setBackground(Color.orange);
		
	}
	
	public void paint(Graphics g) {
		Color myColor = new Color(255, 0, 0);
		g.setColor(myColor);
		g.drawString("������ �۾��� �׸���", 40, 100);
	}

}
