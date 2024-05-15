import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("What is the brand of the car? ");
        String carBrand = SaxionApp.readString();
        SaxionApp.print("How many kilometers has the car driven? ");
        int kilometers = SaxionApp.readInt();

        if (carBrand.equals("Volvo") || kilometers < 100000) {
            SaxionApp.printLine("All good! No maintenance needed!", Color.green);
        } else {
            SaxionApp.printLine("Maintenance needed!", Color.red);
        }
    }

}
