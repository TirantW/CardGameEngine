package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    public static BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
    //private String names;
    //private CardDeck hand;
    

    public int inputNumPlayers(){
        int numPlayers = 0;

        try{
            //Loop until number of players are correctly set and breaks loop.
            while(true){
                System.out.println("Players: ");
                String input = buffReader.readLine();
                try{
                    numPlayers = Integer.parseInt(input);
                    if(numPlayers < 2){
                        System.out.println("Number of player needs to be at least 2");
                    }
                        else if(numPlayers > 8){
                        System.out.println("Number of player cannot exceed 10");
                    }
                    else{
                        System.out.println("There are " + numPlayers + " players");
                        break;
                    }
                } catch (NumberFormatException e) { //Prints error message and loops again.
                    System.out.println("Wrong format, restarting loop");
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numPlayers;
    }
}
