package Chess;

public class Queen extends ChessPiece {

    public Queen(int row, char column, String points){
        super(row, column, points);
    }
    public String toString(){
        return "Q" + column + row + points;
    }
}

