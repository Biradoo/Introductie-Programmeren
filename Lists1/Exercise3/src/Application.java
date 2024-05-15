import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        ArrayList<Integer> listOfNumbers = generateListOfNumbers(500);
        int i = 1;

        while (i <= (listOfNumbers.size()-1)) {
            String lineToPrint = String.format("%3d", listOfNumbers.get(i));
            SaxionApp.print(lineToPrint);
            if (i % 25 == 0) {
                SaxionApp.printLine();
            }
            i++;
        }
    }

    public ArrayList<Integer> generateListOfNumbers(int amount) {
        ArrayList<Integer> result = new ArrayList<>();

        int counter = 0;
        while (counter <= amount) {
            int randomNumber = SaxionApp.getRandomValueBetween(0, 100);

            result.add(randomNumber);

            counter++;
        }

        return result;
    }
}
