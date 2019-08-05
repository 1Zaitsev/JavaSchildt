package chapter24;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    String msg = " ";
    int mouseX = 0, mouseY = 0; // координаты положения мыши

    public MouseEventDemo(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        msg = msg + " -- click received";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Button down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Buttom released";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered.";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited.";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "*" + "mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        msg = "Moving mouse at " + e.getX() + ", " + e.getY();
        repaint();
    }

    @Override
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventDemo appwin = new MouseEventDemo();

        appwin.setSize(new Dimension(300,300));
        appwin.setTitle("MouseEventDemo");
        appwin.setVisible(true);
    }
}

