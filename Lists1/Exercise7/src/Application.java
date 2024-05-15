import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        CsvReader fileReader = new CsvReader("Exercise7/ages.csv");
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        // TODO: Add list for the numbers..


        while (fileReader.loadRow()) {
            int valueFromLine = fileReader.getInt(0); // Get the first and only int value on the line
            listOfNumbers.add(valueFromLine);
        }
        int sum = 0;

        for (int numberToAdd : listOfNumbers) {
            sum = sum + numberToAdd;
        }
        SaxionApp.printLine("Read a total of " + listOfNumbers.size() + " values!");
        SaxionApp.printLine("The average age of Saxion students is: " + ((double)sum / listOfNumbers.size()));
    }
}
