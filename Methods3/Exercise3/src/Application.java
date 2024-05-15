import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        drawTriangle(100,100,100);
        drawTriangle(200,200,200);
        drawTriangle(300,300,300);
        drawTriangle(400,400,400);
        drawTriangle(500,500,100);
        drawTriangle(100,100,100);
        drawTriangle(100,100,100);

    }
    public void drawTriangle(int x, int y, int size) {

        SaxionApp.drawLine(x, (y+size), (x+size/2), y);
        SaxionApp.drawLine((x+size/2), y, (x+size), (y+size));
        SaxionApp.drawLine((x+size), (y+size), x, (y+size));

    }

}
