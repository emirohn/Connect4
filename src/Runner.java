import java.util.Scanner;

public class Runner {
    public static void main (String[] args){

        System.out.println("Note: there are 8 columns, numbered 0 through 7");

        Scanner sc = new Scanner(System.in);
        Human h = new Human("Emi", "X");
        Computer c = new Computer("O");
        Board b = new Board();

        while(!b.checkWin("  [ O ]  ") && !b.checkWin("  [ X ]  ")){
            boolean legalRow = false;
            boolean legalCol = false;
            int moveRow = 7;
            int moveCol = -1;

            while(!legalCol){
                System.out.println("Enter column to move: ");
                if(sc.hasNextInt()){
                    moveCol = sc.nextInt();
                    legalCol = true;

                    if(moveCol >=7 || moveCol <= 0){
                        legalCol = false;
                        System.out.println("Enger a legal column!");
                    }

                }else{
                    System.out.println("Enger a legal column!");
                    sc.next();
                }

                for(int i = 0; i < 8; i++){
                    if(b.board[i][moveCol].equals("  [   ]  ")) {
                        moveRow = i;
                    }
                }

                if(legalCol){
                    b.makeMove(moveRow, moveCol, h.token);
                }
            }

            legalRow = false;
            legalCol = false;
            while(!legalCol && !legalRow){
                //get move from method
                int[] cMove = c.determineMove(b);
                //make move the one on bottom
                moveCol = cMove[1];
                for(int i = 0; i < 8; i++){
                    if(b.board[i][moveCol].equals("  [   ]  ")) {
                        cMove[0] = i;
                    }
                    //see if move is already occupied
                }
                if(b.board[cMove[0]][cMove[1]].equals("  [   ]  ")){
                    b.makeMove(cMove[0],cMove[1], c.token);
                    legalRow = true;
                    legalCol = true;
                }
            }

            b.printBoard();

            b.checkWin("  [ X ]  ");
            b.checkWin("  [ O ]  ");

        }
        if(b.checkWin("  [ X ]  ") == true){
            System.out.print("Game Over! Human wins.");
        }else{
            System.out.print("Game Over! Computer wins");
        }

    }
}
