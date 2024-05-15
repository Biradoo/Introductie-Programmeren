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
        // We'll give you this code this time..
        ArrayList<String> groceries = new ArrayList<>();
        CsvReader reader = new CsvReader("Exercise7/groceries.csv");

        while (reader.loadRow()) {
            String grocery = reader.getString(0);
            groceries.add(grocery);
        }



    }

}
