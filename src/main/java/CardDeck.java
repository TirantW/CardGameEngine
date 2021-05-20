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

    /**
     * deletes all current card object and create a new deck
     */
    public void resetDeck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
        shuffleDeck();
    }

    /**
     * adds a card to hand
     * @param newCard
     */
    public void takeCard(Card newCard) {
        if (newCard != null) {
            cards.add(newCard);
        }
    }

    /**
     * removes top card from deck
     * @param i
     * @return
     */
    public Card removeCard(int i) {
        if (cards.size() > 0) {
            Card temp = cards.get(i);
            cards.remove(i);
            return temp;
        }

        return null;
    }

    /**
     * recieves card from deck
     * @param from
     */
    public void drawCard(CardDeck from){
        this.takeCard(from.removeCard(0));
    }

    /**
     * gives a card from deck to another deck or player
     * @param to
     * @param i
     */
    public void giveCard(CardDeck to, int i){
        to.takeCard(this.removeCard(i));
    }

    /**
     * shuffles deck
     */
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    /**
     * returns cards remaining in deck
     * @return
     */
    public int cardsRemainingInDeck() {
        return cards.size();
    }

    /**
     * checks if deck is empty
     * @return
     */
    public boolean isEmpty() {
        return isEmpty();
    }

    public ArrayList<Card> split(){
        ArrayList<Card> tmp = new ArrayList<>();
        if(cards.size() % 2 == 0){
        for (int i = 0; i < (cards.size()/2); i++) {
                tmp.add(cards.get(i));
                cards.remove(i);
            }
        }
        return tmp;
    }

    public void splitty(int numPlayers){
        if(cards.size() % numPlayers == 0)
        for (int i = 0; i < (cards.size()/numPlayers); i++) {

        }

    }

    /**
     * returns cards in deck
     * @return
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public String toString() {
        return "" + cards.toString();
    }

}
