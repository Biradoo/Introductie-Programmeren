import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

/**
 * Couple names calculator. Enter a list of first names. The application will spit out the 'couple name' for each
 * combination of two of them, in both orders, by taking the first half of one name and appending the second half
 * of the other name to it.
 *
 */
public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 800);
    }

    public void run() {
        SaxionApp.printLine("Type first names for a few");
        SaxionApp.printLine("people. End with an empty line.");
        SaxionApp.printLine();

        ArrayList<String> names = new ArrayList<>();
        String input = SaxionApp.readString();

        while(!input.isBlank()) {
            names.add(input);
            input = SaxionApp.readString();
        }

        // We'll create a loop within a loop, iterating all combinations.
        for(String firstSelectedName : names) {
            for(String secondSelectedName : names) {
                // Skip a combination when a and b are the same; this would work, but does nothing interesting.
                if (!firstSelectedName.equals(secondSelectedName)) {
                    // Compose the combined name, by taking the first half of a and the second half of b.
                    String resultingName = firstSelectedName.substring(0, firstSelectedName.length() / 2) + secondSelectedName.substring(secondSelectedName.length() / 2);
                    SaxionApp.printLine(firstSelectedName + " + " + secondSelectedName + " = " + resultingName);
                }
            }
        }

        SaxionApp.saveImage("Exercise3/sample_output.png");
    }
}
