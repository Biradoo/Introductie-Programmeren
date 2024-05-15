import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        ArrayList<Integer> listWithNumbers = new ArrayList<>();

        SaxionApp.printLine("Enter individual numbers, followed by a enter.");
        SaxionApp.printLine("Enter the value 0 to stop inserting numbers.");

        // first request for input
        int inputNumber = readIntFromUser();


        // add input to list
        // and ask for more input so long nr 0 is not given
        while (inputNumber != 0) {
            listWithNumbers.add(inputNumber);
            inputNumber = readIntFromUser();
        }

        SaxionApp.printLine();

//        SaxionApp.saveImage("Exercise4/sample_output1.png");

        // respons to the list that is inputted
        if (listWithNumbers.isEmpty()) {
            SaxionApp.printLine("The list is empty, you did not input any numbers!");
            SaxionApp.saveImage("Exercise4/sample_output3.png");

        } else {
            SaxionApp.printLine("You entered " + listWithNumbers.size() + " numbers.");
            SaxionApp.printLine();
            SaxionApp.printLine("The last number you inputted was " + listWithNumbers.get(listWithNumbers.size() - 1));
            SaxionApp.printLine();

            if (listWithNumbers.contains(8)) {
                SaxionApp.printLine("The list contains the number 8 on indexnumber " + listWithNumbers.indexOf(8));
            } else {
                SaxionApp.printLine("You did not enter the number 8.");
            }
            SaxionApp.printLine();

            int halfWay = listWithNumbers.size() / 2;
            SaxionApp.printLine("Halfway the list, you entered the number " + listWithNumbers.get(halfWay) + " at position " + halfWay);

            SaxionApp.saveImage("Exercise4/sample_output2.png");

        }

    }

    public int readIntFromUser() {
        SaxionApp.print("Enter a value: ");
        return SaxionApp.readInt();
    }
}
