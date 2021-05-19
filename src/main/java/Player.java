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
     *
     * @param deck
     */
    public void drawCard(CardDeck deck){
        cardDeck.drawCard(deck);
    }


    public final ArrayList<Card> getCards(){
        return kort;
    }

    public Card getCard(int i){
        return kort.get(i);
    }

    public String getName() {
        return name;
    }

    public CardDeck getCardDeck() {
        return cardDeck;
    }

    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }

    public boolean isEmpty() {
        return isEmpty();
    }

    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
