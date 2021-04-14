package main.java;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

        cardDeck.shuffleDeck();
        System.out.println(cardDeck.toString());

        Hand hand = new Hand();
        hand.drawCard(cardDeck);
        System.out.println(hand);

    }
}
