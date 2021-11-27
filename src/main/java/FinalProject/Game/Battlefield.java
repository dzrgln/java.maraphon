package FinalProject.Game;

import FinalProject.MarksOfCells;

import java.util.Arrays;

public class Battlefield{
    //Calling marks of cells
    MarksOfCells empty = MarksOfCells.MARK_EMPTY;
    MarksOfCells oreol = MarksOfCells.MARK_OREOL;
    MarksOfCells shot = MarksOfCells.MARK_SHOT;
    MarksOfCells ship = MarksOfCells.MARK_SHIP;

    String[][] battlefield = new String[12][12];

    public Battlefield() {
        fillBattlefield();
    }

    public void fillBattlefield() {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                battlefield[i][j] = empty.getP();
            }
        }
    }

    public String[][] getBattlefield() {
        return battlefield;
    }

    public void printBattlefield() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(battlefield[i][j]);
            }
            System.out.println();
        }
    }

    public String toString() {
        return Arrays.deepToString(battlefield);
    }
}