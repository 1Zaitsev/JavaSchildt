package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public CheckboxDemo(){
        setLayout(new FlowLayout(FlowLayout.LEFT));

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 20,120);
        msg = "Windows: " + windows.getState();
        g.drawString(msg, 20,140);
        msg = "Android: " + android.getState();
        g.drawString(msg, 20,160);
        msg = "Solaris: " + solaris.getState();
        g.drawString(msg, 20,180);
        msg = "Mac OS: " + mac.getState();
        g.drawString(msg, 20,200);
    }

    public static void main(String[] args) {
        CheckboxDemo appwin = new CheckboxDemo();

         appwin.setTitle("CheckboxDemo");
         appwin.setSize(new Dimension(240,220));
         appwin.setVisible(true);
    }
}
