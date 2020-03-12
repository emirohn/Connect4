public class Computer extends Player{

    public Computer(String token){
        super("Bit Bucket", token);
    }

    public int[] determineMove(Board b) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                //Checks horizontally for move on right
                if (col <= 4) {
                    if ((b.board[row][col].equals(token)) && (b.board[row][col + 1].equals(token)) && (b.board[row][col + 2].equals(token))) {
                        int[] move = {row, col + 3};
                        return move;
                    }
                }

                //Checks horizontally for move on left
                if (col <= 4) {
                    if ((b.board[row][+1].equals(token)) && (b.board[row][col + 2].equals(token)) && (b.board[row][col + 3].equals(token))) {
                        int[] move = {row, col};
                        return move;
                    }
                }

                //Checks vertically
                if (row <= 4) {
                    if ((b.board[row][col].equals(token)) && (b.board[row + 1][col].equals(token)) && (b.board[row + 2][col].equals(token))) {
                        int[] move = {row, col + 3};
                        return move;
                    }
                }
                }


            }
        int r = (int) (Math.random() * 8);
        int c = (int) (Math.random() * 8);

        int[] move = {r, c};

        return move;
        }



    }

}
