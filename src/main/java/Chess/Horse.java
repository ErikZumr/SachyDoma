package Chess;

public class Horse extends ChessPiece{

    public Horse(int row, char column,String points){
        super(row, column, points);
    }
    public String toString(){
        return "H" + column + row + points;
    }
}
