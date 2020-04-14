package Practice;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;        //Random 클래스를 사용하기 위해..

public class AppletThread extends Applet implements Runnable{
   
    int x,y;
    Thread t;
    Random r;
    Dimension size;
   
    public void init(){        //애플릿 초기화
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
    public void update(Graphics g){        //지정된 크기안에서 애플릿 실행하기 위한 update 메서드.
        g.clipRect(x,y,10,10);            //클리핑..
     
    }
    public void run(){        //쓰레드 실행..
        while(true){
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
            }
            x=(int)(r.nextFloat()*size.width);        //x,y 좌표 난수로 지정.
            y=(int)(r.nextFloat()*size.height);
           
            repaint();
        }
    }
}

