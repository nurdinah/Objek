public class Main {
    public static void main(String[] args) {
        //instance
        Worm player1 = new Worm();
        Worm player2 = new Worm();

        player1.username = "Nurdinah";
        player1.score = 500;
        player1.length = 3.5;

        player2.username = "Iqbal";
        player2.score = 200;
        player2.length = 1.5;

        player1.eatSnank();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);


    }
}
