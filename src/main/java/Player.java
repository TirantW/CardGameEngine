package main.java;

import java.util.ArrayList;

public class Player {

    int players;
    String names;
    ArrayList<Card> cards = new ArrayList<>();
    CardDeck cardDeck = new CardDeck();

    public Player(int players, String names){
        this.players = players;
        this.names = names;
    }

    public void takeCard(Card card) {
        //trekker ett kort
        cards.add(card);
    }

    public CardDeck drawCard(CardDeck deck){
        deck.drawCard(cardDeck);
        return deck;
    }


    public final ArrayList<Card> getCards(){
        return cards;
    }

    @Override
    public String toString() {
        return "" + cards.toString();
    }
}
