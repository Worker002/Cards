package cz.android.cards;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dominikmach on 06/11/2017.
 *
 * Simple class for reading values from csv file.
 */

public class CSVReader {

    private static final String CSVFILE = "Power.csv";
    BufferedReader br = null;
    private String line = "";
    private static final String CSVSPLITBY = ";";

    public String readCSV() {
        try {

            br = new BufferedReader(new FileReader(CSVFILE));
            while ((line = br.readLine()) != null) {

                // use CSVSPLITBY as a separator
                String[] card = line.split(CSVSPLITBY);

                System.out.println("Country [code= " + card[4] + " , name=" + card[5] + "]");

            }

        } catch (FileNotFoundException e) {
            System.out.println("CSV File " + CSVFILE + "was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}