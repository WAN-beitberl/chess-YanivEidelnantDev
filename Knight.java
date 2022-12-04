class Knight extends Piece {
    
    public Knight(String Color, char Symbol){
        this.Color = Color;
        this.Symbol = Symbol;
    }

    public void MovePiece(int x1, int y1, int x2, int y2)
    {
        Board BoardClass = new Board();
        Piece[][] GameBoard = BoardClass.GetBoard();

        int NewX = abs(x2-x1);
        int NewY = abs(y2-y1);
        
    }
}