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

    public void drawCard(CardDeck deck){
        cardDeck.drawCard(deck);
    }


    public final ArrayList<Card> getCards(){
        return kort;
    }

    @Override
    public String toString() {
        return "" + kort.toString();
    }
}
