public class ChessBoard {
    public ChessPiece[][] board = new ChessPiece[8][8];
    public String nowPlayer;

    public ChessBoard(String nowPlayer) {
        this.nowPlayer = nowPlayer;
    }

    public String nowPlayerColor() {
        return this.nowPlayer;
    }

    public boolean moveToPosition(int startLine, int startColumn, int endLine, int endColumn) {
        if (checkPos(startLine) && checkPos(startColumn)) {

            if (!nowPlayer.equals(board[startLine][startColumn].getColor())) return false;

            if (board[startLine][startColumn].canMoveToPosition(this, startLine, startColumn, endLine, endColumn)) {
                board[endLine][endColumn] = board[startLine][startColumn];
                board[startLine][startColumn] = null;
                this.nowPlayer = this.nowPlayerColor().equals("White") ? "Black" : "White";
                return true;
            }
        }
        return false;
    }

    public void printBoard() {
        System.out.println("Turn: " + nowPlayer);
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".. ");
                } else {
                    System.out.print(board[i][j].getSymbol() + board[i][j].getColor().charAt(0) + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos < 8;
    }
}
