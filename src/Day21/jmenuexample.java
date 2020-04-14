package Day21;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jmenuexample extends JFrame //implements ActionListener
{	   
	   JPanel panel;
       JLabel title;
       JMenuBar menubar;
       JMenu menu, submenu;
       JMenuItem menuItem;
       jmenuexample()
       {
           setTitle("JMenu Example");
           setSize(750, 450);
           setLayout(null);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           menubar = new JMenuBar();
           menu = new JMenu("File");
           menuItem = new JMenuItem("New\tCtrl+N");
           menu.add(menuItem);
           menuItem = new JMenuItem("Open\tCtrl+O");
           menu.add(menuItem);
           menuItem = new JMenuItem("Save\tCtrl+S");
           menu.add(menuItem);
           menu.addSeparator();
           menuItem = new JMenuItem("Exit");
           menu.add(menuItem);
           menubar.add(menu);
//           panel = new JPanel();
//           panel.setLayout(new GridLayout());
//           panel.setBounds(250,10, 400, 300);
           add(menubar);
//           add(panel);
           this.setJMenuBar(menubar);
       }
       public static void main(String argv[])
       {
           new jmenuexample();
       }
}