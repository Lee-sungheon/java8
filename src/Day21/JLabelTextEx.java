package Day21;

import java.awt.FlowLayout;

import javax.swing.*;

class JLabelTextEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabelText p = new JLabelText();
		p.init();
		f.add(p);
		f.setSize(280,230);
		f.setResizable(false);
		f.setTitle("���ؽ�Ʈ ����");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class JLabelText extends JPanel {
	private static final long serialVersionUID = 1L;
	JTextField tf;
	JTextArea ta;
	JPasswordField pf;
	
	public void init() {
		setLayout(new FlowLayout());
		JLabel lb1 = new JLabel("�̸�");
		JLabel lb2 = new JLabel("�ּ�");
		JLabel lb3 = new JLabel("���");
		tf = new JTextField(20);
		ta = new JTextArea(7, 20);
		pf = new JPasswordField(20);
		add(lb1);
		add(tf);
		add(lb2);
		add(ta);
		add(lb3);
		add(pf);
	}

}