import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 400, 100);
    }

    public void run() {
        String naam = "Bersan";

        SaxionApp.printLine("Hello " + naam);
    }

}
