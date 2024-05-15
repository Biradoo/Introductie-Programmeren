import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.setBackgroundColor(Color.black);
        SaxionApp.print("Please enter the password: ");
        String password = SaxionApp.readString(Color.BLACK);

        if (password.equals("R34llys3cre7")) {
            SaxionApp.printLine("ACCES GRANTED", Color.green);
        } else {
            SaxionApp.printLine("ACCES DENIED", Color.red);
        }
    }

}
