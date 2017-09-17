package chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CastleTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 25.08.17
 */
public class CastleTest {
    /**
     * Test Castle move to right cell when vertical equal.
     */
    @Test
    public void whenMoveToRightCellVerticalEqual() {
        Board board = new Board();

        Cell a2 = new Cell(2, 'a');
        Cell a6 = new Cell(6, 'a');

        Figure figure = new Castle(a2);
        board.placeFigureInCell(figure);

        assertThat(board.move(a2, a6), is(true));
    }
    /**
     * Test Castle move to right cell when horizontal equal.
     */
    @Test
    public void whenMoveToRightCellHorizonalEqual() {
        Board board = new Board();

        Cell a1 = new Cell(1, 'a');
        Cell d1 = new Cell(1, 'd');

        Figure figure = new Castle(a1);
        board.placeFigureInCell(figure);

        assertThat(board.move(a1, d1), is(true));
    }
    /**
     * Test Castle move to wrong cell.
     * @throws ImpossiblleMoveException when impossible move figure
     */
    @Test(expected = ImpossiblleMoveException.class)
    public void whenMoveToWrongCell() throws ImpossiblleMoveException {
        Board board = new Board();

        Cell a1 = new Cell(1, 'a');
        Cell e2 = new Cell(2, 'e');

        Figure figure = new Castle(a1);
        board.placeFigureInCell(figure);

        assertThat(board.move(a1, e2), is(true));
    }
    /**
     * Test Castle move to occupaid cell.
     * @throws OccupiedMoveException when figure occupied
     */
    @Test(expected = OccupiedMoveException.class)
    public void whenMoveToOccupaidCell() throws OccupiedMoveException {
        Board board = new Board();

        Cell a1 = new Cell(1, 'a');
        Cell d1 = new Cell(1, 'd');
        Cell c1 = new Cell(1, 'c');

        Figure bishop = new Bishop(c1);
        Figure castle = new Castle(a1);

        board.placeFigureInCell(bishop);
        board.placeFigureInCell(castle);

        assertThat(board.move(a1, d1), is(true));
    }
    /**
     * Test Castle wrong cell without figure move.
     * @throws FigureNotFoundException when move to distination cell impossible.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenMoveWithCellWithoutFigure() throws FigureNotFoundException {
        Board board = new Board();

        Cell a1 = new Cell(1, 'a');
        Cell d2 = new Cell(2, 'd');
        Cell c3 = new Cell(1, 'c');

        Figure figure = new Castle(d2);

        board.placeFigureInCell(figure);

        assertThat(board.move(a1, c3), is(true));
    }
}
