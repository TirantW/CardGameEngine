package main.java;

public class Hand {

    public void takeCard(Cards cards) {
        //trekker ett kort
    }

    public Cards show(int n, Cards cards) {
        //vil vise kortet
        return new Cards();
    }

    public Cards deal(Cards cards) {
        //vil vise kortet, for så å slette fra hånden
        return new Cards();
    }

    public void pass() {
        //passer sin runde
    }

    public boolean isEmpty() {
        //sjekker om hånden er tom
        return true;
    }

    public void pullIn(Cards cards){
        //trekker inn kort
    }
}
