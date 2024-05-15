import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Some intial setup
        int fieldLength = 25;
        SaxionApp.resize(fieldLength * 50 + 50, 300);
        SaxionApp.setBackgroundColor(Color.WHITE); // The image is black.. so a white background is useful to see what is going on.
        SaxionApp.setFill(SaxionApp.createColor(124, 252, 0)); // Grass green!


    }

}
