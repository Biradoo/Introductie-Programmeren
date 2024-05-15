import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 800, 600);
    }

    public void run() {
        String name = "Bersan"; // Please insert your name here.

        // Page one
        SaxionApp.printLine("Hello "+ name + "!");
        SaxionApp.printLine();
        SaxionApp.printLine("I'm the SaxionApp framework. Welcome to this course!");
        SaxionApp.printLine("In the next few steps.. I will introduce some of my functions!");
        SaxionApp.printLine();
        SaxionApp.printLine("Did you know I actually was created to be drawing app?");
        SaxionApp.printLine();

        SaxionApp.pause();

        SaxionApp.printLine("I can draw things like lines, rectangles, circles and even images!");
        SaxionApp.printLine("You will learn more about this soon enough.");
        SaxionApp.drawCircle(300, 450, 100);
        SaxionApp.printLine("Yes, you change colors.. but we won't right now!");
        SaxionApp.printLine();

        SaxionApp.pause();
        SaxionApp.printLine("Positioning is tricky sometimes, therefore we have something to help you out!");
        SaxionApp.print("Press ");
        SaxionApp.print(" CTRL+G ", Color.ORANGE);
        SaxionApp.printLine(" to enable (and disable) the grid. Go for it!");
        SaxionApp.printLine("The grid is 50x50 pixels and starts in the upper-left-corner.");
        SaxionApp.printLine("Can you figure out the coordinates of the center of the circle?");

        SaxionApp.printLine();

        SaxionApp.pause();

        SaxionApp.clear();
        SaxionApp.printLine("You will learn more about drawing figures when you do the exercises...");
        SaxionApp.printLine("For now, I have cleared the screen because it became cluttered.");
        SaxionApp.print("You can do this in your code using the ");
        SaxionApp.print(" clear ", Color.ORANGE);
        SaxionApp.printLine(" method.");
        SaxionApp.printLine("<--- I could also have grown larger to make more space! ---->");

        SaxionApp.pause();

        SaxionApp.resize(1280, 1024);

        SaxionApp.pause();

        SaxionApp.printLine("Or shrink if need be!");

        SaxionApp.pause();

        SaxionApp.resize(320, 240);

        SaxionApp.pause();

        SaxionApp.resize(800,600);
        SaxionApp.printLine("");

        SaxionApp.clear();
        SaxionApp.printLine("Aaah.. much better! I will leave my other functions for you to discover.");
        SaxionApp.printLine("It's time to say goodbye.. Thanks for listening to me for now!");
        SaxionApp.printLine("And obviously good luck with your studies here at HBO-ICT, "+name + "!");

        SaxionApp.pause();
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine("Oh btw... If you are wondereing where <INSERT_NAME> comes from?");
        SaxionApp.printLine("Have a look at line 12 of the code. And change it to your name!");
        SaxionApp.printLine("Bye now!");
    }

}
