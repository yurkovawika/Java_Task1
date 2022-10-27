package Lesson3;

import java.util.Arrays;

public class HorseSteps {
    public static int n = 5;
    public static int count = 0;
    public static int[][] moves = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, -2}, {-1, 2}, {-1, -2}, {1, 2}};

    public static void main(String[] args) {
        int[][] board = new int[n][n];
        int pos = 1;
        stepHorse(board, 0, 0, pos);// row и col позиция  на которой стоит конь

    }

    private static boolean isLimit(int row, int col, int[][] board) {
        if (row < 0 || col < 0 || row >= n || col >= n || board[row][col] != 0) {
            return false;
        }
        return true;
    }

    private static void print(int[][] boards) {
        for (var b : boards) {
            System.out.println(Arrays.toString(b));
        }
        System.out.println();
    }

    public static void stepHorse(int[][] boards, int row, int col, int step) {
        boards[row][col] = step;

        if (step >= n * n) {
            count++;
            System.out.println("Вариант №" + count);
            print(boards);
            boards[row][col] = 0;
            return;
        }
        for (int[] move : moves) {
            if (isLimit(row + move[0], col + move[1], boards)) {
                stepHorse(boards, row + move[0], col + move[1], step + 1);
            }
        }
        boards[row][col] = 0;

    }
}
