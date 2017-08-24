package chess;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.08.17
 */
public class BishopTest {
    /**
     * Test Bishop move.
     */
    @Test
    public void whenMoveToRightCell() {
        Board board = new Board();

        Cell c1 = new Cell(1, 'c');
        Cell e3 = new Cell(3, 'e');

        Figure figure = new Bishop(c1);
        board.placeFigureInCell(figure);

        assertThat(board.move(c1, e3), is(true));
    }
}
