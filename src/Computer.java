public class Computer extends Player{

    public Computer(String token){
        super("Bit Bucket", token);
    }

    public int[] determineMove(){
        int row = (int )(Math.random() * 8);
        int col = (int )(Math.random() * 8);

        int[] move =  {row,col};

        return move;
    }
}
