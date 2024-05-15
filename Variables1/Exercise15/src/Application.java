import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 600, 200);
    }

    public void run() {

        int radius = 10;
        double pi = 3.14159;
        double circumference = (2 * pi) * radius;
        double area = pi * radius * radius;

        SaxionApp.printLine("The circumference of a circle with radius " + radius + " is " + circumference);
        SaxionApp.printLine("The area of a circle with radius " + radius + " is " + area);
    }
}