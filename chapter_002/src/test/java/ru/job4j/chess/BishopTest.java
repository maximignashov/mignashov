package ru.job4j.chess;

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
     * Test Bishop move to right cell.
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
    /**
     * Test Bishop move to wrong cell.
     * @throws ImpossiblleMoveException when move to distination cell impossible.
     */
    @Test(expected = ImpossiblleMoveException.class)
    public void whenMoveToWrongCell() throws ImpossiblleMoveException {
        Board board = new Board();

        Cell c1 = new Cell(1, 'c');
        Cell e8 = new Cell(8, 'e');

        Figure figure = new Bishop(c1);
        board.placeFigureInCell(figure);

        assertThat(board.move(c1, e8), is(true));
    }
    /**
     * Test Bishop move to wrong cell.
     * @throws OccupiedMoveException when move to distination cell impossible.
     */
    @Test(expected = OccupiedMoveException.class)
    public void whenMoveToOccupiedCell() throws OccupiedMoveException {
        Board board = new Board();

        Cell c1 = new Cell(1, 'c');
        Cell d2 = new Cell(2, 'd');
        Cell e3 = new Cell(3, 'e');

        Figure firstFigure = new Bishop(c1);
        Figure secondFigure = new Bishop(d2);

        board.placeFigureInCell(firstFigure);
        board.placeFigureInCell(secondFigure);

        assertThat(board.move(c1, e3), is(true));
    }
    /**
     * Test Bishop wrong cell without figure move.
     * @throws FigureNotFoundException when move to distination cell impossible.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenMoveWithCellWithoutFigure() throws FigureNotFoundException {
        Board board = new Board();

        Cell c1 = new Cell(1, 'c');
        Cell d2 = new Cell(2, 'd');
        Cell e3 = new Cell(3, 'e');

        Figure figure = new Bishop(d2);

        board.placeFigureInCell(figure);

        assertThat(board.move(c1, e3), is(true));
    }
}
