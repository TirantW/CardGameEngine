package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList<Card> cards;

    /**
     * constructor
     */
    public CardDeck() {
        cards = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
        shuffleDeck();
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
    protected void takeCard(Card newCard) {
            cards.add(newCard);
    }

    /**
     * removes card from index i on deck
     * @param pos
     * @return
     */
    protected Card removeCard(int pos) {
        if (cards.size() > 0) {
            Card tmp = cards.get(pos);
            cards.remove(pos);
            return tmp;
        }

        return null;
    }

    /**
     * Recieves top card to this deck from another deck
     * @param deck
     */
    protected void drawCard(CardDeck deck){
        this.takeCard(deck.removeCard(0));
    }


    /**
     * removes all cards
     * @param
     * @return
     */
    public void removeAllCards(){
        cards.removeAll(cards);
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
     *
     * @return cards remaining in deck
     */
    public int cardsRemainingInDeck() {
        return cards.size();
    }

    /**
     * checks if deck is empty
     * @return true or false
     */
    public boolean isEmpty() {
        return isEmpty();
    }

    /**
     * Splits deck into amount of players, which has to be even for this method to work.
     * @return tmp which is the other half of the card deck
     */
    public ArrayList<Card> split(int numPlayers){
        ArrayList<Card> tmp = new ArrayList<>();
        if(cards.size() % numPlayers == 0){
            for (int i = 0; i < (cards.size()/numPlayers); i++) {
                tmp.add(cards.get(i));
                cards.remove(i);
            }
        }
        else{
            System.out.println("Not an even number");
        }
        return tmp;
    }

    /**
     *
     * @return cards in deck
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     *
     * @return card objects to string
     */
    public String toString() {
        return "" + cards.toString();
    }

}
