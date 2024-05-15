import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Size of each cell
        int size = 30;

        // Resize the board
        SaxionApp.resize(12 * size, 16 * size);

        // Colors in the image
        SaxionApp.setBackgroundColor(Color.WHITE);
        Color generatedColor = SaxionApp.createColor(95, 36, 12);
        ;
        SaxionApp.setFill(generatedColor);

        // Disable border
        SaxionApp.turnBorderOff();

        SaxionApp.drawRectangle(150, 150, size * 2, size * 4);
        SaxionApp.pause();
        SaxionApp.clear();
        size = size + 5;

        SaxionApp.drawRectangle(150, 150, size * 2, size * 4);
        SaxionApp.pause();
        SaxionApp.clear();
        size = size + 5;

        SaxionApp.drawRectangle(150, 150, size * 2, size * 4);
        SaxionApp.pause();
        SaxionApp.clear();
        // You take it from here! Remember that you can take a *pause* after each step!
    }

}
