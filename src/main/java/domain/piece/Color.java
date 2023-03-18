package domain.piece;

public enum Color {

    BLACK, WHITE;

    public Color reverse() {
        if (this == BLACK) {
            return WHITE;
        }
        return BLACK;
    }

}
