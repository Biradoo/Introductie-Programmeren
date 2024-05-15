import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 830, 275);
    }

    public void run() {
        SaxionApp.setBackgroundColor(Color.white);
        int y = 100;
        drawHouse(100, y,100,100, Color.red);
        drawHouse(200, y,100,75, Color.yellow);
        drawHouse(300, y,100,75, Color.black);
        drawHouse(400, y,100,75, Color.blue);
        drawHouse(500, y,100,75, Color.green);
        drawHouse(600, y,100,75, Color.orange);
    }

    public void drawHouse(int x, int y, int width, int height, Color color) {

        SaxionApp.setBorderColor(color);
        SaxionApp.setFill(Color.white);
        SaxionApp.drawRectangle(x,y,width,height);
        SaxionApp.drawLine(x, y, x+width/2, y-height/2);
        SaxionApp.drawLine(x+width/2, y-height/2, x+width, y);
    }
}
