package chapter31;

import javax.swing.*;

public class SwingDemo {

    SwingDemo(){
        JFrame jfrm = new JFrame("A Simple Swing Application");
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlbl = new JLabel(" Swing means powerful GUIs.");
        jfrm.add(jlbl);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
