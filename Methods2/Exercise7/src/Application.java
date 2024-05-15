import nl.saxion.app.SaxionApp;

import java.awt.Color;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        SaxionApp.print("Please enter X coordinate of the bottom-left corner of the house: ");
        int xCoordinate = SaxionApp.readInt();
        SaxionApp.print("Please enter Y coordinate of the bottom-left corner of the house: ");
        int yCoordinate = SaxionApp.readInt();
        SaxionApp.print("Please enter the width of the house (ex. roof): ");
        int width = SaxionApp.readInt();
        SaxionApp.print("Please enter the height of the house (ex. roof): ");
        int height = SaxionApp.readInt();

        SaxionApp.drawRectangle(xCoordinate, yCoordinate, width, height);
        SaxionApp.drawLine(xCoordinate, yCoordinate, ((xCoordinate + width / 2)), (yCoordinate - (height / 2)));
        SaxionApp.drawLine((xCoordinate + (width / 2)), (yCoordinate - (height / 2)), (xCoordinate + width), yCoordinate);


    }

}
