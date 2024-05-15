import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 900,700);
    }

    public void run() {

        SaxionApp.print("Enter the age of the player: ");
        int age = SaxionApp.readInt();
        SaxionApp.print("Enter the position of the player (striker / midfielder / defender): ");
        String position = SaxionApp.readString();

        if ((age <= 20 && position.equals("striker")) || (age <= 23 && position.equals("midfielder")) || (age >= 30 && position.equals("defender"))) {
            SaxionApp.printLine("Suitable player! ", Color.green);
        } else {
            SaxionApp.printLine("Nope... next!", Color.RED);
        }
    }
}
