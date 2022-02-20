package battleship;

import java.util.Arrays;

public class Board {
    private String[][] board;

    public Board() {
        //inicializing the board multidimensional array
        board = new String[11][11];

        //filling the whole board with "~ "
        for (String[] row : board) {
            Arrays.fill(row, "~ ");
        }

        //replacing "~ " from first row for numbers
        for (int i = 1; i < board[0].length; i++) {
            board[0][i] = Integer.toString(i) + " ";
        }

        //replacing "~ " from first column for letters
        char letter = 'A';
        for (int i = 1; i < board.length; i++) {
            board[i][0] = letter + " ";
            letter++;
        }

        //replacing top left corner with blank space
        board[0][0] = "  ";
    }

    public void printBoard() {
        for (String[] row : board) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
    //4 different methods for 4 different kinds of results the user might want to input.
    public void fillMiss(int x, int y) {
        board[x][y] = "M";
    }

    public void fillHit(int x, int y) {
        board[x][y] = "X";
    }

    public void fillShip(int x, int y) {
        board[x][y] = "O";
    }

    public void fillBlank(int x, int y) {
        board[x][y] = "~";
    }
}
