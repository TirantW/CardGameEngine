package main.java;

public class Rules {

    public boolean isHigher(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er høyere enn et annet, til for eksempel Krig
    }

    public boolean isLower(Cards kortEn, Cards kortTo){
        //dette vil sjekke om et kort er lavere enn et annet, til for eksempel Kabal
    }

    public boolean match(Cards kortEn, Cards kortTo){
        //sjekker om kortene matcher
    }

    public boolean colorMatch(Cards kortEn, Cards kortTo){
        //sjekker om fargene på kortene matcher
    }

    public Rules addRule(Rules rule){
        //legger til egne regler
        return new Rules();
    }

}
