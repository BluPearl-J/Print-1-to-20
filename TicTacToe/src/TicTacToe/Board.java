package TicTacToe;

public class Board {
    private char[][] gridDisplay;
    private static int size = 3;

    public Board() {

        this.gridDisplay = new char[SIZE][SIZE];
        this.size = size;
        initialize();
    }

    public void initialize() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++){
                grid[i][j] = ' ';
    }
    }

    public void display() {
        System.out.println("-----------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public boolean placeXAndZeros(int row, int col, char XAndZeros) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || grid[row][col] != ' ')
            return false;
        grid[row][col] = XAndZeros;
        return true;
    }

    public boolean checkWin(char symbol) {
        // Rows Columns
        for (int i = 0; i < SIZE; i++) {
            if ((grid[i][0] == XAndZeros && grid[i][1] ==XAndZeros && grid[i][2] == symbol) ||
                    (grid[0][i] == XAndZeros && grid[1][i] == XAndZeros && grid[2][i] == symbol))
                return true;
        }
        // Diagonals
        return (grid[0][0] == XAndZeros&& grid[1][1] == XAndZeros&& grid[2][2] == XAndZeros) ||
                (grid[0][2] ==XAndZeros && grid[1][1] == XAndZeros&& grid[2][0] == XAndZeros);
    }

    public boolean isFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (grid[i][j] == ' ')
                    return false;
        return true;
    }
}
