package Hangman;

import java.util.Scanner;

public class Hangman {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a title: %n");
        Game game = new Game(scanner.nextLine());
        Prompter prompter = new Prompter(game);
        
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayOutcome();
    }
}