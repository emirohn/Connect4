public class Computer extends Player{

    public Computer(String token){
        super("Bit Bucket", token);
    }

    //Determines the best possible move for the computer
    public int[] determineMove(Board b) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                //If there are 3 in a row horizontally, tries for move on right
                if (col <= 4) {
                    if ((b.board[row][col].equals("  [ " + token + " ]  ")) && (b.board[row][col + 1].equals("  [ " + token + " ]  ")) && (b.board[row][col + 2].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col + 3};
                        return move;
                    }
                }

                //If there are 3 in a row horizontally, tries for move on left
                if (col <= 4) {
                    if ((b.board[row][+1].equals("  [ " + token + " ]  ")) && (b.board[row][col + 2].equals("  [ " + token + " ]  ")) && (b.board[row][col + 3].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col};
                        return move;
                    }
                }

                //If there are 3 in a row vertically, places tile in 4th slot
                if (row <= 4) {
                    if ((b.board[row+1][col].equals("  [ " + token + " ]  ")) && (b.board[row + 2][col].equals("  [ " + token + " ]  ")) && (b.board[row + 3][col].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col};
                        return move;
                    }
                }

                //If there are 2 in a row horizontally, tries for move on right
                if (col <= 5) {
                    if ((b.board[row][col].equals("  [ " + token + " ]  ")) && (b.board[row][col + 1].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col + 2};
                        return move;
                    }
                }

                //If there are 2 in a row horizontally, tries for move on left
                if (col <= 5) {
                    if ((b.board[row][+1].equals("  [ " + token + " ]  ")) && (b.board[row][col + 2].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col};
                        return move;
                    }
                }

                //If there are 2 in a row checks vertically, places tile in 3rd slot
                if (row <= 5) {
                    if ((b.board[row+1][col].equals("  [ " + token + " ]  ")) && (b.board[row + 2][col].equals("  [ " + token + " ]  "))) {
                        int[] move = {row, col};
                        return move;
                    }
                }

                //If there are no tiles grouped together, places tile on left
                if(col <=6){
                    if((b.board[row][col+1].equals("  [ " + token + " ]  "))){
                        int[] move = {row, col};
                        return move;
                    }

                }

                //If there are no tiles grouped together, places tile on right
                if(col >=1){
                    if((b.board[row][col-1].equals("  [ " + token + " ]  "))){
                        int[] move = {row, col};
                        return move;
                    }
                }
            }
        }
        //If none of the above conditions are matched, random spot is chosen
        int r = (int) (Math.random() * 8);
        int c = (int) (Math.random() * 8);

        int[] move = {r, c};

        return move;

    }


}
