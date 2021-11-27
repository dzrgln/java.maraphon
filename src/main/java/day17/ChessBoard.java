package day17;

import java.util.Arrays;

public class ChessBoard {
    public static String[][] strings = new String[8][8];

    public ChessBoard(String[][] strings) {
        this.strings = strings;
    }

    public static void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(strings[i][j]);
            }
            System.out.println();
        }
    }


}
