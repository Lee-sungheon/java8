package Day20;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FontJApplet extends JPanel {

	Font sansPlain, serifBold, serifBoldT, monoItalic;
	String param;
	
	public void init() {
		serifBold = new Font("Serif", Font.BOLD, 10);
		serifBoldT = new Font("Serif", Font.BOLD + Font.ITALIC, 13);
		sansPlain = new Font("SansSerif", Font.PLAIN, 16);
		monoItalic = new Font("Monospaced", Font.ITALIC, 20);
	}
	
	public void paint(Graphics g) {
		g.setFont(serifBold);
		param = "Font name = Serif, style = BOLD, size = 10";
		g.drawString(param, 10, 10);
		
		g.setFont(serifBoldT);
		param = "Font name = Serif, style = BOLD+ITALIC, size = 13";
		g.drawString(param, 10, 50);
		
	}
}
