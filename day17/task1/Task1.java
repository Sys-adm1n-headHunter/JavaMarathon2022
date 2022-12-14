package day17.task1;

/* SAI
1. Создайте Enum “Шахматная фигура” (англ. ChessPiece).
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ.
queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
● Ценность фигуры - вещественное число
● Строковое обозначение фигуры
В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия
фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое
обозначение.

Используя созданный enum, в методе main() класса Task1 создайте массив,
содержащий 4 белых пешки и 4 черных ладьи. Выведите содержимое этого массива
на экран, используя строковые обозначения шахматных фигур.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
       ChessPiece[] chessPieces = {
               ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
               ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
           };

        for (ChessPiece chessPiece: chessPieces) {
            System.out.print(chessPiece.getRepresentation() + " ");
        }
    }

}
