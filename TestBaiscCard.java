/**
 * Created by Matt on 8/24/16.
 */
public class TestBaiscCard
    //only used to test the card class
{
    public static void main(String[] args)
    {
        BasicCard new_card = new BasicCard();
        new_card.showStats();
        BasicCard diamond = new BasicCard("Diamond", 10, 3.5, "4 perfect", "ultratrace", "I'm rich!");
        diamond.showStats();
    }


}
