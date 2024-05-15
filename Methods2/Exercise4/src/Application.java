import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        int diceNumber = SaxionApp.getRandomValueBetween(1, 7);
        SaxionApp.print("The dice shows: " + diceNumber);

    }

}
