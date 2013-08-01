package com.game;


public class Field {

    private static final char DEFAULT_CELL_VALUE = ' ';

    private static final int DEFAULT_FIELD_SIZE = 3;

    private int fieldSize;

    public char[][] fields;

    public Field () {
        this(DEFAULT_FIELD_SIZE);

    }

    public Field (int size) {
        fieldSize = size;
        fields = new char[fieldSize][fieldSize];

     }


    public int getFieldSize() {
        return fieldSize;
    }

    public void eriseCell() {
        for (int i = 0; i < fieldSize; i++ ) {
            eriseLineNumber(i);

        }

    }

    public void showFields() {
        System.out.println();
        for (int i = 0; i < fieldSize; i++ ) {
            showLine(i);
            System.out.println();

        }

        System.out.println();

    }

    private void eriseLineNumber (int lineNumber) {
        for (int i = 0; i < fieldSize; i++)
            fields [i][lineNumber] = DEFAULT_CELL_VALUE;
    }

    private void showLine (int lineCell) {
        for (int i = 0; i < fieldSize; i++) {
            showCell(i, lineCell);

        }

    }

    private void showCell(int x, int y) {
        System.out.print("[" + fields[x][y] + "]");

    }

}
