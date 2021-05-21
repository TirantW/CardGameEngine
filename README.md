# Card Engine user manuel.

How to use our Framework (Card_Game):

This framework can be used to play a few existing card games, like “war, solitaire etc.”
You can make your own card games, and add rules to them. 

You can select and add rules to the card game by using `Rules.java`. In the class Rules, we have rules like: `isHigher`, `isLower`, `doCardmatch` and `doCardsColorMatch`. 
These are rules that most of the card games uses. 

In `Player.java` can you get method like `drawCard`, `getCards`, `getCardDeck`. These are the method that every player in a card game uses to play. Most of the card games needs these methods to play. 


How to download JAR file:

1. Download `FrameWork.jar` file to your machine from [this link](https://github.com/TirantW/CardGameEngine/blob/main/out/artifacts/FrameWork_jar2/FrameWork.jar).

2. From the project file you downloaded, locate `FrameWork.jar` on your computer.

3. Select the project `FrameWork` in the IntelliJ IDEA application.

4. After that, go to File to Project Structure.

5. Navigate to Dependencies under Modules.

6. Select JARs or Directories from the + symbol below the list of modules.

7. Apply, then OK,`FrameWork`has been installed successfully.







API references: 
Class summary:
Player
Method summary:
void – drawCard(CardDeck deck) : Trekker et kort fra kortstokken.
void – layOutCard(Card cards) : Vil legge øvereste kort fra spillers hånd til «bordet».
void – pullInAllCardsOnTable(Card cards) : Vil trekke inn alle kort på «bordet».
Void – isEmpty() : Sjekker om hånden er tom. 
ArrayList<Card> – getCards() : returnerer alle kort på hånden.
Card – getCard(int i) : returnerer et spesifikt kort på hånden. 
String – getName(): returnerer spillerens navn. 


Cards
Method summary:
Color – getColor(): returnerer kortets farge.
Number – get Number(): returnerer kortets nummer.
Suit – getSuit(): returnerer kortets verdi. 


CardDeck
Method summary:
Void – resetDeck() : sletter alle aktive kort objekter og starter en ny kortstokk.
Void – shuffleDeck() : vil restokke kortstokken.
void – drawCard(CardDeck deck) : Vil trekke et kort fra toppen av kortstokken. 
Void – removeCard(int pos): vil slette det øverste korten som er trukket fra kortstokken.
Void – takeCard(): vil legge til kort i array listen. 
Void – removeAllCards(): sletter alle kort fra kortstokken. 
Void – giveCard(CardDeck to, int i): vil gi et kort fra kortstokken til en annen kortstokk eller spiller.
Void – cardsRemainingInDeck(): returnerer antall kort I kortstokken. 
Void – isEmpty(): sjekker om kortstokken er tom. 
Void – getCards(): returnerer kortene i kortstokken. 

Rules
Method summary:
boolean – isHigher(Cards en, Cards to) : vil sjekke om et kort er høyere enn et annet.
boolean – isLower(Cards en, Cards to) : vil sjekke om et kort er lavere enn et annet.
boolean – doCardsmatch(Cards en, Cards to) : vil sjekke om et kort matcher et annet.
boolean – doCardsColorMatch(Cards en, Cards to) : vil sjekke om fargen på et kort matcher et annet. 
boolean – doCardsNumberMatch(Cards en, Cards to): vil sjekke om to kort har like tall. 
Void – addRule(Rules rule) : tillater spiller å legge til regel. 

Game
Method summary:
Void – onNewRound(ArrayList<Player> players): setter regler for hver runde i spillet.
Void – onNewPlayerRound(ArrayList<Player> players): setter regler for hver spiller per runde.
Void – Play() : starter et spill

