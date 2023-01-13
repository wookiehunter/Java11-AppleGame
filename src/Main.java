import com.game.Apple;
import com.game.Field;

public class Main {
    public static void main(String[] args) {
        Field f = new Field();
        f.setupApples();
        System.out.println("Apple A1:");
        f.a1.printDetails();
        f.a1.getWeight();
        System.out.println("Apple A2:");
        f.a2.printDetails();
        f.a2.getWeight();
        f.detectCollision();
    }
}