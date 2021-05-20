package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList<Card> cards;

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
    public void takeCard(Card newCard) {
            cards.add(newCard);
    }

    /**
     * removes card from index i on deck
     * @param pos
     * @return
     */
    public Card removeCard(int pos) {
        if (cards.size() > 0) {
            Card tmp = cards.get(pos);
            cards.remove(pos);
            return tmp;
        }

        return null;
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
     * Recieves top card to this deck from another deck
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

    public void splitty(ArrayList<Player> players, CardDeck deck){
        for(int i = 0; i < deck.cardsRemainingInDeck(); i++){
            players.get(i).drawCard(deck);
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
