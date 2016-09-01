/**
 * Created by Matt on 9/1/16.
 */
import java.util.*;
public class TrumpCard extends Card
{
    String name, category;

    public TrumpCard()
            //basic constructor, creates an unnamed card that allows players to choose the playable trump
    {
        name = "Unnamed_Trump";
        category = "your choice";
    }

    public TrumpCard(String newname, String newcategory)
            //constructor: accepts a name and a trump that the card will turn the active trump too
            //will only accept hardness, specific gravity, crystal abundance, economic value, cleavage or your choice for newcategory
            //prompts for a valid category/trump if given an invalid one
    {
        name = newname;
        if (newcategory.equals("hardness") || newcategory.equals("specific gravity") || newcategory.equals("crystal abundance") || newcategory.equals("economic value") || newcategory.equals("cleavage") || newcategory.equals("your choice"))
        {
            category = newcategory;
        }
        else
        {
            System.out.println("The trump you entered was not valid, please enter a valid trump category:");
            Scanner scanner = new Scanner(System.in);
            String validcategory = scanner.nextLine();
            this.changeCategory(validcategory);
        }
    }

    public void showStats()
            //displays a brief description of the card's effect
    {
        System.out.println(name + " allows a player to change the playable trump to the trump of "+ category + ".");
    }

    public void changeName(String newname)
            //changes the name of a card
    {
        name = newname;
    }

    public void changeCategory(String newcategory)
            //changes the category the card changes the playable trump too
    {
        switch(newcategory)
        {
            case "hardness":
                category = newcategory;
                break;
            case "specific gravity":
                category = newcategory;
                break;
            case "economic value":
                category = newcategory;
                break;
            case "crystal abundance":
                category = newcategory;
                break;
            case "cleavage":
                category = newcategory;
                break;
            default:
                System.out.println("The trump you entered was invalid, please enter a valid trump category:");
                Scanner newscanner = new Scanner(System.in);
                this.changeCategory(newscanner.nextLine());
        }
    }

    public String getName()
            //retrieves name of card
    {
        return name;
    }

    public String getCategory()
            //retrieves category the card will change the playable trump too
    {
        return category;
    }
}
