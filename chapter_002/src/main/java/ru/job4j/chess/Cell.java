package ru.job4j.chess;

/**
 * Class Cell.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 03.08.17
 */
public class Cell {
    /**
     * horizontal of the ru.job4j.chess desk.
     */
    private int horizontal;
    /**
     * vertical of the ru.job4j.chess desk.
     */
    private char vertical;
    /**
     * Constructor.
     * @param horizontal horizontal ru.job4j.chess desk
     * @param vertical vertical ru.job4j.chess desk
     */
    public Cell(int horizontal, char vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
    /**
     * Get horizontal.
     * @return horizontal type int
     */
    public int getHorizontal() {
        return horizontal;
    }
    /**
     * Get vertical.
     * @return vertical type int
     */
    public char getVertical() {
        return vertical;
    }
}
