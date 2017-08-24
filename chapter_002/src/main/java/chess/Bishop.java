package chess;

/**
 * Class Bishop.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.08.17
 */
public class Bishop extends Figure {
    /**
     * Constructor.
     * @param position Cell type
     */
    public Bishop(Cell position) {
        super(position);
    }
    /**
     * Way passes Bishop.
     * @param dist distination of Cell
     * @return Cell[] array.
     * @throws ImpossiblleMoveException when try turn wrong way
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossiblleMoveException {
        int curHoris = this.occupaid().getHorizontal();
        char curVerticalChar = this.occupaid().getVertical();

        int horis = dist.getHorizontal();
        char vertChar = dist.getVertical();

        int curVertical = (int) curVerticalChar - 96;
        int vert = (int) vertChar - 96;

        Cell[] bishopWay = new Cell[horis];

        if (((horis + vert) == (curHoris + curVertical))
                || (Math.abs(horis - vert) == Math.abs(curHoris - curVertical))) {
            for (int i = 0; i < horis - 1; i++) {
                bishopWay[i] = new Cell(horis - i, (char) (vertChar - i));
            }
        } else {
            throw new ImpossiblleMoveException("Can't move bishop this way");
        }
        return bishopWay;
    }
    /**
     * Clone figure to new distination.
     * @param dist distination of Cell
     * @return Figure.
     */
    @Override
    public Figure clone(Cell dist) {
        return new Bishop(dist);
    }
}
