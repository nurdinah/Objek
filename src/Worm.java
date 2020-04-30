public class Worm {

    //attribute
    String username;
    int score;
    double length;


    //behavior
    void eatSnank(){
        System.out.println("Nom... nom.. nom...");
    }

    void eatOthers(Worm worm){
        score += 500;
    }
}
