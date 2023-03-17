package domain.piece;

import domain.chessboard.SquareStatus;
import domain.chessboard.Type;
import domain.coordinate.Position;
import domain.coordinate.Route;

public abstract class Piece implements SquareStatus {

    protected final Color color;
    protected final PieceType pieceType;

    public Piece(final Color color, final PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
    }

    @Override
    public abstract Route findRoute(final Position source, final Position target);

    @Override
    public final Type getType() {
        return pieceType;
    }

    @Override
    public final Color getColor() {
        return color;
    }

    protected final void validateMovable(final Position source, final Position target) {
        if (isMovable(source, target)) {
            return;
        }
        throw new IllegalStateException("잘못된 도착 지점입니다.");
    }

    protected abstract boolean isMovable(final Position source, final Position target);

}
