package main.java;

public class Card {

    /**
     * empty constructor
     */
    public Card() {
    }

    public enum Suit{
    Spades, Hearts, Diamonds, Clubs
    }
    public enum Color{
        Red, Black
    }
    public enum Number{
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    private Suit suit;
    private Color color;
    private Number number;

    /**
     * constructor giving each card a value
     * @param s
     * @param num
     */
    public Card(Suit s, Number num){
        suit = s;
        number = num;
        switch(s){
            case Diamonds:
                color = Color.Red;
                break;
            case Clubs:
                color = Color.Black;
                break;
            case Spades:
                color = Color.Black;
                break;
            case Hearts:
                color = Color.Red;
                break;
        }
    }

    /**
     *
     * @return suit
     */
    public Suit getSuit(){
        return suit;
    }

    /**
     *
     * @return color
     */
    public Color getColor(){
        return color;
    }

    /**
     *
     * @return number
     */
    public Number getNumber(){
        return number;
    }

    /**
     *
     * @return number, color and suit of card as string
     */
    public String toString(){
        return "(" + color + ")" + number + " of " + suit;
    }
}
