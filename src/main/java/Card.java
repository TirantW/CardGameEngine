package main.java;

public class Card {

    public Card() {
    }

    public enum Suit{
    SPADES, HEARTS, DIAMONDS, CLUBS
}
    public enum Number{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public enum Color{
        RED, BLACK
    }

    private Suit suit;
    private Color color;
    private Number number;

    public Card(Suit s, Number n){
        suit = s;
        number = n;
        switch(s){
            case CLUBS:
                color = Color.BLACK;
                break;
            case SPADES:
                color = Color.BLACK;
                break;
            case HEARTS:
                color = Color.RED;
                break;
            case DIAMONDS:
                color = Color.RED;
                break;
        }
    }

    public String toString(){
        return number + " of " + suit + " (" + color + ")";
    }
}
