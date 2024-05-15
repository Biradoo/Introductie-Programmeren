import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    {

    }

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.print("Enter the first value: ");
        int firstValue = SaxionApp.readInt();
        SaxionApp.print("Enter the second value: ");
        int secondValue = SaxionApp.readInt();

        if (firstValue < secondValue) {
            SaxionApp.printLine(firstValue + " is " + "SMALLER than " + secondValue);
        } else if (firstValue > secondValue) {
            SaxionApp.printLine(firstValue + " is " + "LARGER than " + secondValue);
        } else SaxionApp.printLine("Both values are EQUAL");


    }

}
