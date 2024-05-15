import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 350, 350);
    }

    public void run() {
        // 2 horizontal lines
        SaxionApp.drawLine(50,125,275,125);
        SaxionApp.drawLine(50,200,275,200);
        // 2 vertical lines
        SaxionApp.drawLine(125,50,125,275);
        SaxionApp.drawLine(200,50,200,275);
        // [Optional] Remove the border from the texts
        SaxionApp.setBorderSize(0);
        // 3 marks, crosses and noughts, on locations 1,5 and 9.
        SaxionApp.drawBorderedText("X",70,70,50);
        SaxionApp.drawBorderedText("X",220,220,50);
        SaxionApp.drawBorderedText("O",140,140,50);


        SaxionApp.saveImage("Exercise6/sample_output.png");
    }

}
