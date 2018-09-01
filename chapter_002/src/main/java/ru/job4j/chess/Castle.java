package ru.job4j.chess;

/**
 * Class Castle (Ладья).
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 25.08.17
 */
public class Castle extends Figure {
    /**
     * Constructor.
     * @param position Cell type
     */
    public Castle(Cell position) {
        super(position);
    }
    /**
     * Way passes Castle.
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

        int wayLength = horis + curHoris;

        Cell[] castleWay = new Cell[wayLength];

        if (curHoris == horis || curVerticalChar == vertChar) {
            for (int i = 0; i < wayLength; i++) {
                castleWay[i] = new Cell(horis, (char) (vertChar - i));
            }
        } else {
        throw new ImpossiblleMoveException("Can't move Castle this way");
    }
        return castleWay;
    }
    /**
     * Clone figure to new distination.
     * @param dist distination of Cell
     * @return Figure.
     */
    @Override
    public Figure clone(Cell dist) {
        return new Castle(dist);
    }

}
