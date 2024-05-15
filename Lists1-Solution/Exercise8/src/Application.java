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
        fileReader.skipRow(); // We need to skip the header.

        int classOnePassengers = 0;
        int classOnePassengersSurvived = 0;
        int classTwoPassengers = 0;
        int classTwoPassengersSurvived = 0;
        int classThreePassengers = 0;
        int classThreePassengersSurvived = 0;

        while(fileReader.loadRow()) {
            int passengerClass = fileReader.getInt(2);

            boolean survived = fileReader.getInt(1) == 1; // 0 = no (false), 1 = yes (true).

            // Obviously you can do this with if-else, but this is a very good example of when you can use a switch statement!
            switch(passengerClass) {
                case 1:
                    classOnePassengers++;
                    if(survived) {
                        classOnePassengersSurvived++;
                    }
                    break;
                case 2:
                    classTwoPassengers++;
                    if(survived) {
                        classTwoPassengersSurvived++;
                    }
                    break;
                case 3:
                    classThreePassengers++;
                    if(survived) {
                        classThreePassengersSurvived++;
                    }
                    break;
            }
        }

        SaxionApp.printLine("Analysis of the Titanic dataset...");
        SaxionApp.printLine();

        SaxionApp.printLine("Class One", Color.ORANGE);
        printStatistics(classOnePassengers, classOnePassengersSurvived);
        SaxionApp.printLine();

        SaxionApp.printLine("Class Two", Color.ORANGE);
        printStatistics(classTwoPassengers, classTwoPassengersSurvived);
        SaxionApp.printLine();

        SaxionApp.printLine("Class Three", Color.ORANGE);
        printStatistics(classThreePassengers, classThreePassengersSurvived);

        SaxionApp.saveImage("Exercise8/sample_output.png");
    }

    public void printStatistics(int nrOfPassengers, int nrOfSurvivors) {
        SaxionApp.print("Number of passengers: ");
        SaxionApp.printLine(nrOfPassengers, Color.YELLOW);

        SaxionApp.print("Number of survivors: ");
        SaxionApp.printLine(nrOfSurvivors, Color.YELLOW);

        SaxionApp.print("Survival rate: ");
        SaxionApp.print((nrOfSurvivors / (double) nrOfPassengers) * 100, Color.RED);
        SaxionApp.printLine(" %");
    }


}
