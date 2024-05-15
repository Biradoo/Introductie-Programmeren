import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

/**
 * Given a CSV-file containing a row for each street light owned by the municipality of Enschede, draw a map
 * of their locations.
 * Among many other details about the lights, each row contains a latitude and longitude (GPS-coordinates). While
 * plotting these accurately would require some heavy math, on a small scale like a single city just using them
 * as y and x coordinates gives very recognizable results.
 */
public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 800, 800);
    }

    public void run() {
        // Open a CSV file, using the provided CSV reader.
        CsvReader reader = new CsvReader("Demo5/enschede-street-lights.csv");

        // Use comma's, not semi-columns
        reader.setSeparator(',');

        // Tell the CSV reader to skip the first row, which contains the headers
        reader.skipRow();

        // The file contains some streets lights that are quite far from Enschede. The city itself is around here:
        double minLat = 6.8;
        double maxLat = 6.95;

        double minLng = 52.15;
        double maxLng = 52.3;

        // Keep running the loop, reading one CSV row at a time. The loop stops when we run out of rows.
        while(reader.loadRow()) {
            // The first field in the CSV is the latitude, and the second is the longitude. Both are doubles.
            double lat = reader.getDouble(0);
            double lng = reader.getDouble(1);

            // The CSV file contains a lot more (freely available) data about each street light. For now, we're
            // not interested in that though.

            // Choose a color based on the height of the street lights (which is column 11). You'll see that higher
            // poles tend to be places along major roads.
            double height = reader.getDouble(11);

            // Determine the color of the dot based on the height.
            // For all heights <= 5 we'll use green, otherwise pink.
            if(height > 5) {
                SaxionApp.setBorderColor(SaxionApp.SAXION_PINK);
            } else {
                SaxionApp.setBorderColor(SaxionApp.SAXION_GREEN);
            }

            // Now, use the SaxionApp drawPoint method to plot each street lights. See if you can get it such that
            // it (sort of) matches a map of Enschede.
            double x = (lat - minLat) / (maxLat - minLat);
            double y = 1 - (lng - minLng) / (maxLng - minLng);

            SaxionApp.drawPoint((int)(x*800.0), (int)(y*800.0), 2);
        }
    }
}
