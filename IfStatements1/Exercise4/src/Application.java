import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.print("What day is it? ");
        String day = SaxionApp.readString();

        if (day.equals("Monday")) {
            SaxionApp.printLine("Aarrghh", Color.red);
        } else if (day.equals("Tuesday")) {
            SaxionApp.printLine("Still so long mate..", Color.red);
        } else if (day.equals("Wednesday")) {
            SaxionApp.printLine("Almost half way, I think..", Color.orange);
        } else if (day.equals("Thursday")) {
            SaxionApp.printLine("Almost there!", Color.orange);
        } else if (day.equals("Friday")) {
            SaxionApp.printLine("Weekend is here babyyyyy!!", Color.green);
        } else if (day.equals("Saturday")) {
            SaxionApp.printLine("It's time to partyyy!!", Color.green);
        } else if (day.equals("Sunday")) {
            SaxionApp.printLine("Hangover/relax day", Color.green);
        } else {
            SaxionApp.printLine("That day does not exist!", Color.red);
        }

    }

}


