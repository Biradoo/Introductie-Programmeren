import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
    SaxionApp.setBackgroundColor(Color.white);
    SaxionApp.setBorderColor(Color.black);

    SaxionApp.drawLine(100,400,100,250);
    SaxionApp.pause();

    SaxionApp.drawLine(100,250,175,175);
    SaxionApp.pause();
    SaxionApp.drawLine(175,175,250,250);
    SaxionApp.pause();
    SaxionApp.drawLine(250,250,100,250);
    SaxionApp.pause();

    SaxionApp.drawLine(100,250,250,400);
    SaxionApp.pause();
    SaxionApp.drawLine(250,250,250,400);
    SaxionApp.pause();
    SaxionApp.drawLine(250,250,100,400);
    SaxionApp.pause();
    SaxionApp.drawLine(100,400,250,400);

    SaxionApp.saveImage("Exercise5/my-output.png");
    }

}
