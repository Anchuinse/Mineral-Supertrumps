/**
 * Created by Matt on 9/1/16.
 */
public class TestTrumpCard
{
    public static void main(String[] args)
    {
        TrumpCard firstcard = new TrumpCard();
        firstcard.showStats();
        TrumpCard secondcard = new TrumpCard("My name", "hardness");
        secondcard.showStats();
        TrumpCard thirdcard = new TrumpCard("thirdcard", "hrdness");
        thirdcard.showStats();
        thirdcard.changeName("Spinach");
        thirdcard.showStats();
    }
}
