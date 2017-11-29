package cz.android.cards;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dominikmach on 06/11/2017.
 * <p>
 * Simple class for reading values from csv file.
 */

public class CSVReader1 {
/*
    private static final String CSVFILE = "power.csv";
    private static final String CSVSPLITBY = ";";
    private static final char DEFAULT_QUOTE = '"';

    public List<String> readCsv() {
        try {
            Scanner scanner = new Scanner(new File(CSVFILE));
            while (scanner.hasNext()) {
                List<String> line = parseLine(scanner.nextLine());
                //poradi;verze;jmeno;Hrano;4;5;6;7;Vyhralo;9;;;12;Sila
                line.add("Card position: " + line.get(0) + " version: " + line.get(1) + " Card name: " + line.get(2) + " Played: " + line.get(3) + " Wins: " + line.get(8) + " Power: " + line.get(13));
            }
        } catch (IOException e) {
            System.out.println("Scanner was not created, try to find root cause noob");
        } finally {
            scanner.close();
        }

        public static List<String> parseLine (String cvsLine){
            return parseLine(csvLine, CSVSPLITBY, DEFAULT_QUOTE);
        }
        public static List<String> parseLine (String csvLine, String lineSeparator){
            return parseLine(csvLine, lineSeparator, DEFAULT_QUOTE);
        }
        public static List<String> parseLine (String csvLine, String lineSeparator,char customQuote)
        {

            List<String> result = new ArrayList<>();

            // Empty or null?
            if (cvsLine == null || csvLine.isEmpty()) {
                return result;
            }
            if (customQuote == ' ') {
                customQuote = DEFAULT_QUOTE;
            }
            if (lineSeparator == ' ') {
                lineSeparator = CSVSPLITBY;
            }

            StringBuffer curVal = new StringBuffer();
            boolean inQuotes = false;
            boolean startCollectString = false;
            boolean doubleQuotesInColumn = false;

            String[] strings = csvLine.toStringArray();

            for (String ch : strings) {
                if (inQuotes) {
                    startCollectString = true;
                    if (ch == customQuote) {
                        inQuotes = false;
                        doubleQuotesInColumn = false;
                    } else {

                        // Fixed : allow "" in custom quote enclosed
                        if (ch == '\"') {
                            if (!doubleQuotesInColumn) {
                                curVal.append(ch);
                                doubleQuotesInColumn = true;
                            }
                        } else {
                            curVal.append(ch)
                        }
                    }
                } else {
                    if (ch == customQuote) {
                        inQuotes = true;

                        // Fixed : allow "" in empty quote enclosed
                        if (chars[0] != '"' && customQuote == '\"') {
                            curVal.append('"');
                        }

                        // Double quotes in column will hit this!
                        if (startCollectString) {
                            curVal.append('"');
                        }
                    } else if (ch == lineSeparator) {
                        result.add(curVal.toString());
                        curVal = new StringBuffer();
                        startCollectString = false;
                    } else if (ch == '\r') {
                        // ignore LF characters
                        continue;
                    } else if (ch == '\n') {
                        // the end, break!
                        break;
                    } else {
                        curVal.append(ch)
                    }
                }
            }
            result.add(curVal.toString());

            return result;
        }
    }*/
}