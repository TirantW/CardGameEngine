package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private ArrayList<Card> cards;

    public CardDeck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
    }

    public void resetDeck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Number number : Card.Number.values()) {
                cards.add(new Card(suit, number));
            }
        }
        shuffleDeck();
    }

    public void takeCard(Card newCard) {
        if (newCard != null) {
            cards.add(newCard);
        }
    }

    public Card removeCard(int i) {
        if (cards.size() > 0) {
            Card temp = cards.get(i);
            cards.remove(i);
            return temp;
        }

        return null;
    }

    public void drawCard(CardDeck from){
        this.takeCard(from.removeCard(0));
    }

    public void giveCard(CardDeck to, int i){
        to.takeCard(this.removeCard(i));
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }


    public int cardsRemaningInDeck() {
        return cards.size();
    }


    public boolean isEmpty() {
        return isEmpty();
    }

    public void pullInCardsOnTable(Card cards) {
        //trekker inn kort
    }

    public ArrayList<Card> split(){
        ArrayList<Card> tmp = new ArrayList<>();
        if(cards.size() % 2 == 0){
        for (int i = 0; i < (cards.size()/2); i++) {
                tmp.add(cards.get(i));
                cards.remove(i);
            }
        }
        return tmp;
    }

    public void splitty(int numPlayers){
        if(cards.size() % numPlayers == 0)
        for (int i = 0; i < (cards.size()/numPlayers); i++) {

        }

    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String toString() {
        return "" + cards.toString();
    }

}
