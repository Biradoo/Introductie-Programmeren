import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        CsvReader fileReader = new CsvReader("Exercise8/titanic-survivors.csv");
        fileReader.setSeparator(','); // This file uses a comma to separate values.
        fileReader.skipRow(); // We need to skip the header because it contains no data, just labels.

        int firstClassPassengers = 0;
        int firstClassSurvivor = 0;
        int secondClassPassengers = 0;
        int secondClassSurvivor = 0;
        int thirdClassPassengers = 0;
        int thirdClassSurvivor = 0;

        while (fileReader.loadRow()) {
            if (fileReader.getInt(2) == 1) {
                firstClassPassengers++;
                if (fileReader.getInt(1) == 1) {
                    firstClassSurvivor++;
                }
            } else if (fileReader.getInt(2) == 2) {
                secondClassPassengers++;
                if (fileReader.getInt(1) == 1) {
                    secondClassSurvivor++;
                }
            } else {
                thirdClassPassengers++;
                if (fileReader.getInt(1) == 1) {
                    thirdClassSurvivor++;
                }
            }
        }


        SaxionApp.printLine("Analysis of the Titanic dataset...");
        SaxionApp.printLine();

        SaxionApp.printLine("Class One", Color.orange);
        SaxionApp.printLine("Number of passengers: " + firstClassPassengers);
        SaxionApp.printLine("Number of survivors: " + firstClassSurvivor);
        SaxionApp.printLine("Survival rate: " + ((double)firstClassSurvivor/firstClassPassengers) * 100 + " %");
        SaxionApp.printLine();

        SaxionApp.printLine("Class Two", Color.orange);
        SaxionApp.printLine("Number of passengers: " + secondClassPassengers);
        SaxionApp.printLine("Number of survivors: " + secondClassSurvivor);
        SaxionApp.printLine("Survival rate: " + ((double)secondClassSurvivor/secondClassPassengers) * 100 + " %");
        SaxionApp.printLine();

        SaxionApp.printLine("Class Three", Color.orange);
        SaxionApp.printLine("Number of passengers: " + thirdClassPassengers);
        SaxionApp.printLine("Number of survivors: " + thirdClassSurvivor);
        SaxionApp.printLine("Survival rate: " + ((double)thirdClassSurvivor/thirdClassPassengers) * 100 + " %");

    }
}

