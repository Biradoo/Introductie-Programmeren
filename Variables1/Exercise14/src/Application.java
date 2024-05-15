import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 400, 200);
    }

    public void run() {

        int firstNumber = 3;
        int secondNumber = 9;
        double answer = (double)firstNumber / secondNumber;

        SaxionApp.printLine("The percentage " + firstNumber + " of " + secondNumber + " is " + answer);
    }
}