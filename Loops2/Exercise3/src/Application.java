import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

/**
 * Couple names calculator. Enter a list of first names. The application will spit out the 'couple name' for each
 * combination of two of them, in both orders, by taking the first half of one name and appending the second half
 * of the other name to it.
 */
public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 800);
    }

    public void run() {
        ArrayList<String> names = new ArrayList<>();

        SaxionApp.printLine("Type first names for a few people.");
        SaxionApp.printLine("End with an empty line.");
        SaxionApp.printLine();

        String input = SaxionApp.readString();
        //names.add(input);
        while (!input.isEmpty()) {
            names.add(input);
            input = SaxionApp.readString();
        }

        for (String firstSelectedNames : names) {
            for (String secondSelectedNames : names) {
                if (!firstSelectedNames.equals(secondSelectedNames)) {
                    String combinedNames = firstSelectedNames.substring(0, firstSelectedNames.length() - 2) + secondSelectedNames.substring(secondSelectedNames.length() / 2);
                    SaxionApp.printLine(firstSelectedNames + " + " + secondSelectedNames + " = " + combinedNames);
                }
            }
        }
    }
}
