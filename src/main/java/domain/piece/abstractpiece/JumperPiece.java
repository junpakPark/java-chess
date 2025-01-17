package domain.piece.abstractpiece;

import domain.piece.Color;
import domain.position.Position;
import domain.position.Route;
import domain.squarestatus.Piece;
import domain.type.PieceType;

import java.util.Collections;

public abstract class JumperPiece extends Piece {

    protected JumperPiece(final Color color, final PieceType pieceType) {
        super(color, pieceType);
    }

    @Override
    public final Route findRoute(final Position source, final Position target) {
        validateMovable(source, target);
        return new Route(Collections.emptyList());
    }

}
