/** This represents all cards used in the game.
 * Created by Matt on 9/1/16.
 */
import java.util.*;
import static java.lang.Math.*;

public abstract class Card
{
    public abstract void showStats();
            //allows for showStats() from MineralCard and TrumpCard to be used

    public abstract String getName();
            //allows for getName() from MineralCard and TrumpCard to be used

    public abstract String getNewCurrentCategory(String current_category);
            //allows for getCurrentCategory() from MineralCard and TrumpCard to be used

    public abstract double getNewCurrentValue(String current_category);
            //allows for getCurrentValue() from MineralCard and TrumpCard to be used

    public abstract boolean checkIfPlayable(String current_category, double current_value);
}
