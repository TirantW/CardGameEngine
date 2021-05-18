package main.java;

import java.util.ArrayList;

public class Rules {

    ArrayList<Rules> rules = new ArrayList<>();

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
        if (kortEn.getNumber().equals(kortTo.getNumber()) && kortEn.getSuit().equals(kortTo.getSuit())){
            return true;
        }
        return false;
    }

    public boolean doCardsColorMatch(Card kortEn, Card kortTo){
        //sjekker om fargene på kortene matcher
        if (kortEn.getColor().equals(kortTo.getColor())){
            return true;
        }
        return false;
    }

    public static void add(Rules rule){
        //legger til en regel
    }

}
