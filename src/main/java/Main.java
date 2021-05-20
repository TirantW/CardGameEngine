package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        CardDeck tableDeck = new CardDeck();
        tableDeck.removeAllCards();



        Player maiken = new Player("hei");
        Player thomas = new Player("yo");

        ArrayList<Player> players = new ArrayList<>();

        players.add(maiken);
        players.add(thomas);



        //maiken.layOutCard(tableDeck);

            maiken.drawCard(cardDeck);



        System.out.println(cardDeck.cardsRemainingInDeck());
        System.out.println(tableDeck.cardsRemainingInDeck());
        System.out.println(maiken.getCardDeck().cardsRemainingInDeck());



    }
}
