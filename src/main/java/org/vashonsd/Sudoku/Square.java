package org.vashonsd.Sudoku;

import java.util.ArrayList;

/*
 * [   |   |   ]
 * [   |   |   ]
 * [   |   |   ]
 */
public class Square {

    ArrayList<Cell> cells = new ArrayList<>();

    public Square(int[] cellValue) {
        for (int i = 0; i < 9; i++) {
            cells.add(new Cell(cellValue[i], false));
        }
    }

    public String getRow(int row) {
        String result = "[ ";
        for (int i = 0; i < 3; i++) { // I HAVE HARNESSED THE POWER OF FOUR FOR LOOPS, 3^4 = 81 Cells
            result = result.concat(cells.get(i + (3 * row)).toString());
            if (i != 2) {
                result = result.concat(" | ");
            } else {
                result = result.concat(" ] ");
            }
        }
        return result;
    }

    public void revealCell(int cell) {
        cells.get(cell).show();
    }

    public boolean guessCell(int cell, int guess) {
        return cells.get(cell).isCorrect(guess);
    }
}
