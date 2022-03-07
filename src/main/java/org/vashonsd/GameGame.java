package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GameGame implements Executable {
    @Override
    public void start(InputStream is, PrintStream ps) {
    Scanner scan = new Scanner(is);
    int num = (int) (Math.random() * 10.0D + 1.0D);
    int userGuess = -1;
    int userGuesses = 0;
        while (userGuess != num) {
            ps.println("Guess a number from 1 to 10:");
            userGuess = scan.nextInt();
            if (userGuess > num) {
                ps.println("The number is too big!");
                userGuesses++;
            } else if (userGuess < num) {
                ps.println("The number is too small!");
                userGuesses++;
            }
        }
        ps.println("Congratulations.");
    }

    @Override
    public String getName() {
        return "Guessing";
    }

    @Override
    public String getDescription() {
        return "A game where you have to guess a number from 1-10. Easier version of the typical 1-100.";
    }

    @Override
    public String getAuthor() {
        return "JTB";
    }
}
