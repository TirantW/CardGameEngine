package main.java;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> kort;
    CardDeck cardDeck = new CardDeck();

    public Player(String name){
        this.name = name;
    }

    /**
     * recieves a card from deck
     * @param deck
     */
    public void drawCard(CardDeck deck){
        cardDeck.drawCard(deck);
    }

    /*public void split(CardDeck deck){
        deck.splitty();
    }*/

    /**
     * lays out a card
     */
    public void layOutCard(CardDeck deck){
        deck.drawCard(cardDeck);
    }

    /**
     * recieves all displayed cards
     * @param cards
     */
    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }


    /**
     * checks if hand is empty
     * @return
     */
    public boolean isEmpty() {
        return isEmpty();
    }


    /**
     * returns all cards on hand
     * @return
     */
    public final ArrayList<Card> getCards(){
        return kort;
    }

    /**
     * returns one specific card
     * @param i
     * @return
     */
    public Card getCard(int i){
        return kort.get(i);
    }

    /**
     * returns name
     * @return
     */
    public String getName() {
        return name;
    }

    public CardDeck getCardDeck(){
        return cardDeck;
    }

    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
