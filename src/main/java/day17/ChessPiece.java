package day17;

public enum ChessPiece {
    KINGS_WHITE(100, "♔"), QUEEN_WHITE(9,"♕"), ROCK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KINGS_BLACK(100, "♚"), QUEEN_BLACK(9,"♛"), ROCK_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");
    private double valuePiece;
    private String markPiece;

    ChessPiece(double valuePiece, String markPiece) {
        this.valuePiece = valuePiece;
        this.markPiece = markPiece;
    }

    public double getValuePiece() {
        return valuePiece;
    }

    public String getMarkPiece() {
        return markPiece;
    }

    @Override
    public String toString() {
        return markPiece;
    }
}
