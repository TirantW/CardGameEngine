package main.java;

import java.util.ArrayList;

public class CardDeck {

    public CardDeck(boolean isFull){
        ArrayList cards = new ArrayList<Cards>();
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

    public Cards drawFromDeck(){
        //vil trekke kort utifra spillregler
        return new Cards();
    }

}
