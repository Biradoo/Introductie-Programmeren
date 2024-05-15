import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 400, 100);
    }

    public void run() {
        String naam = "Bersan";

        SaxionApp.print("Hello ");
        SaxionApp.print(naam);

    }

}
