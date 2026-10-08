package Chess;

public class King extends ChessPiece{
    public King(int row, char column, String points){
        super(row, column, points);
    }
    public String toString(){
        return "K" + column + row + points;
    }
}
