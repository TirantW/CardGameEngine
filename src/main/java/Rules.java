package main.java;

public class Rules {

    public void isHigher(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er høyere enn et annet, til for eksempel Krig
    }

    public void isLower(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er lavere enn et annet, til for eksempel Kabal
    }

    public void match(Cards kortEn, Cards kortTo){
        //sjekker om kortene matcher
    }

    public void colorMatch(Cards kortEn, Cards kortTo){
        //sjekker om fargene på kortene matcher
    }

    public void addRule(Rules rule){
        //legger til egne regler
    }

}
