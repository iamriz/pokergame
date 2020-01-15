Sharing one way of answering the coding exercise given by one of the companies I applied before.
Details as follows:

# Texas Hold'em Poker Simulator #######################################################################

This exam was based on [Texas Hold'em](https://en.wikipedia.org/wiki/Texas_hold_%27em), a Poker card game.

Watch this [video](https://www.youtube.com/watch?v=GAoR9ji8D6A). for the rules.

As a summary:

- Before playing, it is important to know how to identify the highest hands of the players.
  - i.e. If a player has a Flush, Straight, Full House, etc., and 
[kicker/s](https://en.wikipedia.org/wiki/Texas_hold_%27em#Kickers_and_ties) if any. 
- Identifying the player with the winning hand.
- At the start of the game, each player will be given two cards.
- Pressing space or clicking `Next Action` will put community cards on the table.
  - The first action will put three community cards on the table.
  - The second and third actions will put one community card each on the table.
- Once all five community cards slots are filled, the winner will be declared.
- Pressing space or clicking `New Game` will start a new game.

![simulator in action](texas-holdem-poker-simulator.gif)

### How to get running:
- Need at least Java 8 or higher installed
- IntelliJ IDEA is recommended. The Community Edition will do just fine.
  Otherwise, you can open the project in your editor of choice.
- To run the application, go to the project directory and `./gradlew bootRun`. 
- Check `http://localhost:8080` to see if it's working.
- To run the tests, run `./gradlew test` in the root directory of the project.

## About the exam:

The functionality is incomplete. Do the ff. tasks:
- Identify the players' highest hands and display in the web UI.
- Identify the winner at the end of the game.
  - In the event of a [tie](https://en.wikipedia.org/wiki/Texas_hold_%27em#Kickers_and_ties), declare tied players as 
  the winners.