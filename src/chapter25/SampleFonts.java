package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleFonts extends Frame {

    int next = 0;
    Font f;
    String msg;

    public SampleFonts(){
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);

        addMouseListener(new MyMouseAdapter(this));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg,10,60);
    }

    public static void main(String[] args) {
        SampleFonts appwin = new SampleFonts();

        appwin.setTitle("SampleFonts");
        appwin.setSize(new Dimension(200,100));
        appwin.setVisible(true);
    }
}
