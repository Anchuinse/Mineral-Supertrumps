/**
 * Created by Matt on 9/1/16.
 */
import java.util.*;
public class Player
{
    int number;
    String name;
    ArrayList<Card> hand;
    Boolean can_play,winner;

    public Player()
            //basic constructor that creates Player #1 with name Player 1
    {
        number = 1;
        name = "Player 1";
        hand = new ArrayList<Card>();
        can_play = true;
        winner = false;
    }

    public Player(int newnumber, String newname)
            //constructor that creates a Player #? with name newname
    {
        number = newnumber;
        name = newname;
        hand = new ArrayList<Card>();
        can_play = true;
        winner = false;
    }

    public boolean canTheyPlay()
            //returns true if a player can play cards
    {
        return can_play;
    }

    public int getPlayerNumber()
            //returns player number
    {
        return number;
    }

    public boolean getWinStatus()
            //returns whether the player has won yet, false means they haven't won yet
    {
        return winner;
    }

    public ArrayList<Card> getHand()
            //returns the contents of a player's hand
    {
        return hand;
    }

    public ArrayList<String> getCardsInHand()
            //returns an arraylist of the names of cards in a player's hand, used to check if cards are in hand
    {
        ArrayList<String> cardnames = new ArrayList<>();
        for (int i=0; i < hand.size(); ++i)
        {
            cardnames.add(hand.get(i).getName());
        }
        return cardnames;
    }

    public String getName()
            //returns the player's name
    {
        return name;
    }

    public void changeHand(ArrayList<Card> newhand)
            //updates the player's hand
    {
        hand = newhand;
    }

    public void changePlayStatus(boolean newstatus)
            //updates whether the player can play
    {
        can_play = newstatus;
    }

    public void changeWinStatus(boolean newstatus)
            //changes winner to the new status
    {
        winner = newstatus;
    }
}
