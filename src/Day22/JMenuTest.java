package Day22;

import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest extends JFrame {
	
	public JMenuTest() {
		super();
		
		JFrame pt = new JFrame();
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmu1 = new JMenu("����");
		JMenu jmu2 = new JMenu("����");
		JMenu jmu3 = new JMenu("����");
		JMenuItem jmi1 = new JMenuItem("���θ����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		jmu1.add(jmi1);
		jmu1.add(jmi2);
		jmu1.add(jmi3);
		JMenuItem jmi4 = new JMenuItem("�߶󳻱�");
		JMenuItem jmi5 = new JMenuItem("����");
		JMenuItem jmi6 = new JMenuItem("�ٿ��ֱ�");
		jmu2.add(jmi4);
		jmu2.add(jmi5);
		jmu2.add(jmi6);
		JMenuItem jmi7 = new JMenuItem("��������");
		JMenuItem jmi8 = new JMenuItem("����ǥ����");
		jmu3.add(jmi7);
		jmu3.add(jmi8);
		
		jmb.add(jmu1);
		jmb.add(jmu2);
		jmb.add(jmu3);
		
		pt.setJMenuBar(jmb);
		pt.setSize(300, 300);
		pt.setTitle("?");
		pt.setVisible(true);
		pt.add("South", new Button("South"));
		pt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	
		JMenuTest jm = new JMenuTest();
		
	}

}