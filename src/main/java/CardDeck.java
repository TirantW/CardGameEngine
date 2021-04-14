package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList<Cards> cards;

    public CardDeck() {
        cards = new ArrayList<>();
        for (Cards.Suit suit : Cards.Suit.values()) {
            for (Cards.Number number : Cards.Number.values()) {
                cards.add(new Cards(suit, number));
            }
        }
    }

    public void resetDeck() {

    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public int cardsRemaningInDeck() {
        return cards.size();
    }

    private void putCard(Cards newCard){
        if(newCard != null){
            cards.add(newCard);
        }
    }

    private Cards removeCard(int i){
        if(cards.size() > 0){
            Cards temp = cards.get(i);
            cards.remove(i);
            return temp;
        }

        return null;
    }

    public void drawCard(CardDeck from){
        this.putCard(from.removeCard(0));
    }

    public String toString() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
        return "";
    }


}
