package main.java;

import java.util.ArrayList;

public class Player {

    String name;
    ArrayList<Card> cards = new ArrayList<>();
    CardDeck cardDeck = new CardDeck();

    public Player(String name){
        this.name = name;

    }

    public CardDeck drawCard(CardDeck deck){
        takeCard(cardDeck.removeCard(0));
        return deck;
    }

    private void takeCard(Card newCard) {
        if (newCard != null) {
            cards.add(newCard);
        }
    }


    public final ArrayList<Card> getCards(){
        return cards;
    }

    @Override
    public String toString() {
        return "" + cards.toString();
    }
}
