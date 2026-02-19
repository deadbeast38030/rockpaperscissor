import java.util.*;
import java.util.Random;

public class rock_paper_scissor 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int user_score = 0;
        int comp_score = 0;

        System.out.println("WELCOME TO ROCK PAPER SCISSOR");

        for (int i = 1; i <= 5; i++)
        {

            System.out.println("\nRound " + i);
            System.out.println("Enter 0 = Rock, 1 = Paper, 2 = Scissor");

            int userinput = sc.nextInt();

            if (userinput < 0 || userinput > 2) 
            {
                System.out.println("Invalid Input");
                i--;
                continue;
            }

            int botinput = rand.nextInt(3);

            String[] choice = {"Rock", "Paper", "Scissor"};

            System.out.println("Computer chose: " + choice[botinput]);

            if (userinput == botinput)
            {
                System.out.println("Match Draw");
            }
            else if ((userinput == 0 && botinput == 2) ||(userinput == 1 && botinput == 0) ||(userinput == 2 && botinput == 1)) 
            {

                System.out.println("User wins");
                user_score++;
            }
            else 
            {
                System.out.println("Computer wins");
                comp_score++;
            }
        }

        System.out.println("\nFinal Score");
        System.out.println("User: " + user_score);
        System.out.println("Computer: " + comp_score);

        if (user_score > comp_score)
        {
            System.out.println("You are Winner!");
        }
        else if (comp_score > user_score)
        {
            System.out.println("Computer wins!");
        }
        else 
        {
            System.out.println("It's a Tie");
        }

        sc.close();
    }
}
