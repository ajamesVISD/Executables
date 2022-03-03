package org.vashonsd.Sudoku;

import org.vashonsd.Executable;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SudokuGame implements Executable {

    public static ArrayList<int[]> puzzle1 = new ArrayList<int[]>() {{
        add(new int[]{5, 6, 8, 3, 4, 2, 1, 9, 7});
        add(new int[]{2, 4, 7, 1, 9, 5, 8, 6, 3});
        add(new int[]{9, 1, 3, 6, 8, 7, 2, 5, 4});
        add(new int[]{6, 8, 5, 7, 3, 4, 2, 1, 9});
        add(new int[]{3, 1, 2, 9, 5, 8, 6, 7, 4});
        add(new int[]{4, 7, 9, 1, 6, 2, 5, 3, 8});
        add(new int[]{9, 2, 6, 4, 7, 3, 8, 5, 1});
        add(new int[]{7, 8, 1, 5, 2, 6, 4, 3, 9});
        add(new int[]{3, 4, 5, 8, 9, 1, 7, 2, 6});
        add(new int[]{1,2,2,4,5,6,6,7,7,8,9,9,9,1,3,4,5,5,6,6,7,7,8,9,1,1,2,2,3,3,3,4,5,6,7,9,9,9});
        add(new int[]{1,2,3,1,1,2,3,1,2,2,1,2,3,4,6,6,4,6,4,6,4,6,6,6,7,8,7,8,7,8,9,9,8,8,9,7,8,9});
    }};

    @Override
    public void start(InputStream is, PrintStream ps) {

        Scanner input = new Scanner(is);

        Board board = new Board(puzzle1);

        for (int i = 0; i < puzzle1.get(9).length; i++) { // This loop finds which cells are revealed and reveals them on the board
            board.initCell(puzzle1.get(9)[i], puzzle1.get(10)[i]);
            // System.out.println(puzzle1.get(9)[i] + ", " + puzzle.get(10)[i]);
            // ^ would print out coordinates if uncommented
        }

        ps.println(board);

        String guess;
        int x;
        int y;
        int num;
        boolean stillRunning = true;

        while (stillRunning) {
            ps.println("Insert the following: x-coordinate, y-coordinate, and number");
            guess = input.nextLine();
            if (guess.equals("exit")) {
                stillRunning = false;
            } else {
                String numbers = guess.replaceAll("[^0-9]", ""); // Thank you stackOverflow
                if (numbers.length() < 3) {
                    ps.println("You didn't use enough numbers");
                } else {
                    x = Integer.parseInt(numbers.substring(0, 1));
                    y = Integer.parseInt(numbers.substring(1, 2));
                    num = Integer.parseInt(numbers.substring(2));

                    if (!board.checkCell(x, y, num)) {
                        ps.println(board);
                        ps.println("That's the wrong number");
                    } else {
                        ps.println(board);
                        if (board.isFinished()) {
                            ps.println("Congrats! You Win!");
                            stillRunning = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Sudoku";
    }

    @Override
    public String getDescription() {
        return "A classic game of Sudoku";
    }

    @Override
    public String getAuthor() {
        return "BE";
    }
}
