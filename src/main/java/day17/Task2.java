package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece empty = ChessPiece.EMPTY;
        //White piece
        ChessPiece pawn_w = ChessPiece.PAWN_WHITE;
        ChessPiece knight_w = ChessPiece.KINGS_WHITE;
        ChessPiece bishop_w = ChessPiece.BISHOP_WHITE;
        ChessPiece rock_w = ChessPiece.ROCK_WHITE;
        ChessPiece queen_w = ChessPiece.QUEEN_WHITE;
        ChessPiece king_w = ChessPiece.KINGS_WHITE;
        //Black piece
        ChessPiece pawn_b = ChessPiece.PAWN_BLACK;
        ChessPiece knight_b = ChessPiece.KNIGHT_BLACK;
        ChessPiece bishop_b = ChessPiece.BISHOP_BLACK;
        ChessPiece rock_b = ChessPiece.ROCK_BLACK;
        ChessPiece queen_b = ChessPiece.QUEEN_BLACK;
        ChessPiece king_b = ChessPiece.KINGS_BLACK;

        String[][] table = new String[8][8];
        ChessBoard chessBoard = new ChessBoard(table);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = empty.getMarkPiece();
            }

        }
        table[0][0] = table[0][5] = rock_b.getMarkPiece();
        table[0][6] = king_b.getMarkPiece();
        table[1][1] = table[5][4] = rock_w.getMarkPiece();
        table[1][4] = table[1][5] = table[1][7] = table[2][0] = table[2][6] = pawn_b.getMarkPiece();
        table[3][0] = queen_b.getMarkPiece();
        table[2][2] = knight_b.getMarkPiece();
        table[3][3] = table[5][4] = bishop_w.getMarkPiece();
        table[4][3] = bishop_b.getMarkPiece();
        table[4][4] = table[5][5] = table[6][0] = table[6][5] = table[6][7] = pawn_w.getMarkPiece();
        table[6][3] = queen_w.getMarkPiece();
        table[7][5] = rock_w.getMarkPiece();
        table[7][6] = king_w.getMarkPiece();

        chessBoard.print();
    }
}
