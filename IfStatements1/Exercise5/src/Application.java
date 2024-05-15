import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        int numberOne = SaxionApp.getRandomValueBetween(1, 100);
        int numberTwo = SaxionApp.getRandomValueBetween(1, 100);
        int sum = numberOne + numberTwo;

        SaxionApp.print("What is " + numberOne + " + " + numberTwo + "? ");
        int answer = SaxionApp.readInt();

        if (answer == sum) {
            SaxionApp.printLine("Correct! ", Color.green);
        } else {
            SaxionApp.printLine("Incorrect! ", Color.red);
        }

    }

}
