package Chess;

public class Pawn extends ChessPiece {

    public Pawn(int row, char column, String points) {
        super(row, column, points);
    }
    public String toString(){
        return "P" + column+ row + points;
    }





}
