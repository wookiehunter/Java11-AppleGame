import com.stevengodson.Field;

public class Main {
    public static void main(String[] args) {
        Field f = new Field();
        String[] names = {"Granny Smith", "Cookies Best"};
        f.setupApples(names);
        f.a1.printDetails();
        f.a2.printDetails();
        f.detectCollision();
    }
}