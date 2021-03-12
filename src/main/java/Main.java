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
            handA.takeCard(cardDeck.draw());
            handB.takeCard(cardDeck.draw());
        }

        for (int i = 0; i < NCARDS; i++) {
            boolean winner = rules.isHigher (handA.show (1, kort), handB.show(1, kort2));
            if (winner == handA) {
                System.out.println("Hand A had the highest card.");
                handA.pullIn(kort);
            }
            else if (winner == handB) {
                System.out.println("Hand B had the highest card.");
                handB.pullIn(kort);
            }

            if (handA.isEmpty() || handB.isEmpty()){
                return "Du har tapt";
            }

            boolean war = rules.match(handA.show (1, kort), handB.show(1, kort2));
        }

    }
}
