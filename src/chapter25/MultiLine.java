package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MultiLine extends Frame {
    int curX=20, curY=40;

    public MultiLine(){
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();

        nextLine("This is on line one.", g);
        nextLine("This is on line two.", g);
        sameLine("This is on the same line.", g);
        sameLine("This, too.", g);
        nextLine("This is on line three.", g);



    }

    void nextLine(String s, Graphics g){
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();
        curX = 20;
        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);
    }

    void sameLine(String s, Graphics g){
        FontMetrics fm = g.getFontMetrics();

        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);
    }

    public static void main(String[] args) {
        MultiLine appwin = new MultiLine();

        appwin.setSize(new Dimension(300,120));
        appwin.setTitle("MultiLine");
        appwin.setVisible(true);
    }
}
