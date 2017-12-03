package cz.android.cards;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import static R.layout.class;

/**
 * Created by dominikmach on 09/11/2017.
 */

public class SearchableActivity extends ListActivity{
    /*@Override
    public boolean onCreateOptionsMenu() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        // Can be replaced with getComponentName()
        // if this searchable activity is the current activity
        ComponentName componentName = new ComponentName(context, SearchableActivity.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName));
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            readCsv(query);
        }
    }

    public void readCsv<String>(String query) {
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

    //getMenuInflater().inflate(R.menu.main_activity_actions, menu);
    //MenuItem searchItem = menu.findItem(R.id.action_search);
    //SearchView searchView = (searchView) MenuItemCompat.getActionView(searchItem);
}
