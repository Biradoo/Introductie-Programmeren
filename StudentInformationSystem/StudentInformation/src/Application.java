import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {

    ArrayList<School> schools;

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        schools = readFile("students.csv");

        int input = -1;

        while (input != 0) {
            SaxionApp.clear();
            menu();
            input = SaxionApp.readInt();

            if (input == 1) {
                ArrayList<String> schoolNames = getSchoolNames();
                for (String name : schoolNames) {
                    SaxionApp.printLine("- " + name);
                }
                SaxionApp.pause();

            } else if (input == 2) {
                totalNumberOfStudentsPerCityPerYear();

            } else if (input == 3) {

            } else if (input == 0) {

            }

        }
    }

    private void totalNumberOfStudentsPerCityPerYear() {
        int totalStudents = 0;
        int year = 0;
        String city = "";
        while (year < 4 || year  > 6) {
            SaxionApp.printLine("Which year (4, 5 or 6) ?");
            year = SaxionApp.readInt();
            for (School s : schools) {
                if (year == 4) {
                    if (s.city.equals(city)) {
                        totalStudents = s.year4Male + s.year4Female;
                        SaxionApp.printLine("In " + city + " there are " + totalStudents);
                    }
                } else if (year == 5) {
                    if (s.city.equals(city)) {
                        totalStudents = s.year4Male + s.year4Female;
                        SaxionApp.printLine("In " + city + " there are " + totalStudents);
                    }
                } else if (year == 6) {
                    if (s.city.equals(city)) {
                        totalStudents = s.year4Male + s.year4Female;
                        SaxionApp.printLine("In " + city + " there are " + totalStudents);
                    }
                }

            }
        }

    }

    private ArrayList<String> getSchoolNames() {
        ArrayList<String> schoolNames = new ArrayList<>();
        for (School s : schools) {
            if (!schoolNames.contains(s.schoolName)) {
                schoolNames.add((s.schoolName));
            }
        }
        return schoolNames;
    }

    private ArrayList<School> readFile(String file) {
        CsvReader reader = new CsvReader(file);
        reader.skipRow();

        ArrayList<School> schools = new ArrayList<>();

        while (reader.loadRow()) {
            School s = new School();
            s.schoolName = reader.getString(0);
            s.city = reader.getString(1);
            s.type = reader.getString(2);
            s.direction = reader.getString(3);
            s.year4Male = reader.getInt(4);
            s.year4Female = reader.getInt(5);
            s.year5Male = reader.getInt(6);
            s.year5Female = reader.getInt(7);
            s.year6Male = reader.getInt(8);
            s.year6Female = reader.getInt(9);
            schools.add(s);
        }
        return schools;
    }

    private void menu() {
        SaxionApp.printLine("Welcome to the Enschede, Deventer and Apeldoorn schoolsystem!");
        SaxionApp.printLine("-------------------------------------------------------------");
        SaxionApp.printLine("1. Print all schoolnames");
        SaxionApp.printLine("2. Get total number of students per year");
        SaxionApp.printLine("3. Draw student overview chart");
        SaxionApp.printLine("0. Exit");
    }
}






