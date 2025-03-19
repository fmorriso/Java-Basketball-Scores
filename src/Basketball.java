import java.util.Scanner;

public class Basketball
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Ask for player 1 name
        String name1 = getName("Enter player one's name:>");

        // Ask for player 1's score using that player's name
        int score1 = getPlayerScore(name1);

        // Ask for player 2 name
        String name2 = getName("Enter player two's name:>");

        // Ask for player 2's score using that player's name
        int score2 = getPlayerScore(name2);

        // Print names and corresponding scores in alphabetical order
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
        System.out.print(prompt);
        return input.nextLine();
    }

    private static int getPlayerScore(String name) {
        System.out.print("Enter " + name + "'s score:>");
        int n = input.nextInt();
        input.nextLine();
        return n;
    }
}
