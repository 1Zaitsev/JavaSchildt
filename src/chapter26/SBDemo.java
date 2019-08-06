package chapter26;

import java.awt.*;
import java.awt.event.*;

public class SBDemo extends Frame implements AdjustmentListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    public SBDemo(){
        setLayout(new FlowLayout());
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0,1,0,200);
        vertSB.setPreferredSize(new Dimension(100,20));

        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0,1,0,100);
        vertSB.setPreferredSize(new Dimension(20,100));

        add(vertSB);
        add(horzSB);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                vertSB.setValue(y);
                horzSB.setValue(x);
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        msg = "Vertical: " + vertSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg,20,160);

        g.drawString("*", horzSB.getValue(),vertSB.getValue());
    }

    public static void main(String[] args) {
        SBDemo appwin = new SBDemo();

        appwin.setTitle("SBDemo");
        appwin.setSize(new Dimension(300,180));
        appwin.setVisible(true);
    }
}
