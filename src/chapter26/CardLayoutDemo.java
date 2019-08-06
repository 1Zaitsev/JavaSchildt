package chapter26;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo extends Frame {

    Checkbox windows10, windows8, windows7, android, solaris, mac;
    Panel osCard;
    CardLayout cardLO;
    Button win, other;

    public CardLayoutDemo(){

        setLayout(new FlowLayout());
        win = new Button("Windows");
        other = new Button ("Others");

        add(win);
        add(other);

        cardLO = new CardLayout();
        osCard = new Panel();
        osCard.setLayout(cardLO);

        windows10 = new Checkbox("Windows 10", true);
        windows8 = new Checkbox("Windows 8");
        windows7 = new Checkbox("Windows 7");
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        Panel winPan = new Panel();
        winPan.add(windows10);
        winPan.add(windows8);
        winPan.add(windows7);

        Panel otherPan = new Panel();
        otherPan.add(android);
        otherPan.add(solaris);
        otherPan.add(mac);

        osCard.add(winPan, "Windows");
        osCard.add(otherPan, "Other");

        add(osCard);

        win.addActionListener((e -> cardLO.show(osCard,"Windows")));
        other.addActionListener(e -> cardLO.show(osCard, "Other"));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cardLO.next(osCard);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CardLayoutDemo appwin = new CardLayoutDemo();

        appwin.setTitle("CardLayoutDemo");
        appwin.setSize(new Dimension(300, 220));
        appwin.setVisible(true);
    }
}
