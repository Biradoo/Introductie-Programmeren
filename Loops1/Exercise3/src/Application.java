import nl.saxion.app.SaxionApp;

import java.util.Random;
import java.util.Scanner;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Amount of tosses? ");
        int amountOfTosses = SaxionApp.readInt();


        for (int i = 1; i <= amountOfTosses; i++) {
            int diceRoll = SaxionApp.getRandomValueBetween(1, 7);
            SaxionApp.printLine("Roll " + i + " : " + diceRoll);
        }
    }

}
