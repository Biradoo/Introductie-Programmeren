import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Amount due (in cents): ");
        int amountDue = SaxionApp.readInt();

        SaxionApp.print("Amount paid (in cents): ");
        int amountPaid = SaxionApp.readInt();

        int change = amountPaid - amountDue;
        SaxionApp.printLine("Change: " + change + " euro cents");

        SaxionApp.printLine(" 100 euro: " + (change / 10000));
        change = change % 10000;
        SaxionApp.printLine(" 50 euro: " + (change / 5000));
        change = change % 5000;
        SaxionApp.printLine(" 20 euro: " + (change / 2000));
        change = change % 2000;
        SaxionApp.printLine(" 10 euro: " + (change / 1000));
        change = change % 1000;
        SaxionApp.printLine(" 5 euro: " + (change / 500));
        change = change % 500;
        SaxionApp.printLine(" 2 euro: " + (change / 200));
        change = change % 200;
        SaxionApp.printLine(" 1 euro: " + (change / 100));
        change = change % 100;
        SaxionApp.printLine(" 50 cent: " + (change / 50));
        change = change % 50;
        SaxionApp.printLine(" 20 cent: " + (change / 20));
        change = change % 20;
        SaxionApp.printLine(" 10 cent: " + (change / 10));
        change = change % 10;
        SaxionApp.printLine(" 5 cent: " + (change / 5));

    }

}
