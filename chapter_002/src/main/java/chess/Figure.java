package chess;

/**
 * abstract Class Figure .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 03.08.17
 */
public abstract class Figure {
    /**
     * Cell position of figure.
     */
    private final Cell position;
    /**
     * Constructor.
     * @param position position on the Cell
     */
    public Figure(Cell position) {
        this.position = position;
    }
    /**
     * Figures way.
     * @param dist distination for move
     * @return Cell[] array of cell
     * @throws ImpossiblleMoveException when impossible to go to Cell
     */
    public abstract Cell[] way(Cell dist) throws ImpossiblleMoveException;
    /**
     * Clone figures to new cell.
     * @param dist distination for move
     * @return figures
     */
    public abstract Figure clone(Cell dist);
    /**
     * Get position.
     * @return position of Cell
     */
    public Cell occupaid() {
        return this.position;
    }
}
