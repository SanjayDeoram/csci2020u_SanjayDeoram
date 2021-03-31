package sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;

public class DataSource {

    public static String url = "https://query1.finance.yahoo.com/v7/finance/download/GOOG?period1=1262322000&period2=1451538000&interval=1mo&events=history&includeAdjustedClose=true";

    public static void loadFile() {
        try {
            InputStream inputStream = new URL(url).openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            LineNumberReader numberReader = new LineNumberReader(inputStreamReader);

            int numLines = (int)numberReader.lines().count() + 1;

            Dataset[] datasets = new Dataset[numLines];

            String line;

            while((line = bufferedReader.readLine()) != null) {
                line = bufferedReader.readLine();
                String[] values = line.split(",");
                String date = values[0];
                int open = Integer.parseInt(values[0]);
                int high = Integer.parseInt(values[1]);
                int low = Integer.parseInt(values[2]);
                int close = Integer.parseInt(values[3]);
                int adjClose = Integer.parseInt(values[4]);
                int volume = Integer.parseInt(values[5]);

                Dataset dataset = new Dataset(date, open, high, low, close, adjClose, volume);

            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
