package main.java;

import java.util.ArrayList;

public class CardDeck {
    private ArrayList<Cards> cards;

    public CardDeck(boolean isFull){
        cards = new ArrayList<>();
        if(isFull){
            for (Cards.Suit suit: Cards.Suit.values()){
                for (Cards.Number number: Cards.Number.values()){
                    cards.add(new Cards(suit, number));
                }
            }
        }
    }

    public void resetDeck(){
        //sletter gamle kort objekter og resetter dekket til 52 kort.
    }

    public void shuffleDeck(){
        //resorterer kortstokken
    }

    public void cardsRemaningInDeck(){

    }

    public Cards drawFromDeck(){
        //vil trekke kort utifra spillregler
        return new Cards();
    }

    public String toString(){
        for (int i = 0; i < cards.size(); i++){
            System.out.println(cards.get(i));
        }
        return "";
    }


}
