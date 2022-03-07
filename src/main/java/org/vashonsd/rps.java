package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class rps implements Executable{


    @Override
    public void start(InputStream is, PrintStream ps) {
        int roll = (int) (Math.random()*(3)+1);
        Scanner input = new Scanner(is);
        String computer = "";
        if(roll == 1){
            computer = "Rock";
        }
        if(roll == 2){
            computer = "Paper";
        }
        if(roll == 3){
            computer = "Scissors";
        }

        ps.println("Rock = 1, Paper = 2, Scissors = 3");
        ps.println("Put in your choice");
        int userGuess = input.nextInt();
        ps.println("Computer picks " + roll);
        if(userGuess == 1 && roll == 1 || userGuess == 2 && roll == 2 || userGuess == 3 && roll == 3){
            ps.println("it's a draw!");

        }
        if(userGuess == 1 && roll == 2){
            ps.println("Paper beats rock");
            ps.println("COMPUTER WINS, YOU LOSE");
        }
        if(userGuess == 1 && roll == 3){
            ps.println("Rock beats scissors");
            ps.println("YOU WIN");
        }
        if(userGuess == 2 && roll == 1 ){
            ps.println("Paper beats rock ");
            ps.println("YOU WIN");

        }
        if(userGuess == 2 && roll == 3){
            ps.println("Scissors beats paper");
            ps.println("COMPUTER WINS, YOU LOSE");
        }
        if(userGuess == 3 && roll == 1){
            ps.println("Rock beats scissors");
            ps.println("COMPUTER WINS, YOU LOSE");
        }
        if(userGuess == 3 && roll == 2 ){
            ps.println("Scissors beats paper");
            ps.println("YOU WIN");

        }
        else{

        }

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }
}
