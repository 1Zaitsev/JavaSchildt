package chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo extends Frame {

    public BorderLayoutDemo(){

        add(new Button("This is across the top"), BorderLayout.NORTH);
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);

        String msg = "The reasonable man adapts himself to the world;\nthe unreasonable one persists in trying to adapt the world to himself.\n" +
                "Therefore all progress depends on the unreasonable man. \n\n                 -George Bernard Shaw.";

        add(new TextArea(msg), BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        BorderLayoutDemo appwin = new BorderLayoutDemo();

        appwin.setTitle("BorderLayoutDemo");
        appwin.setSize(new Dimension(300,220));
        appwin.setVisible(true);
    }
}
