import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.print("Please enter your name: ");
        String name = SaxionApp.readString();
        SaxionApp.printLine("Hello, " + name);

    }

}
