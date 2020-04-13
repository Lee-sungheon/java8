package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.event.*;

public class JScrollPaneTestEx {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JScrollPaneTest jp = new JScrollPaneTest();
		
		jp.init();
		f.add(jp);
		f.setSize(500,500);
		f.setResizable(true);
		f.setTitle("��ũ�ѹ� ó��");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}


class JScrollPaneTest extends JApplet {
	private static final long serialVersionUID = 1L;
	String[] title = {"���", "����", "�μ�"};
	JRadioButtonMenuItem rbm[];
	JPanel jp;
	public void init() {
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10,5));
		int cnt = 1;
		for (int i=1 ; i<=10 ; i++) {
			for (int j=1; j<=5 ; j++) {
				jp.add(new JButton("��ư"+cnt));
				cnt++;
			}
		}
		//����, ���� ��ũ�ѹٸ� �����ϱ� ���� ����� ����
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		add(js, BorderLayout.CENTER);
		
		//�޴� �����
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("����");
		JMenu jm2 = new JMenu("����");
		JMenu jm3 = new JMenu("����");
		JMenuItem jmi1 = new JMenuItem("���θ����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		JMenuItem jmi4 = new JMenuItem("�߶󳻱�");
		JMenuItem jmi5 = new JMenuItem("����");
		JMenuItem jmi6 = new JMenuItem("�ٿ��ֱ�");
		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);
		JMenuItem jmi7 = new JMenuItem("�ݱ�");
		jmi7.addActionListener(e -> System.exit(0));
		jm3.add(jmi7);
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);

		final JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup();
		rbm = new JRadioButtonMenuItem[3];
		
		for(int i=0 ; i<rbm.length ; i++) {
			rbm[i] = new JRadioButtonMenuItem(title[i]);
			pmenu.add(rbm[i]);
			tgroup.add(rbm[i]);
		}
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
				{checkTriggerEvent(e);}
			public void mouseReleased(MouseEvent e)
				{checkTriggerEvent(e);}
			private void checkTriggerEvent(MouseEvent e) {
				if(e.isPopupTrigger())
					pmenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		
	}

}
