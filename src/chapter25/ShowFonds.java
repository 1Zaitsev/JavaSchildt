package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowFonds extends Frame {
    String msg = "First five fonds: ";
    GraphicsEnvironment ge;

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 10,60);
    }

    public ShowFonds(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontList = ge.getAvailableFontFamilyNames();

        for (int i = 0; (i < 5) && (i<fontList.length); i++) {
            msg += fontList[i] + " ";
        }
    }

    public static void main(String[] args) {
        ShowFonds appwin = new ShowFonds();
        appwin.setTitle("ShowFonds");
        appwin.setSize(500,100);
        appwin.setVisible(true);
    }


}
