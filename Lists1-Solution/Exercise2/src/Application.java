import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<Integer> numbers = new ArrayList<>();

        int counter = 0;

        while(counter < 1000) {
            int randomNumber = SaxionApp.getRandomValueBetween(1, 1000);

            numbers.add(randomNumber);

            counter++;
        }

        SaxionApp.printLine("The average: "+ calculateAverage(numbers));
        SaxionApp.printLine("The highest value: " + findMax(numbers));
        SaxionApp.printLine("The lowest value: " + findMin(numbers));

        SaxionApp.saveImage("Exercise2/sample_output.png");
    }

    public double calculateAverage(ArrayList<Integer> numbers) {
        int counter = 0;
        double sum = 0;

        while(counter < numbers.size()) {
            sum += numbers.get(counter);
            counter++;
        }

        return sum / numbers.size();
    }

    public int findMax(ArrayList<Integer> numbers) {
        int highestValue = numbers.get(0); // Assume it's the first element.

        int counter = 0;
        while(counter < numbers.size()) {
            int currentNumber = numbers.get(counter);

            if(currentNumber > highestValue) { // If this list element has a higher value.. it becomes the new highest value
                highestValue = currentNumber;
            }

            counter++;
        }

        return highestValue;
    }

    public int findMin(ArrayList<Integer> numbers) {
        int lowestValue = numbers.get(0); // Assume it's the first element.

        int counter = 0;
        while(counter < numbers.size()) {
            int currentNumber = numbers.get(counter);

            if(currentNumber < lowestValue) { // If this list element has a higher value.. it becomes the new highest value
                lowestValue = currentNumber;
            }

            counter++;
        }

        return lowestValue;
    }
}
