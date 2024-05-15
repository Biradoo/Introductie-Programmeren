import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.print("Please enter your age: ");
        int age = SaxionApp.readInt();

        if (age <= 18) {
            SaxionApp.printLine("You are not allowed to buy alcohol!", Color.RED);
        } else SaxionApp.printLine("You are allowed to buy alcohol!", Color.green);
    }
}

