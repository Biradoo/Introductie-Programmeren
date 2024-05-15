import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 400, 300);
    }

    public void run() {

        double firstNumber = 20.0;
        double secondNumber = 15.0;

        SaxionApp.printLine("The value of the first variable: " + firstNumber);
        SaxionApp.printLine("The value of the second variable: " + secondNumber);

        SaxionApp.printLine("");

        SaxionApp.printLine("Multiply " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        SaxionApp.printLine("Subtract " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        SaxionApp.printLine("Divide " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        SaxionApp.printLine("Remainder " + firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
    }
}