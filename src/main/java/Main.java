package main.java;

public class Main {

    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck.toString());

        cardDeck.shuffleDeck();
        System.out.println(cardDeck.toString());


        Player maiken = new Player(3, "hei");
        Player knut = new Player(3, "hei");

        for(int i = 0; i <  5; i++) {
            maiken.drawCard(cardDeck.drawCard(cardDeck));
        }
        System.out.println(cardDeck.cardsRemaningInDeck());
    }
}
