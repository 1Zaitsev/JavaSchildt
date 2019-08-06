package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagDemo extends Frame implements ItemListener {
    String msg = "";
    Checkbox windows, android, solaris, mac;

    public GridBagDemo(){
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        gbc.weightx = 1;
        gbc.insets = new Insets(0,6,0,0);
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);

        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);

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
        g.drawString(msg, 20, 100);

        msg += " Windows: " + windows.getState();
        g.drawString(msg, 20,120);
        msg += " Android: " + android.getState();
        g.drawString(msg,30,140);
        msg += " Solaris: " + solaris.getState();
        g.drawString(msg,30,160);
        msg += " Mac OS: " + mac.getState();
        g.drawString(msg,30,180);
    }

    public static void main(String[] args) {
        GridBagDemo appwin = new GridBagDemo();

        appwin.setTitle("GridBagDemo");
        appwin.setSize(new Dimension(500,200));
        appwin.setVisible(true);
    }
}
