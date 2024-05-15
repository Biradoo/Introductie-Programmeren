import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("What is your occupation? ");
        String occupation = SaxionApp.readString();

        if (occupation.equals("Teacher") || occupation.equals("Student")) {
            SaxionApp.printLine("You can get a educational license!", Color.GREEN);
        } else {
            SaxionApp.printLine("You have to pay full price!", Color.RED);
        }
    }

}
