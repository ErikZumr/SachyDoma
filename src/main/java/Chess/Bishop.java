package Chess;

public class Bishop extends ChessPiece{

    public Bishop(int row, char column, String points){
        super(row,column,points);
    }
    public String toString(){
        return "B" + column + row + points;
    }

}
