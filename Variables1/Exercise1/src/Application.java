import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 300, 200);
    }

    public void run() {
        String voorNaam = "Bersan";
        String achterNaam = "Yonca";

        SaxionApp.printLine("Hi " + voorNaam + " " + achterNaam);
        SaxionApp.printLine("Welcome to Saxion!");
    }

}
