import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        drawTriangle();
    }
    public void drawTriangle () {
        int width = SaxionApp.getWidth();
        int height = SaxionApp.getHeight();
        SaxionApp.drawLine(0, height, (width/2), 0);
        SaxionApp.drawLine((width/2), 0, width, height);
        SaxionApp.drawLine(width, height, 0, height );
    }

}
