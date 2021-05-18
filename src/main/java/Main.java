package main.java;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

        cardDeck.shuffleDeck();
        System.out.println(cardDeck.toString());

        Player maiken = new Player("hei");

        for (int i = 0; i < 5; i++) {
            maiken.drawCard(cardDeck);
        }

        System.out.println(cardDeck.cardsRemaningInDeck());
        System.out.println(maiken.getCards());
    }
}
