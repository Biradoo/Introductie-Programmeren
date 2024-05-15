import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    // Size of each cell
    static final int size = 30;

    public static void main(String[] args) {
        SaxionApp.start(new Application(), size*12, size*16);
    }

    public void run() {
        // Colors in the image
        Color backgroundColor = SaxionApp.createColor(255, 255, 255);
        Color eyes = SaxionApp.createColor(0, 0, 0);

        Color hatColor = SaxionApp.createColor(255, 0, 0);

        Color faceColor = SaxionApp.createColor(234, 162, 63);
        Color hairColor = SaxionApp.createColor(95, 36, 12);
        Color blue = SaxionApp.createColor(10, 66, 130);
        Color yellow = SaxionApp.createColor(247, 255, 0);

        SaxionApp.turnBorderOff();

        // Draw background
        SaxionApp.setFill(backgroundColor);
        SaxionApp.drawRectangle(0, 0, 12*size, 16*size);

        // Draw hat
        SaxionApp.setFill(hatColor);
        SaxionApp.drawRectangle(3*size, 0, 5*size, size);
        SaxionApp.drawRectangle(2*size, size, 9*size, size);

        SaxionApp.pause();

        // Draw face
        SaxionApp.setFill(faceColor);
        SaxionApp.drawRectangle(2*size, 2*size, 7*size, 4*size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(9*size, 3*size, 2*size, 2*size);
        SaxionApp.drawRectangle(3*size, 6*size, 7*size, size);
        SaxionApp.drawRectangle(11*size, 4*size, size, size);

        SaxionApp.pause();

        // Draw eyes
        SaxionApp.setFill(eyes);
        SaxionApp.drawRectangle(7*size, 2*size, size, 2*size);

        SaxionApp.pause();

        // Draw hair
        SaxionApp.setFill(hairColor);
        SaxionApp.drawRectangle(7*size, 5*size, 4*size, size);
        SaxionApp.drawRectangle(8*size, 4*size, size, size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(2*size, 2*size, 3*size, size);
        SaxionApp.drawRectangle(size, 3*size, size, 3*size);
        SaxionApp.drawRectangle(3*size, 2*size, size, 3*size);
        SaxionApp.drawRectangle(size, 5*size, 2*size, size);
        SaxionApp.drawRectangle(3*size, 4*size, 2*size, size);

        SaxionApp.pause();

        // Draw hands (roughly)
        SaxionApp.setFill(faceColor);
        SaxionApp.drawRectangle(0, 10*size,3*size, 3*size);
        SaxionApp.drawRectangle(9*size, 10*size,3*size, 3*size);

        SaxionApp.pause();

        // Draw the dungarees (roughly)
        SaxionApp.setFill(blue);
        SaxionApp.drawRectangle(2*size, 7*size,8*size, 7*size);

        SaxionApp.pause();

        // Draw buckles
        SaxionApp.setFill(yellow);
        SaxionApp.drawRectangle(4*size, 10*size, size, size);
        SaxionApp.drawRectangle(7*size, 10*size, size, size);

        SaxionApp.pause();

        // Draw shirt
        SaxionApp.setFill(hatColor);
        SaxionApp.drawRectangle(2*size, 7*size, 2*size, size);
        SaxionApp.drawRectangle(5*size, 7*size, 2*size, size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(size, 8*size, 3*size, size);
        SaxionApp.drawRectangle(5*size, 8*size, 2*size, size);
        SaxionApp.drawRectangle(8*size, 8*size, 3*size, size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(0, 9*size, 4*size, size);
        SaxionApp.drawRectangle(8*size, 9*size, 4*size, size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(2*size, 10*size, size, size);
        SaxionApp.drawRectangle(9*size, 10*size, size, size);

        SaxionApp.pause();

        // Draw shoes
        SaxionApp.setFill(hairColor);
        SaxionApp.drawRectangle(0, 14*size, 4*size, 2*size);
        SaxionApp.drawRectangle(8*size, 14*size, 4*size, 2*size);

        SaxionApp.pause();

        // Add missing pixels for hands
        SaxionApp.setFill(faceColor);
        SaxionApp.drawRectangle(2*size, 11*size,size, size);
        SaxionApp.drawRectangle(9*size, 11*size,size, size);

        SaxionApp.pause();

        // Remove small parts
        SaxionApp.setFill(backgroundColor);
        SaxionApp.drawRectangle(8*size, 7*size, 2*size, size);
        SaxionApp.drawRectangle(5*size, 13*size, 2*size, size);

        SaxionApp.pause();

        SaxionApp.drawRectangle(0, 14*size, size, size);
        SaxionApp.drawRectangle(11*size, 14*size, size, size);
    }

}
