import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        int amountOfNumbers = 1000000;
        int i = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (i < amountOfNumbers) {
            int randomNumber = SaxionApp.getRandomValueBetween(1, 1000001);
            numbers.add(randomNumber);
            i++;
        }

        calculateAverage(numbers);
        findMax(numbers);
        findMin(numbers);


    }

    public void findMin(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        SaxionApp.printLine("The smallest number: " + min);
    }

    public void calculateAverage(ArrayList<Integer> numbers) {
        int i = 0;
        double numberToAdd = 0;
        while (i < numbers.size()) {
            numberToAdd = numberToAdd + numbers.get(i);
            i++;
        }
        double average = numberToAdd / numbers.size();
        SaxionApp.printLine("The average: " + average);

    }

    public void findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);

            }
        }
        SaxionApp.printLine("The highest number: " + max);
    }

}
