import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {

        SaxionApp.setBackgroundColor(Color.white);
        SaxionApp.setBorderColor(Color.black);
        SaxionApp.setFill(Color.white);
        SaxionApp.drawRectangle(50, 50, 150, 50);
        SaxionApp.drawLine(50, 50,125, 25);
        SaxionApp.drawLine(125, 25,200, 50);
        SaxionApp.drawRectangle(75, 80, 20, 20);


    }

}
