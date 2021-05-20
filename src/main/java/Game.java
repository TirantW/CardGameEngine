package main.java;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    CardDeck tableCards = new CardDeck();
    CardDeck cardDeck = new CardDeck();

    Rules rules = new Rules();

    public Game(ArrayList<Player> players) {

    }

    public void gameKrig(ArrayList<Player> players){

        for (int i = 0; i < players.size(); i++) { //Iterating through each player
            Player iteratorPlayer = players.get(i);//Set current player
            while (iteratorPlayer.getCards().size() < 26) { //Iterate trough so each player get half of the card deck
                iteratorPlayer.drawCard(cardDeck);
            }
            Player playerOne = players.get(0);
            Player playerTwo = players.get(1);
            Player currentPlayer;


            while(!playerOne.isEmpty() && !playerTwo.isEmpty()){
                onNewRound(players){
                    if(rules.isHigher(playerOne.getCard(0), playerTwo.getCard(0))){
                        playerOne.trekkInn();
                    }
                    else if(rules.doCardsNumberMatch(playerOne.getCard(0), playerTwo.getCard(0))){
                        for (int j = 1; j < 3; j++) {
                            playerOne.LeggUt();
                            playerTwo.leggUt();
                        }
                        if(rules.isHigher(playerOne.getCard(2), playerTwo.getCard(2))){ //Hvis index2 of tableCards > index 2 tableCards2
                            playerOne.pullInCardsOnTable(tableCards);
                        }

                    }
                    else
                        playerTwo.trekkInn();

                    playerOne.drawCard(cardDeck);
                    playerTwo.drawCard(cardDeck);

                    onNewPlayerRound(currentPlayer);
                }
            }
            if(playerOne.isEmpty()){
                System.out.println("Player: " + playerTwo.getName() + " Won!");
            }
            else if(playerTwo.isEmpty())
                System.out.println("Player: " + playerOne.getName() + " Won!");

        }
    }

    public void onNewRound(ArrayList<Player> players) {

        onNewPlayerRound(currentPlayer){

        }

    }



    public void onNewPlayerRound(Player currentPlayer) {
        currentPlayer.getCards().
        //Remove top card from each
        //hvis kort1 er høyere en kort2, kort1 trekker inn // if kort1>kort2 then player1.drawCard(0) drawCard(1)
        //hvis kortene matcher, krig //legg ut tre kort hver // if kort1 == kort2 then war() war(){ give 3 card to each player
        //

    }

    public void Play(){

    }
}
