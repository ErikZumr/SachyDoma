package Chess;

public class Tower extends ChessPiece {

    public Tower(int row, char column, String points) {
        super(row, column, points);
    }
    public String toString(){
        return "T" + column + row + points;
    }
}
