package ru.job4j.chess;

/**
 * Class Board.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.08.17
 */
public class Board {
    /**
     * Chess cells array.
     */
    private Cell[][] cells = new Cell[8][8];
    /**
     * Figures array.
     */
    private Figure[] figures = new Figure[32];
    /**
     * Counter for place figures.
     */
    private int counter = 0;
    /**
     * Constructor default.
     */
    public Board() {
        int index = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 97; j <= 104; j++) {
                cells[i - 1][index++] = new Cell(i, (char) j);
            }
            index = 0;
        }
    }
    /**
     * Move figure or not move.
     * @param dist distination to move
     * @param sourse current position of figure
     * @return true if no exception
     * @throws ImpossiblleMoveException throw when impossible to move figure
     * @throws OccupiedMoveException throw when have a figure on a way
     * @throws FigureNotFoundException throw when no figure in cell
     */
    public boolean move(Cell sourse, Cell dist) throws ImpossiblleMoveException, OccupiedMoveException,
            FigureNotFoundException {
        int currentFigure = isFigureInCell(sourse);
        if (currentFigure == -1) {
            throw new FigureNotFoundException("No figure in cell");
        }
        Cell[] way = figures[currentFigure].way(dist);
        int haveFigure;
        for (int i = way.length - 1; i >= 0; i--) {
            if (way[i] != null) {
                haveFigure = isFigureInCell(way[i]);
                if (haveFigure != -1) {
                    throw new OccupiedMoveException("Have a figure on a way");
                }
            }
        }
        figures[currentFigure] = figures[currentFigure].clone(dist);

        return true;
    }
    /**
     * isFigureInCell check current figure in Cell.
     * @param sourse current distination
     * @return int value current cell
     */
    protected int isFigureInCell(Cell sourse) {
        int currentCell = -1;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                Cell cellCurrent = figures[i].occupaid();
                if (cellCurrent.getVertical() == sourse.getVertical()
                        && cellCurrent.getHorizontal() == sourse.getHorizontal()) {
                    currentCell = i;
                    break;
                }
            }
        }
        return currentCell;
    }
    /**
     * getCell get cell value.
     * @param horisontal horizontal of ru.job4j.chess board value
     * @param vertical vertical of ru.job4j.chess board value
     * @return Cell
     */
    private Cell getCell(int horisontal, char vertical) {
        return cells[horisontal - 1][vertical - 97];
    }
    /**
     * Place figure in cell.
     * @param figure current figure
     */
    public void placeFigureInCell(Figure figure) {
        this.figures[this.counter++] = figure;
    }
}
