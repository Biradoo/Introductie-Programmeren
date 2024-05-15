import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 300, 300);
    }

    public void run() {

        SaxionApp.printLine("   +   ");
        SaxionApp.printLine("  + + ");
        SaxionApp.printLine(" +   + ");
        SaxionApp.printLine("+-----+");
        SaxionApp.printLine("|  _  |");
        SaxionApp.printLine("| | | |");
        SaxionApp.printLine("| | | |");
        SaxionApp.printLine("+_+_+_|");

    }

}
