public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (color.equals("White")) {
            return (line == 1 && toLine == 3 && column == toColumn) || (toLine == line + 1 && column == toColumn);
        } else {
            return (line == 6 && toLine == 4 && column == toColumn) || (toLine == line - 1 && column == toColumn);
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
