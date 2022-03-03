package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors implements Executable {

        private String name;

        private String description;

        private String author;

    @Override
    public void start(InputStream is, PrintStream ps) {

                Random rand = new Random();

                Scanner input = new Scanner(is);
                boolean gameContinue = false;
                int num = 0;
                String playerOne;
                String playerTwo;
                String continuePlaying;

                ps.println("Computer or two player?");
                String gameVersion = input.nextLine();

                if (gameVersion.equals("Computer") || gameVersion.equals("C") || gameVersion.equals("computer") || gameVersion.equals("Comp")) {
                    do {

                        gameContinue = false;

                        num = rand.nextInt(3) + 1;
                        ps.println("Rock, Paper or Scissors");
                        String userInput = input.nextLine();

                        if (userInput.equals("Rock") || userInput.equals("r") || userInput.equals("rock")) {
                            if (num == 1) {
                                ps.println("Player: Rock | Computer: Rock");
                                ps.println("It's a tie!");
                            } else if (num == 2) {
                                ps.println("Player: Rock | Computer: Paper");
                                ps.println("Computer Wins!");
                            } else {
                                ps.println("Player: Rock | Computer: Scissors");
                                ;
                                ps.println("Player Wins!");
                            }
                        } else if (userInput.equals("Paper") || userInput.equals("paper") || userInput.equals("p")) {
                            if (num == 1) {
                                ps.println("Player: Paper | Computer: Rock");
                                ps.println("Player Wins!");
                            } else if (num == 2) {
                                ps.println("Player: Paper | Computer: Paper");
                                ps.println("It's a tie!");
                            } else {
                                ps.println("Player: Paper | Computer: Scissors");
                                ps.println("Computer Wins!");
                            }
                        } else {
                            if (num == 1) {
                                ps.println("Player: Scissors | Computer: Rock");
                                ps.println("Computer Wins!");
                            } else if (num == 2) {
                                ps.println("Player: Scissors | Computer: Paper");
                                ps.println("Player Wins!");
                            } else {
                                ps.println("Player: Scissors | Computer: Scissors");
                                ps.println("It's a tie!");
                            }
                        }

                        ps.println("Do you want to keep playing?");
                        continuePlaying = input.nextLine();

                        if (continuePlaying.equals("yes") && continuePlaying.equals("y")) {
                            gameContinue = true;
                        }
                        else {
                            break;
                        }
                    } while (gameContinue = true);
                } else {
                    do {
                        gameContinue = false;
                        ps.println("Player one type Rock, Paper or Scissors");
                        playerOne = input.nextLine();
                        ps.println("Player two type Rock, Paper or Scissors");
                        playerTwo = input.nextLine();
                        if (playerOne.equals(playerTwo)) {
                            ps.println("Its a tie");
                        } else if (playerOne.equals("Rock") && playerTwo.equals("Paper")) {
                            ps.println("Player Two wins");
                        } else if (playerOne.equals("Paper") && playerTwo.equals("Rock")) {
                            ps.println("Player One wins");
                        } else if (playerOne.equals("Paper") && playerTwo.equals("Scissors")) {
                            ps.println("Player Two wins");
                        }
                        else if (playerOne.equals("Scissors") && playerTwo.equals("Paper")) {
                            ps.println("Player One wins");
                        }
                        else if (playerOne.equals("Rock") && playerTwo.equals("Scissors")) {
                            ps.println("Player One wins");
                        } else if (playerOne.equals("Scissors") && playerTwo.equals("Rock")) {
                            ps.println("Player Two wins");
                        }
                        ps.println("Do you want to keep playing?");
                        continuePlaying = input.nextLine();
                        if (continuePlaying.equals("Yes") && continuePlaying.equals("y")) {
                            gameContinue = true;
                        }
                        else {
                            break;
                        }
                    } while (gameContinue = true);
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
