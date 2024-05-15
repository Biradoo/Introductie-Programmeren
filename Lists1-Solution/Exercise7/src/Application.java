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

        ArrayList<Integer> ages = new ArrayList<>();

        while(fileReader.loadRow()) {
            int valueFromLine = fileReader.getInt(0); // Get the first and only int value on the line

            // TODO: Add this value to your list!
            ages.add(valueFromLine);
        }

        // TODO: Print out some statistics
        SaxionApp.print("Read a total of ");
        SaxionApp.print(ages.size(), Color.RED);
        SaxionApp.printLine(" values!");
        SaxionApp.printLine("The average age of Saxion students is: "+ calculateAverage((ages)));

        SaxionApp.saveImage("Exercise7/sample_output.png");
    }

    public double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;

        int counter = 0;

        while(counter < numbers.size()) {
            sum += numbers.get(counter);
            counter++;
        }

        return sum / numbers.size();
    }

}
