package chapter24;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;
    MousePressedDemo mousePressedDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }

    public MyMouseAdapter(MousePressedDemo mousePressedDemo){
        this.mousePressedDemo = mousePressedDemo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        adapterDemo.msg = "Mouse clicked";
        adapterDemo.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        adapterDemo.msg = "Mouse dragged";
        adapterDemo.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mousePressedDemo.msg = "Mouse pressed.";
        mousePressedDemo.repaint();
    }
}
