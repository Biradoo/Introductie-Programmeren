import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        drawTriangle(100,50);
        drawTriangle(300,500);
        drawTriangle(200,400);
        drawTriangle(100,500);
        drawTriangle(600,300);
        drawTriangle(400,400);
        drawTriangle(700,200);
        drawTriangle(900,100);
        drawTriangle(600,200);

    }
    public void drawTriangle(int x, int y) {
        int width = 200;
        int height = 200;

        SaxionApp.drawLine(x, (y+height), (x+width/2), y);
        SaxionApp.drawLine((x+width/2), y, (x+width), (y+height));
        SaxionApp.drawLine((x+width), (y+height), x, (y+height));

    }

}
