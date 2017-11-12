package cz.android.cards;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by dominikmach on 09/11/2017.
 */

public class SearchableActivity {
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
            doMySearch(query);
        }
    }

        //getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        //MenuItem searchItem = menu.findItem(R.id.action_search);
        //SearchView searchView = (searchView) MenuItemCompat.getActionView(searchItem);
    }
}
