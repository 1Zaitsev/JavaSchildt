package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CBGroup extends Frame implements ItemListener {
    String msg = " ";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    public CBGroup(){
        setLayout(new FlowLayout());

        cbg = new CheckboxGroup();

        windows = new Checkbox("Windows", cbg, false);
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac OS", cbg, true);

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
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 20,120);
    }

    public static void main(String[] args) {
        CBGroup appwin = new CBGroup();

        appwin.setSize(new Dimension(240,180));
        appwin.setTitle("CBGroup");
        appwin.setVisible(true);
    }
}
