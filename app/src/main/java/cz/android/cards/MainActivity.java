package cz.android.cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    SearchView sv;
    ListView lv;
    ArrayAdapter<String> adapter;
    String csvFile = "power.csv";
    String line = "";
    String csvSplitBy = ";";
    List<Card> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = findViewById(R.id.search);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextChange(String newText) {
                //Toast.makeText(MainActivity.this.getApplicationContext(),newText, Toast.LENGTH_SHORT).show();
                List<Card> result = search(newText, readCSV());
                //Toast.makeText(MainActivity.this, "" + result.size(), Toast.LENGTH_SHORT).show();
                adapter.clear();
                adapter.addAll(convert(result));
                adapter.notifyDataSetChanged();
                return true;
            }


            @Override
            public boolean onQueryTextSubmit(String query) {
                //Toast.makeText(MainActivity.this.getApplicationContext(),query, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        prepareList();
    }

    public List<Card> search(String input, List<Card> collection) {
        List<Card> result = new ArrayList<>();

        for (Card c : collection) {
            int actuallCard = c.getName().toLowerCase().indexOf(input.toLowerCase());
            if (actuallCard != -1) {
                result.add(c);
            }
        }
        return result;
    }

    public List<String> convert(List<Card> cards) {
        List<String> result = new ArrayList<>();
        for (Card card : cards) {
            result.add(card.toString());
        }
        return result;
    }

    public List<Card> readCSV() {

        if (cards == null) {
            cards = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(getAssets().open("power.csv")))) {
                while ((line = br.readLine()) != null) {
                    String[] cardsLine = line.split(csvSplitBy);

                    //cards.add(("Card position: " + cardsLine[0] + " version: " + cardsLine[1] + " Card name: " + cardsLine[2] + " Played: " + cardsLine[3] + " Wins: " + cardsLine[8] + " Power: " + cardsLine[13]));
                    cards.add(new Card(cardsLine[2], Float.parseFloat(cardsLine[18]), cardsLine[1]));
                }
            } catch (Exception e) {
                System.out.println("Shit happens... ");
                e.printStackTrace();
            }
        }
        return cards;
    }

    public void prepareList() {
        lv = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, convert(readCSV()));
        lv.setAdapter(adapter);
    }

}
