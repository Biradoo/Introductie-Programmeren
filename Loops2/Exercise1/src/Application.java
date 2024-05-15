import nl.saxion.app.SaxionApp;

import java.util.ArrayList;


public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        SaxionApp.printLine("Please enter some numbers. Close with 0 (zero): ");

        int counter = 1;
        SaxionApp.print("Value " + counter + ": ");
        int number = SaxionApp.readInt();
        listOfNumbers.add(number);

        while (number != 0) {
            SaxionApp.print("Value " + counter + ": ");
            counter++;
            number = SaxionApp.readInt();
            listOfNumbers.add(number);
        }
        listOfNumbers.remove(listOfNumbers.size() - 1);
        SaxionApp.printLine("Lets turn around your list:");
        turnAroundList(listOfNumbers);

    }

    public void turnAroundList(ArrayList<Integer> list) {
        int counter = 0;
        while (counter < list.size()) {
            int numberToPrint = list.remove(list.size() - 1);
            list.add(0,numberToPrint);
            SaxionApp.printLine(numberToPrint);
            counter++;
        }
    }
}
