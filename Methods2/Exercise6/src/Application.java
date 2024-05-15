import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 640, 200);
    }

    public void run() {

        SaxionApp.print("Please enter a value for the amount of red: ");
        int red = SaxionApp.readInt();
        SaxionApp.print("Please enter a value for the amount of green: ");
        int green = SaxionApp.readInt();
        SaxionApp.print("Please enter a value for the amount of blue: ");
        int blue = SaxionApp.readInt();

        SaxionApp.print("The hexadecimal code of the color is: " + convertRGBToHex(red, green, blue));
        Color backGroundColor = SaxionApp.createColor(red, green, blue);
        SaxionApp.setBackgroundColor(backGroundColor);

    }
    public String convertRGBToHex(int red, int green, int blue) {
        return String.format("#%02x%02x%02x", red, green, blue);
    }

}
