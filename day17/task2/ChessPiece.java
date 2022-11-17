package day17.task2;

public enum ChessPiece {
    KING_BLACK(100,"♚"),QUEEN_BLACK(9,"♛"),ROOK_BLACK(5,"♜"),
    BISHOP_BLACK(3.5,"♝"),KNIGHT_BLACK(3,"♞"),PAWN_BLACK(1,"♟"),

    KING_WHITE(100,"♔"),QUEEN_WHITE(9,"♕"),ROOK_WHITE(5,"♖"),
    BISHOP_WHITE(3.5,"♗"),KNIGHT_WHITE(3,"♘"),PAWN_WHITE(1,"♙"),
    EMPTY(-1,"_");
    private double importance;
    private String representation;

    ChessPiece(double importance, String representation) {
        this.importance = importance;
        this.representation = representation;
    }

    public double getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }
}
