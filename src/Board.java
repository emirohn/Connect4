public class Board {

    String[][] board;
    int r = 8;
    int h = 8;

    public Board(){
        String[][] b = new String[r][h];
        this.board = b;
        createNewBoard();
    }

    public void createNewBoard(){
        for(int row = 0; row < r; row++){
            for(int col = 0; col < h; col++){
                this.board[row][col] = "  [   ]  ";
            }
        }
    }

    public void printBoard(){
        for(int row = 0; row < r; row++){
            for(int col = 0; col < h; col++){
                System.out.print(board[row][col]);
            }
            System.out.println("");
        }
    }

    public void makeMove(int row, int column, String tile){
        board[row][column] = "  [ " + tile + " ]  ";
    }


    public boolean checkWin(String token) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                //Checks horizontally
                if (col <= 4) {
                    if ((board[row][col].equals(token)) && (board[row][col + 1].equals(token)) && (board[row][col + 2].equals(token)) && (board[row][col + 3].equals(token))) {
                        return true;
                    }
                }

                //Checks vertically
                if (row <= 4) {
                    if ((board[row][col].equals(token)) && (board[row + 1][col].equals(token)) && (board[row + 2][col].equals(token)) && (board[row + 3][col].equals(token))) {
                        return true;
                    }
                }


                //Checks diagonally, up from left to right
                if (col <= 4 && row <= 4) {
                    if ((board[row][col].equals(token)) && (board[row + 1][col + 1].equals(token)) && (board[row + 2][col + 2].equals(token)) && (board[row + 3][col + 3].equals(token))) {
                        return true;
                    }
                }

                //Chscks diagonally, down from left to right
                if(col<=4 && row>=3){
                    if((board[row][col].equals(token)) && (board[row - 1][col - 1].equals(token)) && (board[row - 2][col - 2].equals(token)) && (board[row - 3][col - 3].equals(token))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

