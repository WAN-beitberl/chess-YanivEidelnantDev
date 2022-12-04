class Board{
    Piece GameBoard[][] = new Piece[8][8];
    String PlayerColor = "white";

    public void PrintBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(GameBoard[i][j] != null){
                    System.out.print(GameBoard[i][j].Symbol+ " ");
                }
                else{
                    System.out.print('-' + " ");
                }
            }
            System.out.println("");
        }
    }

    public Piece[][] GetBoard(){
        return GameBoard;
    }

    public void BoardInit(){
        // Define black
        for (int i = 0; i < 8; i++) {
            GameBoard[1][i] = new Pawn("black", "p"); 
        }

        for (int i = 0; i < 8; i+=7) {
            GameBoard[0][i] = new Rook("black", "r"); 
        }

        for (int i = 1; i < 7; i+=5) {
            GameBoard[0][i] = new Knight("black", "n"); 
        }

        for (int i = 2; i < 6; i+=3) {
            GameBoard[0][i] = new Bishop("black", "b"); 
        }

        GameBoard[0][4] = new King("black", "k"); 
        GameBoard[0][5] = new Queen("black", "q");

        // Define white
        for (int i = 0; i < 8; i++) {
            GameBoard[6][i] = new Pawn("white", "P"); 
        }
        for (int i = 0; i < 8; i+=7) {
            GameBoard[7][i] = new Rook("white", "R");
        }
        
        for (int i = 1; i < 7; i+=5) {
            GameBoard[7][i] = new Knight("white", "N"); 
        }

        for (int i = 2; i < 6; i+=3) {
            GameBoard[7][i] = new Bishop("white", "B"); 
        }

        GameBoard[7][4] = new King("white", "K"); 
        GameBoard[7][5] = new Queen("white", "Q");
    }

    public void ChangeTurn()
    {
        if (PlayerColor == "black") {
            PlayerColor = "white";
        }
        else{
            PlayerColor = "black";
        }
    }
}