import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Define variables m and n
        int m = 18;
        int n = 17;

        int first = n / 10 + n % 20;
        int second = n % 2 + m % 20;
        int third = (m + n) / 2;
        double fourth = (m + n) / 2.0;

        SaxionApp.printLine(first);
        SaxionApp.printLine(second);
        SaxionApp.printLine(third);
        SaxionApp.printLine(fourth);

        // Print the different values - Remember to do this in your head / on paper first!

    }

}
