import java.util.Random;
import java.util.Scanner;

public class Main {
    RockPaperScissor rockPaperScissor = new RockPaperScissor();
    public void RockPaperScissorGame() {
        Scanner scnr = new Scanner(System.in);
        char letter = 'y';
        while (letter == 'y')  {
            rockPaperScissor.RockPaperScissor();
            System.out.println("Type 'yes' to continue playing.");
            letter = scnr.next().toLowerCase().charAt(0);
        }
        System.out.println("Returning to Main Menu.");
    }
    public void TicTacToeGame() {
        new TicTacToe().TicTacToe();
    }
    public void mainLoop(){
        Scanner scnr = new Scanner(System.in);
        int selection = 0;
        while (selection != 3) {
            System.out.println(" 1 = Rock, Paper, Scissor");
            System.out.println(" 2 = Tic-Tac-Toe");
            System.out.println(" 3 = Exit Game");

            System.out.print("Please enter an option from 1 to 3...: ");
            try {
            selection = Integer.parseInt(scnr.nextLine());
                switch (selection) {
                    case 1 -> RockPaperScissorGame();
                    case 2 -> TicTacToeGame();
                    case 3 -> {return;}
                    default -> System.out.println("Invalid Selection. Please Select a valid option");
                }
            }catch (NumberFormatException e) {System.out.println("Please enter a valid numerical value");}
        }
    }

    public static void main(String[] args) {
            Main game = new Main();
            game.mainLoop();
    }
}