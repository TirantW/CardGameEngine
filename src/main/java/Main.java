package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

        Player maiken = new Player("hei");
        Player thomas = new Player("yo");

        ArrayList<Player> players = new ArrayList<>();

        players.add(maiken);
        players.add(thomas);

        for(int i = 0; i < 26; i++){
            maiken.drawCard(cardDeck);
            thomas.drawCard(cardDeck);
        }

        System.out.println(cardDeck.cardsRemainingInDeck());
        System.out.println(maiken.getCards().size());


    }
}
