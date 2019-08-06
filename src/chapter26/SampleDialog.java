package chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleDialog extends Dialog {
    SampleDialog(Frame parent, String title){
        super(parent,title,false);
        setLayout(new FlowLayout());
        setSize(new Dimension(300,200));

        add(new Label("Press this button"));

        Button b = new Button("Cancel");
        add(b);
        b.addActionListener((e -> dispose()));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("This is in the dialog box",20,80);
    }
}
