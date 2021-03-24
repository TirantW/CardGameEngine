package main.java;

public class Hand {

    public Cards takeCard(Cards cards) {
        //trekker ett kort
        return new Cards();
    }

    public Cards showHand(int n, Cards cards) {
        //vil vise kortet
        return new Cards();
    }

    public Cards dealCard(Cards cards) {
        //vil vise kortet, for så å slette fra hånden
        return new Cards();
    }

    public void passRound() {
        //passer sin runde
    }

    public boolean isEmpty() {
        //sjekker om hånden er tom
        return true;
    }

    public Cards pullInCards(Cards cards){
        //trekker inn kort
        return new Cards();
    }
}
