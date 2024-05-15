import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        ArrayList<Integer> listOfNumbers = generateListOfNumbers(500);

        printNumbers(listOfNumbers);

        SaxionApp.saveImage("Exercise3/sample_output.png");
    }

    public void printNumbers(ArrayList<Integer> list) {
        int printCounter = 0;
        int counter = 0;

        while(counter < list.size()) {
            String formattedString = String.format("%3d", list.get(counter));

            SaxionApp.print(formattedString);

            printCounter++;

            if(printCounter == 25) {
                printCounter = 0;
                SaxionApp.printLine();
            }

            counter++;
        }

    }

    public ArrayList<Integer> generateListOfNumbers(int amount) {
        ArrayList<Integer> result = new ArrayList<>();

        int counter = 0;
        while(counter < amount) {
            int randomNumber = SaxionApp.getRandomValueBetween(0, 100);

            result.add(randomNumber);

            counter++;
        }

        return result;
    }
}
