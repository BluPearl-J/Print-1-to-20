//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        System.out.print("Enter Player 1 name (X): ");
        Player p1 = new Player(scanner.nextLine(), 'X');
        System.out.print("Enter Player 2 name(O): ");
        Player p2 = new Player(scanner.nextLine(), 'O');

        Player currentPlayer = p1;
        boolean gameOn = true;

        board.display();

        while (gameOn) {
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row  0);
            int row = scanner.nextInt();


            if (board.placeXAndZero(row, col, currentPlayer.getEnum())) {
                board.display();
                if (board.checkWin(currentPlayer.getEnum())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    gameOn = false;
                } else if (board.isFull()) {
                    System.out.println("It's a draw!");
                    gameOn = false;
                } else {
                    currentPlayer = (currentPlayer == p1) ? p2 : p1;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

