package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontInfo extends Frame {

    public FontInfo(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Font f = g.getFont();
        String fontName = f.getFontName();
        String fontFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();
        String msg = "Family: " + fontName;

        msg += ", Font: " + fontName;
        msg += ", Size: " +fontSize + ", Style: ";

        if((fontStyle & Font.BOLD) == Font.BOLD) msg += "Bold";
        if((fontStyle & Font.ITALIC) == Font.ITALIC) msg += "Italic";
        if((fontStyle & Font.PLAIN) == Font.PLAIN) msg += "Plain";

        g.drawString(msg,10,60);
    }

    public static void main(String[] args) {
        FontInfo appwin = new FontInfo();

        appwin.setSize(new Dimension(500,100));
        appwin.setTitle("FontInfo");
        appwin.setVisible(true);
    }
}
