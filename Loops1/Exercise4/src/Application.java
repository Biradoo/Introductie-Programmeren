import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1000, 500);
    }

    public void run() {

        SaxionApp.print("What is the maximum value to count to? ");
        int maximumValue = SaxionApp.readInt();
        int counter = 1;
        while (counter <= maximumValue) {
            String lineToPrint = String.format(" %3d", counter);
            SaxionApp.print(lineToPrint);
            if (counter % 25 == 0) {
                SaxionApp.printLine();
            }
            counter++;
        }
    }
}
