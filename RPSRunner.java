import java.util.Scanner;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response;

        do {
            System.out.print("type in your prompt [R,P,S] : ");
            String player = keyboard.nextLine().toUpperCase();

            RockPaperScissors game = new RockPaperScissors(player);
            System.out.println(game.toString());

            System.out.print("Do you want to play again? (y/n): ");
            response = keyboard.nextLine().toLowerCase().charAt(0);

        } while (response == 'y');

        keyboard.close();
    }
}
