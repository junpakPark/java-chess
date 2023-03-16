package domain.piece;

import domain.coordinate.Position;
import domain.coordinate.Route;

public class Rook extends Piece {

    public Rook(final Color color) {
        super(color);
    }

    @Override
    public Route findRoute(final Position source, final Position target) {
        return null;
    }
}
