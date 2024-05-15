import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.print("Enter the height of the fridge in centimeters: ");
        int height = SaxionApp.readInt();
        SaxionApp.print("Enter the year of manufacture of the fridge: ");
        int year = SaxionApp.readInt();
        SaxionApp.printLine("Does the fridge contain greenhouse gases? [y/n]");
        char yesOrNo = SaxionApp.readChar();

        if ((height > 150 && year <= 2010) || yesOrNo == 'y') {
            SaxionApp.printLine("Please replace this fridge!", Color.RED);
        } else {
            SaxionApp.printLine("Still good! Please check again next year.", Color.green);
        }
    }

}