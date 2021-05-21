package main.java;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> kort;
    CardDeck cardDeck = new CardDeck();

    /**
     * contructor
     * @param name
     */
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
     * lays out a card
     */
    public void layOutCard(Card card){

    }

    /**
     * recieves all displayed cards
     * @param cards
     */

    /**
     * pulls in all displayed cards
     * @param cards
     */
    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }


    /**
     * checks if hand is empty
     * @return true or false
     */
    public boolean isEmpty() {
        return isEmpty();
    }


    /**
     *
     * @return array of cards
     */
    public final ArrayList<Card> getCards(){
        return kort;
    }

    /**
     *
     * @param i
     * @return specific card from array
     */
    public Card getCard(int i){
        return kort.get(i);
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return card object to string
     */
    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
