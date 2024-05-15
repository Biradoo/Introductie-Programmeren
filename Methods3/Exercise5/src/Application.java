import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 500);
    }

    public void run() {

        SaxionApp.printLine("Calculate your BMI!", Color.orange);
        SaxionApp.print("Please enter your length in metres: ");
        double length = SaxionApp.readDouble();
        SaxionApp.print("Please enter your weight in kilograms: ");
        double weight = SaxionApp.readDouble();
        calculateBMI(length,weight);

    }
    public void calculateBMI(double length, double weight) {
        double bmi = weight / (length*length);
        SaxionApp.printLine("Your BMI: " + bmi);

        if (bmi < 18.5) {
            SaxionApp.printLine("You are underweight!", Color.orange);
        } else if (bmi >= 30) {
            SaxionApp.printLine("You are overweight!", Color.orange);
        } else {
            SaxionApp.printLine("You have a healthy weight!", Color.green);
        }
    }

}
