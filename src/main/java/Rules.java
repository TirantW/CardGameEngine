package main.java;

public class Rules {

    public boolean isHigher(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er høyere enn et annet, til for eksempel Krig
        return true;
    }

    public boolean isLower(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er lavere enn et annet, til for eksempel Kabal
        return true;
    }

    public boolean doCardsmatch(Cards kortEn, Cards kortTo){
        //sjekker om kortene matcher
        return true;
    }

    public boolean doCardsColorMatch(Cards kortEn, Cards kortTo){
        //sjekker om fargene på kortene matcher
        return true;
    }

    public static void add(Rules rule){
        //legger til en regel
    }

}
