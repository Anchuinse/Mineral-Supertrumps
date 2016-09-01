/**
 * Created by Matt on 9/1/16.
 */
import java.util.*;
public class Game
{
    int who_turn;
    String current_category;
    double current_value;

    public Game()
            //constructor: asks for number of players
    {
        int playernumber = askForPlayers();
        Player[] players = new Player[playernumber];
        for (int i=0; i<playernumber; ++i)
        {
            int number=i+1;
            System.out.println("What is the name of Player " + number +"?");
            Scanner scanner = new Scanner(System.in);
            String inputname = scanner.nextLine();
            players[i] = new Player(number, inputname);
        }
        Random generator = new Random();
        who_turn = generator.nextInt(playernumber-1) + 1;
        /*  Then I'll have to set the current_category to effectively null.
            Finally I'll have to set the current_value to effectively null.
             */
    }

    public int askForPlayers()
            //this method is an easy way to ask about the number of players needed in a game
            //it will correct until the value put in is either 3, 4, or 5
    {
        int returnvalue=0;
        System.out.println("Are there 3, 4, or 5 players?");
        Scanner scanner = new Scanner(System.in);
        int numberofplayers = scanner.nextInt();
        switch (numberofplayers)
        {
            case 3:
                returnvalue = 3;
            case 4:
                returnvalue = 4;
            case 5:
                returnvalue = 5;
            default:
                System.out.println("I'm sorry, that was unclear. Please only enter numbers 3, 4, or 5.");
                askForPlayers();
        }
        return returnvalue;
    }
}
