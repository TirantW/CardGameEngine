package main.java;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());
        CardDeck cardDeck1 = new CardDeck();

        cardDeck.shuffleDeck();
        System.out.println(cardDeck.toString());

        Player maiken = new Player("hei");

        for(int i = 0; i <  5; i++) {
            maiken.drawCard(cardDeck);
        }
        System.out.println(maiken.getCards());
        System.out.println(cardDeck.cardsRemaningInDeck());
    }
}
