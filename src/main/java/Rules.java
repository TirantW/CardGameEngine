package main.java;

import java.util.ArrayList;

public class Rules {

    ArrayList<Rules> rules = new ArrayList<>();

    /**
     * check if one card is higher than another
     * @param kortEn
     * @param kortTo
     * @return
     */
    public boolean isHigher(Card kortEn, Card kortTo){
        //dette vil sjekke om et kort er høyere enn et annet, til for eksempel Krig
        return true;
    }

    /**
     * check if one card is lower than another
     * @param kortEn
     * @param kortTo
     * @return
     */
    public boolean isLower(Card kortEn, Card kortTo){
        //dette vil sjekke om et kort er lavere enn et annet, til for eksempel Kabal
        return true;
    }

    /**
     * checks if two cards match
     * @param kortEn
     * @param kortTo
     * @return
     */
    public boolean doCardsmatch(Card kortEn, Card kortTo){
        //sjekker om kortene matcher
        if (kortEn.getNumber().equals(kortTo.getNumber()) && kortEn.getSuit().equals(kortTo.getSuit())){
            return true;
        }
        return false;
    }

    /**
     * checks if two cards' color match
     * @param kortEn
     * @param kortTo
     * @return
     */
    public boolean doCardsColorMatch(Card kortEn, Card kortTo){
        //sjekker om fargene på kortene matcher
        if (kortEn.getColor().equals(kortTo.getColor())){
            return true;
        }
        return false;
    }

    /**
     * checks if two cards' number match
     * @param kortEn
     * @param kortTo
     * @return
     */
    public boolean doCardsNumberMatch(Card kortEn, Card kortTo){
        //sjekker om fargene på kortene matcher
        if (kortEn.getNumber().equals(kortTo.getNumber())){
            return true;
        }
        return false;
    }

    /**
     * adds a rule
     * @param rule
     */
    public static void add(Rules rule){
        //legger til en regel
    }

}
