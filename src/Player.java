public class Player {

    protected Board b = new Board();
    protected String name;
    protected String token;

    public Player(String name, String token) {
        this.name = name;
        this.token = token;
    }

    public void display() {
        b.printBoard();
    }

}

