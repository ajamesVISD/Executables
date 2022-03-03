package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class twentyQuestoins implements Executable {
   int answer = 5;
    @Override
    public void start(InputStream is, PrintStream ps) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gess a number between 1 and 100");
        int userResponce = 0;
        while (!(userResponce == answer))
        {
            userResponce = scan.nextInt();
            if (userResponce < answer) {
                System.out.println("no it is more");
            }
            if (userResponce > answer) {
                System.out.println("no it is less");
            }
        }
        System.out.print("you got it");
    }

    @Override
    public String getName() {
        return "20 questions";
    }

    @Override
    public String getDescription() {
        return "play 20 questions";
    }

    @Override
    public String getAuthor() {
        return "bishop";
    }
}
