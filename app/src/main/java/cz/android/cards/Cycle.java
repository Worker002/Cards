package cz.android.cards;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dominikmach on 21/12/2017.
 */

public class Cycle {
    List<Card> getNamesForWithIterator(List<Card> cards) {
        List<Card> result = new ArrayList<>();

        for (Card c : cards) {
            result.add(c);
        }
        return result;
    }

    List<Card> getNamesForWithIndex(List<Card> cards) {
        List<Card> result = new ArrayList<>();
        int size = cards.size();

        for (int i = 0 ; i<size ; i++) {
            result.add(cards.get(i));
        }
        return result;
    }

    List<Card> getNamesWhileWithIndex(List<Card> cards) {
        List<Card> result = new ArrayList<>();
        int position = 0;
        while (cards.get(position) != null)
        {
            result.add(cards.get(position));
            position++;
        }

        return result;
    }

    List<Card> getNamesWhileWithIterator(List<Card> cards) {
        List<Card> result = new ArrayList<>();
        int position = 0;
        while (cards.iterator().hasNext()) {
            result.add(cards.get(position));
            position++;
        }

        return result;
    }

    List<Card> getNamesDoWhileWithIterator(List<Card> cards) {
        List<Card> result = new ArrayList<>();
        int position = 0;
        do {
            result.add(cards.get(position));
            position++;
        } while (cards.iterator().hasNext());

        return result;
    }

    List<Card> getNamesDoWhileWithIindex(List<Card> cards) {
        List<Card> result = new ArrayList<>();
        int position = 0;
        do {
            result.add(cards.get(position));
            position++;
        } while (position <= cards.size());

        return result;
    }

    /*@RequiresApi(api = Build.VERSION_CODES.N)
    List<Card> getNamesWithLoop(List<Card> cards){
        List<Card> result = new ArrayList<>();
        int i = 0;
        cards.stream()
                .forEach(result.add();

        return result;
    }*/
}
