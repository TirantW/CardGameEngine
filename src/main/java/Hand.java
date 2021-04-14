package main.java;

import java.util.ArrayList;

public class Hand {

    ArrayList<Cards> cards = new ArrayList<>();
    Hand hand = new Hand();

    public void takeCard(Cards card) {
        //trekker ett kort
        cards.add(card);
    }

    public void drawCard(CardDeck deck){
        hand.drawCard(deck);
    }


    public final ArrayList<Cards> getCards(){
        return cards;
    }

    public void passRound() {
        //passer sin runde
    }

    public boolean isEmpty() {
        if (isEmpty()) {
            return true;
        }
        return false;
    }

    public Cards pullInCards(Cards cards){
        //trekker inn kort
        return new Cards();
    }

    @Override
    public String toString() {
        return "" + cards.toString();
    }
}
