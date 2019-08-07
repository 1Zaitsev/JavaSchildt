package chapter31;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {
    Insets ins;
    Random rnd;

    PaintPanel(){
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        rnd = new Random();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x, y, x2, y2;

        int height = getHeight();
        int width = getWidth();

        ins = getInsets();

        for (int i = 0; i < 10; i++) {
            x = rnd.nextInt(width - ins.left);
            y = rnd.nextInt(height - ins.bottom);
            x2 = rnd.nextInt(width - ins.left);
            y2 = rnd.nextInt(width - ins.bottom);

            g.drawLine(x,y,x2,y2);
        }
    }
}
