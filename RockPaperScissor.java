import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;
public class RockPaperScissor {
    String[] choices = new String[]{"rock", "paper", "scissor"};


    public void RockPaperScissor() {
        System.out.print("rock, paper, scissors?: ");
        Scanner scnr = new Scanner(System.in);
        String playerChoice = scnr.nextLine().toLowerCase();
        int random = new Random().nextInt(choices.length);

        if (isValid(playerChoice)) {
            if (playerChoice.equals(choices[random])) {
                System.out.println("Computer: " + choices[random] + "\nPlayer: " + playerChoice);
                System.out.println("Everyone wins\n");
            } else if (playerChoice.equals("rock") && choices[random].equals("scissor") ||
                    playerChoice.equals("scissor") && choices[random].equals("paper")) {
                System.out.println("Computer: " + choices[random] + "\nPlayer: " + playerChoice);
                System.out.println("Player wins\n");
            } else if (!playerChoice.equals("rock") && choices[random].equals("scissor") ||
                    !playerChoice.equals("scissor") && choices[random].equals("paper")) {
                System.out.println("Computer: " + choices[random] + "\nPlayer: " + playerChoice);
                System.out.println("Computer wins\n");
            }
        } else {
            System.out.println("Please enter a valid entry. Returning to Main Menu");
        }
    }
    public boolean isValid(String choice) {
        return choice.equals("rock") || choice.equals("paper") ||
                choice.equals("scissors");
    }
}
