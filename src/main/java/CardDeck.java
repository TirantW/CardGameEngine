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
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
        shuffleDeck();
    }

    public void takeCard(Card newCard) {
        if (newCard != null) {
            cards.add(newCard);
        }
    }

    public Card removeCard(int i) {
        if (cards.size() > 0) {
            Card temp = cards.get(i);
            cards.remove(i);
            return temp;
        }

        return null;
    }

    public void drawCard(CardDeck from){
        this.takeCard(from.removeCard(0));
    }

    public void giveCard(CardDeck to, int i){
        to.takeCard(this.removeCard(i));
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }


    public int cardsRemaningInDeck() {
        return cards.size();
    }


    public boolean isEmpty() {
        return isEmpty();
    }

    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String toString() {
        return "" + cards.toString();
    }

}
