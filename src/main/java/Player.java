package main.java;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> kort;
    CardDeck cardDeck = new CardDeck();

    public Player(String name){
        kort = new ArrayList<>();
        this.name = name;

    }

    /**
     * recieves a card from deck
     * @param deck
     */
    public void drawCard(CardDeck deck){
        cardDeck.drawCard(deck);
    }

    /**
     * lays/displays out a card
     */
    public void layOutCard(){

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

    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
