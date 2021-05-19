# Card Engine user manuel.

How to use our Framework (Card_Game):

This framework can be used to play a few existing card games, like “war, solitaire etc.”
You can make your own card games, and add rules to them. 

You can select and add rules to the card game by using `Rules.java`. In the class Rules, we have rules like: `isHigher`, `isLower`, `doCardmatch` and `doCardsColorMatch`. 
These are rules that most of the card games uses. 

In `Player.java` can you get method like `drawCard`, `getCards`, `getCardDeck`. These are the method that every player in a card game uses to play. Most of the card games needs these methods to play. 


Manually adding Card game:

1. Download `FrameWork.jar` file to your machine from [this link](https://github.com/TirantW/CardGameEngine/blob/main/out/artifacts/FrameWork_jar2/FrameWork.jar).


To begin with: 

1. Initializing a Card object.

2. Add some rules from class `Rules` into the class `Game`, that will fit with your card game. 

3. Add methods from class `Player` into the class `Game`, so the player can draw, get the cards. 

4.





API references: 
