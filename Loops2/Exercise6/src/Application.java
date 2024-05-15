import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

/**
 * A well-known Dutch children's game: "Ik ga op vakantie en ik neem mee..." (I'm going on a holiday and I'm bringing...)
 * Players take turns in adding an item to the list of things to bring on a holiday. However before they can add
 * an item, they must repeat all earlier items in order.
 */
public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.printLine("I'm going on holiday and I'm bringing...");
        ArrayList<String> holidayItems = new ArrayList<>();
        ArrayList<String> rightAnswers = new ArrayList<>();

        int valid = -1;
        int counter = 0;


        while(valid != 0) {
            SaxionApp.print("- ");
            String input = SaxionApp.readString();
            holidayItems.add(input);
            SaxionApp.clear();

        }

    }
}
