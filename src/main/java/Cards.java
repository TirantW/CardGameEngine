package main.java;

public class Cards {
    public static enum Suit{
    SPADES, HEARTS, DIAMONDS, CLUBS
}
    public static enum Number{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    public static enum Color{
        RED, BLACK
    }

    private Suit suit;
    private Color color;
    private Number number;
}
