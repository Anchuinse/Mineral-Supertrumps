/**
 * Created by Matt on 9/1/16.
 */
public class TestCard
{
    public static void main(String[] args)
    {
        Card[] next = {new MineralCard(), new TrumpCard()};
        for(int i=0; i<next.length; ++i)
        {
            next[i].showStats();
        }
    }
}
