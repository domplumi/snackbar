package com.nispok.snackbar.enums;

public enum SnackbarType {

    /**
     * Snackbar with a single line
     */
    ONE_LINE(48, 48, 1),
    /**
     * Snackbar with two lines
     */
    TWO_LINES(48, 80, 2),
    /**
     * Snackbar with as many lines as you want
     */
    INFINITY_LINES(48, 816, 25);

    private int minHeight;
    private int maxHeight;
    private int maxLines;

    SnackbarType(int minHeight, int maxHeight, int maxLines) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.maxLines = maxLines;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLines() {
        return maxLines;
    }
}
