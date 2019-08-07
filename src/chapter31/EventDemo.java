package chapter31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jlbl;

    EventDemo(){
        JFrame jfrm = new JFrame();
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220,90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

//        jbtnAlpha.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jlbl.setText("Alpha was pressed.");
//            }
//        });

//        jbtnBeta.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jlbl.setText("Beta was pressed.");
//            }
//        });

        jbtnAlpha.addActionListener((e -> {
            jlbl.setText("Alpha was pressed.");
        }));

        jbtnBeta.addActionListener((e -> {
            jlbl.setText("Beta was pressed.");
        }));



        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        jlbl = new JLabel("Press a button.");

        jfrm.add(jlbl);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
