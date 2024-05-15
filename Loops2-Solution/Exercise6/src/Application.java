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
        ArrayList<String> items = new ArrayList<>();

        boolean gameOver = false;

        while(!gameOver) {
            SaxionApp.clear();
            SaxionApp.printLine("I'm going on a holiday and I'm bringing...");

            for(String item : items) {
                SaxionApp.print("- ");
                String input = SaxionApp.readString();

                if (!input.equals(item)) {
                    SaxionApp.printLine("WRONG! It was: "+item, SaxionApp.SAXION_PINK);
                    SaxionApp.printLine("Your score: "+items.size());
                    SaxionApp.saveImage("Exercise6/sample_output2.png");

                    gameOver = true;
                    break;
                }
            }

            // If the game is over, we don't need to re-ask the other elements.. the while-loop will ensure proper termination.
            if(!gameOver) {
                SaxionApp.print("- ");
                String input = SaxionApp.readString(SaxionApp.SAXION_PINK);
                items.add(input);
            }
        }

        SaxionApp.saveImage("Exercise6/sample_output.png");
    }
}
