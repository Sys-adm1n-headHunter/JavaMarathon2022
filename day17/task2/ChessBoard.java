package day17.task2;

public class ChessBoard {
    ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print(){
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getRepresentation());
            }
            System.out.println();
        }
    }
}
