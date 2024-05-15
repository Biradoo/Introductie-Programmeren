import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        SaxionApp.printLine("Hi again");
        SaxionApp.printLine();
        SaxionApp.printLine("We are now going to have a look at these MD-files");
        SaxionApp.printLine("that you have been reading");
        SaxionApp.printLine();
        SaxionApp.printLine("As stated in the wikipedia: Markdown is");
        SaxionApp.printLine("a lightweight markup language with plain-text-formatting syntax.");
        SaxionApp.printLine("Often used by software developers to add instructions or ");
        SaxionApp.printLine("extra information about an application for fellow-engineers.");

        SaxionApp.pause();

        SaxionApp.printLine();
        SaxionApp.printLine("Have a look at the MD-file with this demo.");
        SaxionApp.printLine("By looking at the code, you can probably find out ");
        SaxionApp.printLine("how to make these nice headings.");

        SaxionApp.pause();

        SaxionApp.printLine();
        SaxionApp.printLine("Now you can add something yourself.");
        SaxionApp.printLine("To see another nice formatting option");
        SaxionApp.printLine("Type 3 back quotes ``` and some text");
        SaxionApp.printLine("and again 3 back quotes ```");
        SaxionApp.pause();
        SaxionApp.printLine("This style is used to add code fragments to the text.");
    }

}
