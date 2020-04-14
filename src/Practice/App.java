package Practice;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JPanel {
	static App app = new App();
	//볼 위치
	static int x = 0;
	int y = 0;
	int speed = 5;
	int angleX = speed, angleY = speed;
	//볼 움직임
	private void move() {
		if (x + angleX < 0) {
			angleX = speed	;
		}
		else if (x + angleX > getWidth() - 50) {
			angleX = -speed;
		}
		else if (y + angleY < 0) {
			angleY = speed;
		}
		else if (y + angleY > getHeight() - 50) {
			angleY = -speed;
		}
		x = x+angleX;
		y = y+angleY;
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 50, 50);
//		g.drawString("Java", x, y);
	
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Move");
		frame.add(app);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			app.move();
			app.repaint();
			Thread.sleep(10);
		}
	}
	

}
