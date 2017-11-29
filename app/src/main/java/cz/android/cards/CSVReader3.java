package cz.android.cards;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by domin on 11/29/2017.
 */

public class CSVReader3 {
    public List<String> readCSV() {
        String csvFile = "power.csv";
        String line = "";
        String csvSplitBy = ",";
        List<String> cards = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] cardsLine = line.split(csvSplitBy);

                cards.add(("Card position: " + cardsLine[0] + " version: " + cardsLine[1] + " Card name: " + cardsLine[2] + " Played: " + cardsLine[3] + " Wins: " + cardsLine[8] + " Power: " + cardsLine[13]));
            }
        } catch (IOException e) {
            System.out.println("Shit happens... ");
            e.printStackTrace();
        }
        return cards;
    }
}
