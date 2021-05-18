package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
    }

    public void resetDeck() {

    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }


    public int cardsRemaningInDeck() {
        return cards.size();
    }

    public Card removeCard(int i) {
        if (cards.size() > 0) {
            Card temp = cards.get(i);
            cards.remove(i);
            return temp;
        }

        return null;
    }


    public boolean isEmpty() {
        return isEmpty();
    }

    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }

    public String toString() {
        return "" + cards.toString();
    }

}
