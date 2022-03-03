package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class NicksFirstExecutable implements Executable {
    @Override
    public void start(InputStream is, PrintStream ps) {
ps.println("Guess the number 0-5.");
Random randomizer = new Random();
int correctNumber = randomizer.nextInt(0, 5);
Scanner scan = new Scanner(System.in);
int yourNumber = scan.nextInt();
if (yourNumber == correctNumber){
    System.out.println("That's it!");
}else {
    System.out.println("That's not it >:C");
}
    }

    @Override
    public String getName() {
        return "Guess the number";
    }

    @Override
    public String getDescription() {
        return "Guess the computers number that is between 0 and 5";
    }

    @Override
    public String getAuthor() {
        return "Nick";
    }
}
