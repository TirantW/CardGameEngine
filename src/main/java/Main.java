package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();

        Player maiken = new Player("Maiken");
        Player thomas = new Player("Thomas");

        for (int i = 0; i < cardDeck.cardsRemainingInDeck(); i++) {
            maiken.drawCard(cardDeck);
            thomas.drawCard(cardDeck);
        }


        //maiken.layOutCard(tableDeck);

        maiken.drawCard(cardDeck);


        System.out.println(cardDeck.cardsRemainingInDeck());


    }
}
