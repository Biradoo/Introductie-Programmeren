import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        int lowerBound = 1;
        int upperBound = 100;

        int userInput = readIntBetweenBounds(lowerBound, upperBound);
        SaxionApp.printLine("Het ingevoerde getal is: " + userInput, Color.green);


    }

    public int readIntBetweenBounds(int lowerBound, int upperBound) {
        int userInput = 0;

        while (true) {
            SaxionApp.print("Voer een getal in tussen " + lowerBound + " en " + upperBound + ": ");
            userInput = SaxionApp.readInt();

            if (userInput >= lowerBound && userInput <= upperBound) {
                break;
            } else {
                SaxionApp.printLine("That value is not in the valid range! Try again!", Color.red);
            }
        }
        return userInput;
    }
}
