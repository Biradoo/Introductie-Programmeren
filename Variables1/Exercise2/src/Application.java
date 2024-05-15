import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 480);
    }

    public void run() {
        // Define the table that you want to use here
        int table = 5;

        for (int i = 1; i <= 10; i++) {
            SaxionApp.printLine(i + " * " + table + " = " + (i * table));
            // Print the multiplication table

            // Your code goes here!
        }
    }

}
