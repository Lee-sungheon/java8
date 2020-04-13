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
		f.setTitle("스크롤바 처리");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}


class JScrollPaneTest extends JApplet {
	private static final long serialVersionUID = 1L;
	String[] title = {"사번", "성명", "부서"};
	JRadioButtonMenuItem rbm[];
	JPanel jp;
	public void init() {
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10,5));
		int cnt = 1;
		for (int i=1 ; i<=10 ; i++) {
			for (int j=1; j<=5 ; j++) {
				jp.add(new JButton("버튼"+cnt));
				cnt++;
			}
		}
		//수직, 수평 스크롤바를 설정하기 위한 상수를 얻음
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		add(js, BorderLayout.CENTER);
		
		//메뉴 만들기
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집");
		JMenu jm3 = new JMenu("보기");
		JMenuItem jmi1 = new JMenuItem("새로만들기");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		JMenuItem jmi4 = new JMenuItem("잘라내기");
		JMenuItem jmi5 = new JMenuItem("복사");
		JMenuItem jmi6 = new JMenuItem("붙여넣기");
		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);
		JMenuItem jmi7 = new JMenuItem("닫기");
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
