package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int x = 0; x < board.length; x++) {
            if (board[row][x] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int x = 0; x < board.length; x++) {
            rsl[x] = board[x][x];
        }
        return rsl;
    }
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int x = 0; x < board.length; x++) {
            if (monoVertical(board, x) || monoHorizontal(board, x)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
