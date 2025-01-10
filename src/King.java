public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (Math.abs(line - toLine) <= 1 && Math.abs(column - toColumn) <= 1) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
