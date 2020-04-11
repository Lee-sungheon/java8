package Practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RgbGame {

	int life = 5;
	int score = 0;
	private JFrame frame;
	private final JPanel panel = new JPanel();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RgbGame window = new RgbGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RgbGame() {
		initialize();
	}

	private void initialize() {
		
		Random rd = new Random();
		
		frame = new JFrame();
	
		frame.setTitle("∞°¿ßπŸ¿ß∫∏ ∞‘¿”");
		frame.setBounds(100, 100, 919, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(new Color(173, 255, 47));
		panel.setForeground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		frame.setLocationRelativeTo(null);				//∞°øÓµ• √¢ ∂ÁøÏ±‚
		
		JLabel lblNewLabel = new JLabel("Life : " + life);
		lblNewLabel.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		lblNewLabel.setBounds(24, 12, 209, 36);
		panel.add(lblNewLabel);
		
		JLabel lblGame = new JLabel("\uAC00\uC704\uBC14\uC704\uBCF4 Game");
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("±º∏≤", Font.BOLD, 45));
		lblGame.setBounds(187, 4, 528, 53);
		panel.add(lblGame);
		
		JLabel lblScore = new JLabel("Score : " + score);
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		lblScore.setBounds(678, 12, 209, 36);
		panel.add(lblScore);
		
		JLabel lblNewLabel_1 = new JLabel("GOOD LUCK!");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(177, 464, 538, 47);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uAC00\uC704, \uBC14\uC704, \uBCF4\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694!");
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("µ∏øÚ", Font.PLAIN, 35));
		label.setBounds(187, 60, 528, 53);
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\user_icon.png"));
		lblNewLabel_2.setBounds(103, 185, 275, 238);
		panel.add(lblNewLabel_2);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setHorizontalAlignment(SwingConstants.CENTER);
		lblVs.setForeground(Color.RED);
		lblVs.setFont(new Font("»ﬁ∏’¡ﬂ∞£∆‘√º", Font.BOLD, 45));
		lblVs.setBounds(392, 281, 128, 47);
		panel.add(lblVs);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setForeground(Color.BLACK);
		lblUser.setFont(new Font("»ﬁ∏’¡ﬂ∞£∆‘√º", Font.BOLD, 45));
		lblUser.setBounds(177, 424, 128, 47);
		panel.add(lblUser);
		
		JLabel lblCom = new JLabel("Computer");
		lblCom.setHorizontalAlignment(SwingConstants.CENTER);
		lblCom.setForeground(Color.BLACK);
		lblCom.setFont(new Font("»ﬁ∏’¡ﬂ∞£∆‘√º", Font.BOLD, 45));
		lblCom.setBounds(605, 424, 152, 47);
		panel.add(lblCom);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\\uCEF4\uD4E8\uD130.jpg"));
		label_1.setBounds(530, 185, 275, 238);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("\uAC00\uC704");
		btnNewButton.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(life<1) {
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("Game Over");
					return;
				}
				
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∞°¿ß.jpg"));
				int com = rd.nextInt(3);
				
				if (com == 2) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∫∏.jpg"));
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("¿Ø¿˙ Ω¬!");
					score += 100;
					lblScore.setText("Score : " + score);
				} else if (com == 1) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\πŸ¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.blue);
					lblNewLabel_1.setText("ƒƒ«ª≈Õ Ω¬!");
					life -= 1;
					lblNewLabel.setText("Life : " + life);
				} else {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∞°¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.black);
					lblNewLabel_1.setText("π´Ω¬∫Œ!");
				}
			}
		});
		btnNewButton.setBounds(187, 106, 168, 67);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\uBC14\uC704");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(life<1) {
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("Game Over");
					return;
				}
				
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\πŸ¿ß.jpg"));
				int com = rd.nextInt(3);
				
				if (com == 0) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∞°¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("¿Ø¿˙ Ω¬!");
					lblScore.setText("Score : " + score);
					score += 100;
				} else if (com == 2) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∫∏.jpg"));
					lblNewLabel_1.setForeground(Color.blue);
					lblNewLabel_1.setText("ƒƒ«ª≈Õ Ω¬!");
					life -= 1;
					lblNewLabel.setText("Life : " + life);
				} else {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\πŸ¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.black);
					lblNewLabel_1.setText("π´Ω¬∫Œ!");
				}
			}
		});
		button.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		button.setBounds(365, 106, 168, 67);
		panel.add(button);
		
		JButton button_1 = new JButton("\uBCF4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(life<1) {
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("Game Over");
					return;
				}
				
				lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∫∏.jpg"));
				int com = rd.nextInt(3);
				
				if (com == 1) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\πŸ¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.red);
					lblNewLabel_1.setText("¿Ø¿˙ Ω¬!");
					score += 100;
					lblScore.setText("Score : " + score);
				} else if (com == 0) {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∞°¿ß.jpg"));
					lblNewLabel_1.setForeground(Color.blue);
					lblNewLabel_1.setText("ƒƒ«ª≈Õ Ω¬!");
					life -= 1;
					lblNewLabel.setText("Life : " + life);
				} else {
					label_1.setIcon(new ImageIcon("C:\\Users\\HONEY\\Desktop\\∫∏.jpg"));
					lblNewLabel_1.setForeground(Color.black);
					lblNewLabel_1.setText("π´Ω¬∫Œ!");
				}
			}
		});
		button_1.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		button_1.setBounds(539, 106, 168, 67);
		panel.add(button_1);
		
	}

}