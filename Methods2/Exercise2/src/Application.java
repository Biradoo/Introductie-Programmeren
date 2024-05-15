import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.printLine("Enter a first value: ");
        int firstValue = SaxionApp.readInt();

        SaxionApp.printLine("Enter a second value: ");
        int secondValue = SaxionApp.readInt();

        SaxionApp.printLine(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        SaxionApp.printLine(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        SaxionApp.printLine(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        SaxionApp.printLine(firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
        SaxionApp.printLine(firstValue + " % " + secondValue + " = " + (firstValue % secondValue));

    }

}
