import java.util.Scanner;

public class Basketball
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        // 1. ask for player 1 name
        String name1 = getName("Enter player one's name:>");

        // 2. ask for player 2 name
        String name2 = getName("Enter player two's name:>");

        // 3. ask for player 1's score using that player's name
        int score1 = getPlayerScore(name1);

        // 4. ask for player 2's score using that player's name
        int score2 = getPlayerScore(name2);


        // 5. print names and corresponding scores in alphabetical order
        String line1, line2;
        if(name1.compareTo(name2) < 0)
        {
            line1 = name1 + " scored " + score1 + " points";
            line2 = name2 + " scored " + score2 + " points";
        }
        else
        {
            line1 = name2 + " scored " + score2 + " points";
            line2 = name1 + " scored " + score1 + " points";
        }
        System.out.println(line1);
        System.out.println(line2);

        // 6. print the winner
        String winner;
        if(score1 > score2)
        {
            winner = name1;
        }
        else
        {
            winner = name2;
        }
        System.out.println(winner + " wins!");

        input.close();
    }



    private static String getName(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
    }

    private static int getPlayerScore(String name) {
        System.out.println("Enter " + name + "'s score:");
        return input.nextInt();
    }
}
