package chapter24;

import java.awt.*;

public class AdapterDemo extends Frame {
    String msg = "";

    public AdapterDemo(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void paint(Graphics g){
        g.drawString(msg,20,80);
    }

    public static void main(String[] args) {
        AdapterDemo appwin = new AdapterDemo();
        appwin.setSize(new Dimension(200,150));
        appwin.setTitle("AdapterDemo");
        appwin.setVisible(true);
    }
}
