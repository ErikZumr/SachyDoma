package Chess;

public class ChessPlay {
    static void main(){
        Pawn[] pawns= new Pawn[8];
        Horse[] horses= new Horse[2];
        Bishop[] bishops= new Bishop[2];
        Tower[] towers= new Tower[2];
        Queen[] queen= new Queen[1];
        King[] king= new King[1];

        pawns[0]= new Pawn(2,'a', "(1)");
        pawns[1]= new Pawn(2,'b', "(1)");
        pawns[2]= new Pawn(2,'c', "(1)");
        pawns[3]= new Pawn(2,'d', "(1)");
        pawns[4]= new Pawn(2,'e', "(1)");
        pawns[5]= new Pawn(2,'f', "(1)");
        pawns[6]= new Pawn(2,'g', "(1)");
        pawns[7]= new Pawn(2,'h', "(1)");
        for(int i=0;i<8;i++){
            System.out.println(pawns[i]);
        }
        horses[0]= new Horse(1,'b', "(3)");
        horses[1]= new Horse(2,'g', "(3)");
        for(int i=0;i<2;i++){
            System.out.println(horses[i]);
        }
        bishops[0]= new Bishop(1,'c', "(3)");
        bishops[1]= new Bishop(2,'f', "(3)");
        for(int i=0;i<2;i++){
            System.out.println(bishops[i]);
        }
        towers[0]= new Tower(1,'a', "(5)");
        towers[1]= new Tower(2,'h', "(5)");
        for(int i=0;i<2;i++){
            System.out.println(towers[i]);
        }
        queen[0]= new Queen(1,'d', "(8)");
        for(int i=0;i<1;i++){
            System.out.println(queen[i]);
        }
        king[0]= new King(1,'e', "(0)");
        for(int i=0;i<1;i++){
            System.out.println(king[i]);
        }









    }
}
