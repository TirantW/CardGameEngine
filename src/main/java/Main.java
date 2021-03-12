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

        for (int i = 0; i < NCARDS; i++) {
            boolean winner = rules.isHigher (handA.showHand(1, kort), handB.showHand(1, kort2));
            if (winner == handA) {
                System.out.println("Hand A had the highest card.");
                handA.pullInCards(kort);
            }
            else if (winner == handB) {
                System.out.println("Hand B had the highest card.");
                handB.pullInCards(kort);
            }

            if (handA.isEmpty() || handB.isEmpty()){
                return "Du har tapt";
            }

            boolean war = rules.doCardsmatch(handA.showHand(1, kort), handB.showHand(1, kort2));
        }

        Rules newRule = new Rules();
    }
}
