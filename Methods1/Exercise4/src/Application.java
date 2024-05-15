import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(100, 100, 50);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(400, 100, 50);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(250, 250, 50);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(100, 400, 50);
        SaxionApp.setFill(SaxionApp.getRandomColor());
        SaxionApp.drawCircle(400, 400, 50);
    }

}
