import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        SaxionApp.printLine("Enter individual numbers, followed by an enter.");
        SaxionApp.printLine("Enter the value 0 to stop inserting number");
        SaxionApp.print("Enter a value: ");
        int input = SaxionApp.readInt();
        listOfNumbers.add(input);

        if (input == 0) {
            SaxionApp.printLine("The list is empty, you did not input any numbers!");
        } else {
            while (input != 0) {
                SaxionApp.print("Enter a value: ");
                input = SaxionApp.readInt();
                listOfNumbers.add(input);
            }
            SaxionApp.printLine("You entered " + (listOfNumbers.size() - 1) + " numbers.");

            if (listOfNumbers.contains(8)) {
                SaxionApp.printLine("The list contains the number 8 on indexnumber " + listOfNumbers.indexOf(8));
            } else {
                SaxionApp.printLine("The list doesn't contain the number 8.");
            }
            int halfwayNumber = listOfNumbers.size() / 2;
            SaxionApp.printLine("Halfway the list, you entered the number " + listOfNumbers.get(halfwayNumber - 1) + " at position " + halfwayNumber);
        }
    }
}
