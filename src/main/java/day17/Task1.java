package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] chess = new String[8];
        ChessPiece pawn_w = ChessPiece.PAWN_WHITE;
        ChessPiece rock_b = ChessPiece.ROCK_BLACK;
        for (int i = 0; i < 4; i++) {
            chess[i] = pawn_w.getMarkPiece();
        }for (int i = 4; i < 8; i++) {
            chess[i] = rock_b.getMarkPiece();
        }

//        List<ChessPiece> chess = new ArrayList<>();
//        for(int i =0; i<4; i++){
//            chess.add(ChessPiece.PAWN_WHITE);
//        }
//        for(int i =0; i<4; i++){
//            chess.add(ChessPiece.ROCK_BLACK);
//        }
        System.out.println(Arrays.deepToString(chess));
    }
}