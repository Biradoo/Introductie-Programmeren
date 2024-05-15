import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable { // There is a green button to the left of the word "public". Click here!

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 750, 750);
    }

    public void run() {
        // Print a line on the screen. It will be printed from top to bottom.
        SaxionApp.printLine("If you can read this, you have successfully run your first project!");

        // Print an image just because we can. The image is found in the "resources" folder at the root of this project.
        SaxionApp.drawImage("resources/firework.gif", 225, 225, 250, 250);
    }

}
