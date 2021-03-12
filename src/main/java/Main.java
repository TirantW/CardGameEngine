package main.java;

public class Main {

    public static void main(String[] args) {

        int NCARDS = 26;
        CardDeck cardDeck = new CardDeck();
        Cards kort = new Cards();
        Cards kort2 = new Cards();
        Rules rules = new Rules();
        Hand handA = new Hand ();
        Hand handB = new Hand ();
        for (int i = 0; i < NCARDS; i++) {
            handA.takeCard(cardDeck.drawFromDeck());
            handB.takeCard(cardDeck.drawFromDeck());
        }


    }
}
