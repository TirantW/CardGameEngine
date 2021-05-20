package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

        cardDeck.shuffleDeck();
        System.out.println(cardDeck.toString());

        Player maiken = new Player("hei");
        Player thomas = new Player("yo");

        ArrayList<Player> players = new ArrayList<>();

        CardDeck maikenDeck = cardDeck.split();

        System.out.println(cardDeck.cardsRemaningInDeck());
        System.out.println(maiken.getCards());
        System.out.println(thomas.getCards());
    }
}
