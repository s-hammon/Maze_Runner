package maze;

public enum Cell {
    PASS("  ", 0),
    WALL("\u2588\u2588", 1);

    private final String cell;
    private final int value;

    Cell(String cell, int value) {
        this.cell = cell;
        this.value = value;
    }

    public String getCell() {
        return cell;
    }

    public int getValue() {
        return value;
    }
}
