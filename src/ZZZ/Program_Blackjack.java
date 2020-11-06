package ZZZ;
/*
                     Program Blackjack
        * Goal of game is to get as close to or to 21 without going over 21.
        * Start with 2 cards
            * Aces = 1 or 11
            * Jack, Queens, King = 10
            * All other cards are face value
        * Dealer will ask you can keep taking cards until you bust (over 21)
            * Blackjack if you have 21 on the deal (an ace plus another card worth 10)
        * The dealer gets 2 cards you see one of them
        * The dealer must take another card if he has 16 or less
        * When done if the dealer is closer to 21 than you, you lose
        * If same value called push no one wins
        * If you are closer you win

   Start define data structures needed
        * Deck of cards
            * Array 52
            * Each suit with 13 cards in each suit (2-10, Jack, Queen, King, Ace)
            * Define the order of suits (e.g, Spades, Hearts, Diamonds, Clubs )
        * Player has a hand with cards in it

 */
public class Program_Blackjack {
    public static void main(String[] args) {

        int AceSpades = 11;      int AceHearts = 11;       int AceDiamonds = 11;     int AceClubs = 11;
        int twoSpades = 2;       int twoHearts = 2;        int twoDiamonds = 2;      int twoClubs = 2;
        int threeSpades = 3;     int threeHearts = 3;      int threeDiamonds = 3;    int threeClubs = 3;
        int fourSpades = 4;      int fourHearts = 4;       int fourDiamonds = 4;     int fourClubs = 4;
        int fiveSpades = 5;      int fiveHearts = 5;       int fiveDiamonds = 5;     int fiveClubs = 5;
        int sixSpades = 6;       int sixHearts = 6;        int sixDiamonds = 6;      int sixClubs = 6;
        int svnSpades = 7;       int svnHearts = 7;        int svnDiamonds = 7;      int svnClubs = 7;
        int eightSpades = 8;     int eightHearts = 8;      int eightDiamonds = 8;    int eightClubs = 8;
        int nineSpades= 9;       int nineHearts= 9;        int nineDiamonds= 9;      int nineClubs = 9;
        int tenSpades = 10;      int tenHearts = 10;       int tenDiamonds = 10;     int tenClubs = 10;
        int jackSpades = 2;      int jackHearts =2;        int jackDiamonds =2;      int jackClubs =2;
        int queenSpades = 3;     int queenHearts = 3;      int queenDiamonds = 3;    int queenClubs = 3;
        int kingSpades = 4;      int kingHearts = 4;       int kingDiamonds = 4;     int kingClubs = 4;







    }
}
