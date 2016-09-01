/**
 * Created by Matt on 8/24/16.
 */
public class BasicCard
    //this should serve as the template for all basic cards, supertrump cards will have their own class
    //contains constructors as well as a function to print the values of a card (see showStats)
    //also contains functions to transform the category string values into number values and back
{
    String name;
    double hardness,specific_gravity;
    byte crystal_abundance, economic_value, cleavage;

    public BasicCard()
            //basic constructor, creates an essentially worthless card (all lowest values)
    {
        name = "Unnamed_Mineral";
        hardness = 0;
        specific_gravity = 0;
        cleavage = 0;
        // in string form cleavage is referred to as cleave
        crystal_abundance = 0;
        // in string form crystal abundance is referred to as rarity
        economic_value = 0;
        // in string form economic value is referred to as price
    }

    public BasicCard(String newname, double input_h, double input_sg, String cv, String ca, String ev)
            //constructor: accepts numbers for hardness and specific gravity and accepts strings for cleavage, abundance, and econ
    {
        name = newname;
        hardness = input_h;
        if (input_h < 1 || input_h > 10)
        {
            System.out.println("Hardness must be between 1 and 10 based on Moh's hardness scale.");
            System.out.println("Hardness set to 1 by default.");
            hardness = 1;
        }
        specific_gravity = input_sg;
        cleavage = CleaveToCleavage(cv);
        crystal_abundance = RarityToAbundance(ca);
        economic_value = PriceToEconomicValue(ev);
    }

    public void showStats()
            //shows the hardness, specific gravity, cleavage, crystal abundance, and economic value of a card
    {
        String cv,ca,ev;
        cv = CleavageToCleave(cleavage);
        ca = AbundanceToRarity(crystal_abundance);
        ev = EconomicValueToPrice(economic_value);
        System.out.println("The stats of " + name + " are as follows: hardness is " + hardness +
                ", specific gravity is " + specific_gravity + ", cleavage is " +
                cv + ", crystal abundance is " + ca + ", and economic value is " + ev + ".");
    }

    public byte CleaveToCleavage(String cleave)
            //converts cleavage string value into a numerical value
    {
        switch(cleave)
        {
            case "none":
                cleavage = 0;
                break;
            case "poor/none":
                cleavage = 1;
                break;
            case "1 poor":
                cleavage = 2;
                break;
            case "2 poor":
                cleavage = 3;
                break;
            case "1 good":
                cleavage = 4;
                break;
            case "1 good, 1 poor":
                cleavage = 5;
                break;
            case "2 good":
                cleavage = 6;
                break;
            case "3 good":
                cleavage = 7;
                break;
            case "1 perfect":
                cleavage = 8;
                break;
            case "1 perfect, 1 good":
                cleavage = 9;
                break;
            case "1 perfect, 2 good":
                cleavage = 10;
                break;
            case "2 perfect, 1 good":
                cleavage = 11;
                break;
            case "3 perfect":
                cleavage = 12;
                break;
            case "4 perfect":
                cleavage = 13;
                break;
            case "6 perfect":
                cleavage = 14;
                break;
            default:
                System.out.println("Cleavage unclear.");
                System.out.println("Cleavage set to none by default.");
                cleavage = 0;
                break;
        }
        return cleavage;
    }

    public String CleavageToCleave(byte cleavage)
            //converts cleavage numerical value into a string value
    {
        String cleave="";
        switch(cleavage)
        {
            case 0:
                cleave = "none";
                break;
            case 1:
                cleave = "poor/none";
                break;
            case 2:
                cleave = "1 poor";
                break;
            case 3:
                cleave = "2 poor";
                break;
            case 4:
                cleave = "1 good";
                break;
            case 5:
                cleave = "1 good, 1 poor";
                break;
            case 6:
                cleave = "2 good";
                break;
            case 7:
                cleave = "3 good";
                break;
            case 8:
                cleave = "1 perfect";
                break;
            case 9:
                cleave = "1 perfect, 1 good";
                break;
            case 10:
                cleave = "1 perfect, 2 good";
                break;
            case 11:
                cleave = "2 perfect, 1 good";
                break;
            case 12:
                cleave = "3 perfect";
                break;
            case 13:
                cleave = "4 perfect";
                break;
            case 14:
                cleave = "6 perfect";
                break;
            default:
                System.out.println("Error in cleavage value.");
                System.out.println("Cleave set to 'none' by default.");
                break;
        }
        return cleave;
    }

    public byte RarityToAbundance(String rarity)
            //converts crystal abundance string value into a numerical value
    {
        byte ca=7;
        switch(rarity)
        {
            case "ultratrace":
                ca = 0;
                break;
            case "trace":
                ca = 1;
                break;
            case "low":
                ca = 2;
                break;
            case "moderate":
                ca = 3;
                break;
            case "high":
                ca = 4;
                break;
            case "very high":
                break;
            default:
                System.out.println("Crystal abundance unclear.");
                System.out.println("Crystal abundance set to ultratrace by default.");
                ca = 0;
                break;
        }
        return ca;
    }

    public String AbundanceToRarity(byte crystal_abundance)
            //converts crystal abundance numerical value into a string value
    {
        String rarity = "";
        switch(crystal_abundance)
        {
            case 0:
                rarity = "ultratrace";
                break;
            case 1:
                rarity = "trace";
                break;
            case 2:
                rarity = "low";
                break;
            case 3:
                rarity = "moderate";
                break;
            case 4:
                rarity = "high";
                break;
            case 5:
                rarity = "very high";
                break;
            default:
                System.out.println("Crystal Abundance unclear.");
                System.out.println("Crystal Abundance set to ultratrace by default.");
                rarity = "ultratrace";
                break;
        }
        return rarity;
    }

    public byte PriceToEconomicValue(String price)
            //converts economic value string value into a numerical value
    {
        byte ev;
        switch(price)
        {
            case "trivial":
                ev = 0;
                break;
            case "low":
                ev = 1;
                break;
            case "moderate":
                ev = 2;
                break;
            case "high":
                ev = 3;
                break;
            case "very high":
                ev = 4;
                break;
            case "I'm rich!":
                ev = 5;
                break;
            default:
                System.out.println("Economic value unclear.");
                System.out.println("Economic value set to trivial by default.");
                ev = 0;
                break;
        }
        return ev;
    }

    public String EconomicValueToPrice(byte economic_value)
            //converts economoic value string value into a numerical value
    {
        String price = "";
        switch(economic_value)
        {
            case 0:
                price = "trivial";
                break;
            case 1:
                price = "low";
                break;
            case 2:
                price = "moderate";
                break;
            case 3:
                price = "high";
                break;
            case 4:
                price = "very high";
                break;
            case 5:
                price = "I'm rich!";
                break;
            default:
                System.out.println("Economic value is unclear.");
                System.out.println("Economic value set to trivial by default.");
                price = "trivial";
        }
        return price;
    }
}
