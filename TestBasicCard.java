/**
 * Created by Matt on 8/24/16.
 */
public class TestBasicCard
    //only used to test the card class
{
    public static void main(String[] args)
    {
        MineralCard new_card = new MineralCard();
        new_card.showStats();
        MineralCard diamond = new MineralCard("Diamond", 10, 3.5, "4 perfect", "ultratrace", "I'm rich!");
        diamond.showStats();
    }


}
