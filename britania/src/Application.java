import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 800, 768);
    }

    public void run() {
        ArrayList<Passenger> passengers = new ArrayList<>();

        int input = -1;

        while (input != 0) {
            SaxionApp.clear();
            SaxionApp.printLine("Welcome to the Britania's passenger list!");
            SaxionApp.printLine("-----------------------------------------");
            SaxionApp.printLine("Number of passengers: " + passengers.size());
            menu();

            input = SaxionApp.readInt();
            if (input == 1) {
                readPassenger(passengers);
                SaxionApp.printLine(passengers.size());
            } else if (input == 2) {
                SaxionApp.printLine("This is an overview of all the passengers");
                showAllPassengers(passengers);
            } else if (input == 3) {
                addPassenger(passengers);
            } else if (input == 4) {
                showStatistics(passengers);

            } else if (input == 0) {

            }
        }
    }

    private void showStatistics(ArrayList<Passenger> passengers) {
        SaxionApp.clear();
        SaxionApp.turnBorderOff();
        SaxionApp.setFill(SaxionApp.SAXION_GREEN);
        SaxionApp.drawBorderedText("The passenger list", 0, 0, 32);

        int classOne = 0;
        int classTwo = 0;
        int classThree = 0;
        double totalWeight = 0;


        Passenger oldestPerson = passengers.get(0);
        for (Passenger passenger : passengers) {
            totalWeight = totalWeight + passenger.gewicht;
            if (passenger.leeftijd > oldestPerson.leeftijd) {
                oldestPerson = passenger;
            }
            if (passenger.klasse == 1) {
                classOne++;
            } else if (passenger.klasse == 2) {
                classTwo++;
            } else if (passenger.klasse == 3) {
                classThree++;
            }
        }
        SaxionApp.drawBorderedText("The oldest passenger is " + oldestPerson.naam, 0, 40, 20);

        String formattedTotalWeight = String.format("%.1f", totalWeight);
        SaxionApp.drawBorderedText("The total weight of all the passengers is " + formattedTotalWeight, 0, 60, 20);

        SaxionApp.drawBorderedText("Percentage of passengers per class", 0, 90, 20);
        SaxionApp.drawBorderedText("Class 1", 0, 120, 15);
        SaxionApp.drawBorderedText("Class 2", 0, 150, 15);
        SaxionApp.drawBorderedText("Class 3", 0, 180, 15);

        SaxionApp.setFill(Color.darkGray);
        SaxionApp.drawRectangle(200, 120, 500, 20);
        SaxionApp.drawRectangle(200, 150, 500, 20);
        SaxionApp.drawRectangle(200, 180, 500, 20);

        SaxionApp.setFill(Color.orange);
        SaxionApp.drawRectangle(200, 120, (classOne / passengers.size() * 500), 20);
        SaxionApp.drawRectangle(200, 150, (classTwo / passengers.size() * 500), 20);
        SaxionApp.drawRectangle(200, 180, (classThree / passengers.size() * 500), 20);

        SaxionApp.pause();
    }

    private void addPassenger(ArrayList<Passenger> passengers) {
        Passenger passenger = new Passenger();
        boolean validInput = false;

        while (!validInput) {
            SaxionApp.printLine("What is the name of the passenger?");
            passenger.naam = SaxionApp.readString();
            if (passenger.naam.isEmpty()) {
                SaxionApp.printLine("Incorrect format for name", Color.red);
            } else {
                validInput = true;
            }
        }
        validInput = false;

        while (!validInput) {
            SaxionApp.printLine("What is the sex of the passenger (M, F, N)?");
            passenger.geslacht = SaxionApp.readString();
            if (passenger.geslacht.equals("M") || passenger.geslacht.equals("F") || passenger.geslacht.equals("N")) {
                validInput = true;
            } else {
                SaxionApp.printLine("Incorrect format for sex", Color.red);
            }
        }
        validInput = false;

        while (!validInput) {
            SaxionApp.printLine("What is the class of the passenger? (1, 2 or 3)");
            passenger.klasse = SaxionApp.readInt();
            if (passenger.klasse == 1 || passenger.klasse == 2 || passenger.klasse == 3) {
                validInput = true;
            } else {
                SaxionApp.printLine("Incorrect format for class", Color.red);
            }
        }
        validInput = false;

        while (!validInput) {
            SaxionApp.printLine("What is the age of the passenger? (between 0 and 110)");
            passenger.leeftijd = SaxionApp.readInt();
            if (passenger.leeftijd > 0 && passenger.leeftijd <= 110) {
                validInput = true;
            } else {
                SaxionApp.printLine("Incorrect format for age", Color.red);
            }
        }
        validInput = false;

        while (!validInput) {
            SaxionApp.printLine("How heavy is the passenger? (between 40.0 to 120.0)");
            passenger.gewicht = SaxionApp.readDouble();
            if (passenger.gewicht > 40.0 && passenger.gewicht <= 120.0) {
                validInput = true;
            }
        }
        passengers.add(passenger);
        SaxionApp.printLine("Person is succesfully added. Press a key to continue");
        SaxionApp.pause();
    }

    private void showAllPassengers(ArrayList<Passenger> passengers) {
        for (Passenger passenger : passengers) {
            SaxionApp.print(passenger.naam + "(" + passenger.geslacht + ") age: " + passenger.leeftijd + " weight: " + passenger.gewicht);
            SaxionApp.printLine(" travels in class: " + passenger.klasse);
        }
        SaxionApp.pause();
    }

    private void readPassenger(ArrayList<Passenger> passengers) {
        CsvReader reader = new CsvReader("passengers.csv");
        reader.skipRow();
        reader.setSeparator(',');
        while (reader.loadRow()) {
            Passenger passenger = new Passenger();
            passenger.naam = reader.getString(0);
            passenger.geslacht = reader.getString(1);
            passenger.klasse = reader.getInt(2);
            passenger.leeftijd = reader.getInt(4);
            passenger.gewicht = reader.getDouble(3);

            passengers.add(passenger);
        }
    }

    private void menu() {
        SaxionApp.printLine("1. Read from passengers.csv");
        SaxionApp.printLine("2. Show all passengers");
        SaxionApp.printLine("3. Add a passenger");
        SaxionApp.printLine("4. Show statistics");
        SaxionApp.printLine("0. Exit");
    }
}







