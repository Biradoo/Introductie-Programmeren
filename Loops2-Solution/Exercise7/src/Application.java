import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Memory trainer ('MAX geheugentrainer'). The application loads a list of groceries from a CSV file, and selects
 * 10 random items from these. It'll show these items to the user for 10 seconds. After that, the user is asked
 * to type back as many of these as she/he can remember. After giving up (by typing an empty line), the application
 * shows the user's score, as well as a list of missed groceries.
 */

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Load the list of groceries from the csv file.
        ArrayList<String> groceries = new ArrayList<>();
        CsvReader reader = new CsvReader("Exercise7/groceries.csv");
        while(reader.loadRow()) {
            String grocery = reader.getString(0);
            groceries.add(grocery);
        }


        SaxionApp.printLine("You'll have 10 seconds to remember as many groceries as you can.");
        SaxionApp.pause();
        SaxionApp.printLine("");

        // Pick 10 random groceries.
        ArrayList<String> selection = selectRandom(groceries, 10);

        // Show the selected groceries
        for (String grocery : selection) {
            SaxionApp.printLine(grocery);
        }

        SaxionApp.saveImage("Exercise7/sample_output.png");

        SaxionApp.sleep(10);

        SaxionApp.clear();
        SaxionApp.printLine("Type the groceries you remember.");
        SaxionApp.printLine("Use an empty line to give up.");
        SaxionApp.printLine("");
        int score = 0;

        // Read the first guess
        String grocery = SaxionApp.readString();

        // Continue the loop until a blank line is entered
        while(!grocery.isBlank()) {
            // Remove the text that was just entered from the screen, such that we can redraw it with an
            // appropriate color.
            SaxionApp.removeLastPrint();
            // The ArrayList.remove method will return a boolean, indicating if the given object was actuall found
            // (and removed).
            if (selection.remove(grocery)) {
                SaxionApp.printLine(grocery, Color.green);
                score++;
            } else {
                SaxionApp.printLine(grocery, Color.red);
            }
            // Ask for a subsequent guess
            grocery = SaxionApp.readString();
        }

        SaxionApp.printLine("Your score: "+score);
        SaxionApp.print("You missed:");
        for (String missed : selection) {
            SaxionApp.print(" "+missed);
        }

        SaxionApp.saveImage("Exercise7/sample_output2.png");
    }

    public ArrayList<String> selectRandom(ArrayList<String> input, int nrOfElements) {
        // Create a new array where we'll put the selected elements in.
        ArrayList<String> output = new ArrayList<>();

        int counter = 0;
        while (counter < nrOfElements) {
            int position = SaxionApp.getRandomValueBetween(0, input.size());

            String selectedItem = input.get(position);
            SaxionApp.printLine(selectedItem);

            // If by some accident we "actually" selected an item that we already had selected we should try again
            if(!output.contains(selectedItem)) {
                output.add(selectedItem);
                counter++;                // Note that we are intentionally not incrementing the counter in case of a double.
            }

        }

        return output;
    }

}
