import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Player1 move (Rock/Paper/Scissor) or 'exit' to stop:");
            String player1 = obj1.nextLine().trim();

            if (player1.equalsIgnoreCase("exit")) {
                System.out.println("Game stopped.");
                break;
            }

            System.out.println("Enter Player2 move (Rock/Paper/Scissor) or 'exit' to stop:");
            String player2 = obj1.nextLine().trim();

            if (player2.equalsIgnoreCase("exit")) {
                System.out.println("Game stopped.");
                break;
            }

            
            if ((!player1.equalsIgnoreCase("Rock") &&
                 !player1.equalsIgnoreCase("Paper") &&
                 !player1.equalsIgnoreCase("Scissor")) ||
                (!player2.equalsIgnoreCase("Rock") &&
                 !player2.equalsIgnoreCase("Paper") &&
                 !player2.equalsIgnoreCase("Scissor"))) {

                System.out.println("Invalid input");
                continue;
            }

          
            if (player1.equalsIgnoreCase(player2)) {
                System.out.println("Draw");
            }
            else if (player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("Scissor") ||
                     player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Rock") ||
                     player1.equalsIgnoreCase("Scissor") && player2.equalsIgnoreCase("Paper")) {
                System.out.println("Player1 Wins");
            }
            else {
                System.out.println("Player2 Wins");
            }
        }

        obj1.close();
    }
}
