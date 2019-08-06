package chapter26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListDemo extends Frame implements ActionListener {
    List os, browser;
    String msg = "";

    public ListDemo(){
        setLayout(new FlowLayout());

        os = new List(4,true);
        browser = new List(4);

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Opera");
        browser.add("Chrome");

        os.select(0);
        browser.select(1);

        add(os);
        add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        int idx[];

        msg = "Current OS: ";
        idx = os.getSelectedIndexes();
        for (int i = 0; i < idx.length; i++)
            msg += os.getItem(idx[i]) + " ";
        g.drawString(msg,6,120);
        msg = "Current browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg,6,140);
    }

    public static void main(String[] args) {
        ListDemo appwin = new ListDemo();

        appwin.setTitle("ListDemo");
        appwin.setSize(300,180);
        appwin.setVisible(true);
    }
}
