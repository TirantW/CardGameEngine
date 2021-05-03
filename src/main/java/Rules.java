package main.java;

public class Rules {

    public boolean isHigher(Card kortEn, Card kortTo){
        //dette vil sjekke om et kort er høyere enn et annet, til for eksempel Krig
        return true;
    }

    public boolean isLower(Card kortEn, Card kortTo){
        //dette vil sjekke om et kort er lavere enn et annet, til for eksempel Kabal
        return true;
    }

    public boolean doCardsmatch(Card kortEn, Card kortTo){
        //sjekker om kortene matcher
        return true;
    }

    public boolean doCardsColorMatch(Card kortEn, Card kortTo){
        //sjekker om fargene på kortene matcher
        return true;
    }

    public static void add(Rules rule){
        //legger til en regel
    }

}
