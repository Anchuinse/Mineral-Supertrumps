/**
 * Created by Matt on 9/1/16.
 */
import java.util.*;
public class Player
{
    int number;
    String name;
    ArrayList<Card> hand;
    Boolean can_play;

    public Player()
            //basic constructor that creates Player #1 with name Player 1
    {
        number = 1;
        name = "Player 1";
        hand = new ArrayList<Card>();
        can_play = true;
    }

    public Player(int newnumber, String newname)
            //constructor that creates a Player #? with name newname
    {
        number = newnumber;
        name = newname;
        hand = new ArrayList<Card>();
        can_play = true;
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

    public ArrayList<Card> getHand()
            //returns the contents of a player's hand
    {
        return hand;
    }

    public String getName()
            //returns the player's name
    {
        return name;
    }
}
