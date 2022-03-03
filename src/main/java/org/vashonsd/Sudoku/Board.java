package org.vashonsd.Sudoku;

/*
 * System.out.println("9 [   | 2 |   ] [   | 5 |   ] [   |   |   ]");
 * System.out.println("8 [ 1 |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("7 [   |   |   ] [   |   |   ] [   | 9 |   ]");
 * System.out.println("  [ - + - + - ] [ - + - + - ] [ - + - + - ]");
 * System.out.println("6 [ 3 |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("5 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("4 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("  [ - + - + - ] [ - + - + - ] [ - + - + - ]"); Example Board
 * System.out.println("3 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("2 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("1 [   |   |   ] [   |   |   ] [   |   |   ]");
 * System.out.println("    1   2   3     4   5   6     7   8   9");
 */

import java.util.ArrayList;

public class Board {

    ArrayList<Square> squares = new ArrayList<>();
    int cellsRevealed;

    public Board(ArrayList<int[]> squares) {
        for (int i = 0; i < 9; i++) {
            this.squares.add(new Square(squares.get(i)));
        }
    }

    public void initCell(int x, int y) {
        int square = findSquare(x, y);
        int cell = findCell(x, y);
        squares.get(square).revealCell(cell);
        cellsRevealed++;
    }

    public boolean checkCell(int x, int y, int guess) {
        int square = findSquare(x, y);
        int cell = findCell(x, y);
        if (squares.get(square).guessCell(cell, guess)) {
            cellsRevealed++;
            return true;
        }
        return false;
    }

    public int findSquare(int x, int y) {

        y--;
        x--;

        int squareX = (x / 3);
        int squareY = 2 - (y / 3);
        return (squareY * 3) + squareX;
    }

    public int findCell(int x, int y) {

        y--;
        x--;

        int cellX = x % 3;
        int cellY = 2 - y % 3;
        return (cellY * 3) + cellX;
    }

    public boolean isFinished() {
        return cellsRevealed == 81;
    }

    public String toString() {
        String result = "";
        for (int squareRow = 0; squareRow < 3; squareRow++) {
            for (int row = 0; row < 3; row++) {
                result = result.concat((9 - row - (squareRow * 3)) + " ");
                for (int i = 0; i < 3; i++) { // This may be stupid
                    result = result.concat(squares.get(i + (3 * squareRow)).getRow(row));
                }
                result = result.concat("\n");
            }
            if (squareRow!= 2) {
                result = result.concat("  [ - + - + - ] [ - + - + - ] [ - + - + - ]\n");
            }
        }
        result = result.concat("    1   2   3     4   5   6     7   8   9");
        return result;
    }
}
