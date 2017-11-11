package cz.android.cards;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;

/**
 * Created by dominikmach on 09/11/2017.
 */

public class SearchableActivity {
    @Override
    public boolean onCreateOptionsMenu() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        // Can be replaced with getComponentName()
        // if this searchable activity is the current activity
        ComponentName componentName = new ComponentName(context, SearchableActivity.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName));


        //getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        //MenuItem searchItem = menu.findItem(R.id.action_search);
        //SearchView searchView = (searchView) MenuItemCompat.getActionView(searchItem);
    }
}
