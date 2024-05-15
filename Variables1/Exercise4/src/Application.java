import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        // Create 9 variables for the characters to print, one for each position

        // 2 horizontal lines

        // 2 vertical lines

        // [Optional] Disable the border
        SaxionApp.turnBorderOff();

        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        // You can fill in the numbers if you want to!

    }

}
