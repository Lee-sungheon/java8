package Practice;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;        //Random Ŭ������ ����ϱ� ����..

public class AppletThread extends Applet implements Runnable{
   
    int x,y;
    Thread t;
    Random r;
    Dimension size;
   
    public void init(){        //���ø� �ʱ�ȭ
        t=new Thread(this);
        t.start();
        r=new Random();
        size=getSize();
    }
    public void paint(Graphics g){
    	super.paint(g);
        if(x !=0 || y !=0)
            g.fillOval(x,y,10,10);
    }
    public void update(Graphics g){        //������ ũ��ȿ��� ���ø� �����ϱ� ���� update �޼���.
        g.clipRect(x,y,10,10);            //Ŭ����..
     
    }
    public void run(){        //������ ����..
        while(true){
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
            }
            x=(int)(r.nextFloat()*size.width);        //x,y ��ǥ ������ ����.
            y=(int)(r.nextFloat()*size.height);
           
            repaint();
        }
    }
}

