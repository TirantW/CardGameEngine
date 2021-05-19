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

    public String getName() {
        return name;
    }

    public CardDeck getCardDeck() {
        return cardDeck;
    }

    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
